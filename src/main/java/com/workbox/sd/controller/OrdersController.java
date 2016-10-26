package com.workbox.sd.controller;

import com.workbox.sd.entity.Orders;
import com.workbox.sd.entity.Person;
import com.workbox.sd.entity.PieceOfOrder;
import com.workbox.sd.entity.Profile;
import com.workbox.sd.service.OrdersService;
import com.workbox.sd.service.PieceOfOrderService;
import com.workbox.sd.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    private PieceOfOrderService pieceOfOrderService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String newOrdersPage(Model model){
        model.addAttribute("orders", new PieceOfOrder());
        model.addAttribute("profiles", profileService.findAll());
        return "orders";
    }

    @RequestMapping(value="/newOrders", method = RequestMethod.POST)
    public String newOrders(@ModelAttribute PieceOfOrder pieceOfOrder,
                            @RequestParam String[] choosenProfile){
        Profile profile = null;
        for(int i=0; i<choosenProfile.length; i++){
            profile = profileService.findOne(Integer.parseInt(choosenProfile[i]));
        }

        pieceOfOrder.setProfile(profile);

        pieceOfOrderService.save(pieceOfOrder);

        return "redirect:/orders";
    }
}
