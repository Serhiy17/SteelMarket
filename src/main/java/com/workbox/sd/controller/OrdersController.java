package com.workbox.sd.controller;

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

@Controller
public class OrdersController {

    @Autowired
    private PieceOfOrderService pieceOfOrderService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private ProfileService profileService;

//    Rebar, LProfileEquilateral, LProfileNonEquilateral,
//    IBeamAdded, IBeamAngle, IBeamCol, IBeamNorm, IBeamWide,
//    TBeamCol, TBeamWide, SquarePipe, RectangularPipe, CirclePipe,
//    ChanelAngle, ChanelBend, ChanelParalel

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String newOrdersPage(Model model){
        model.addAttribute("orders", new PieceOfOrder());
        model.addAttribute("profilesRebar", profileService.findByType("Rebar"));
        model.addAttribute("profilesLProfileEquilateral", profileService.findByType("LProfileEquilateral"));
        model.addAttribute("profilesLProfileNonEquilateral", profileService.findByType("LProfileNonEquilateral"));
        model.addAttribute("profilesIBeamAdded", profileService.findByType("IBeamAdded"));
        model.addAttribute("profilesIBeamAngle", profileService.findByType("IBeamAngle"));
        model.addAttribute("profilesIBeamCol", profileService.findByType("IBeamCol"));
        model.addAttribute("profilesIBeamNorm", profileService.findByType("IBeamNorm"));
        model.addAttribute("profilesIBeamWide", profileService.findByType("IBeamWide"));
        model.addAttribute("profilesTBeamCol", profileService.findByType("TBeamCol"));
        model.addAttribute("profilesTBeamWide", profileService.findByType("TBeamWide"));
        model.addAttribute("profilesSquarePipe", profileService.findByType("SquarePipe"));
        model.addAttribute("profilesRectangularPipe", profileService.findByType("RectangularPipe"));
        model.addAttribute("profilesCirclePipe", profileService.findByType("CirclePipe"));
        model.addAttribute("profilesChanelAngle", profileService.findByType("ChanelAngle"));
        model.addAttribute("profilesChanelBend", profileService.findByType("ChanelBend"));
        model.addAttribute("profilesChanelParalel", profileService.findByType("ChanelParalel"));

        return "views-base-orders";
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
