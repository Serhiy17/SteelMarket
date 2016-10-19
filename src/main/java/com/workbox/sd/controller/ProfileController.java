package com.workbox.sd.controller;

import com.workbox.sd.entity.Profile;
import com.workbox.sd.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value="/profile", method= RequestMethod.GET)
    public String profilePage(Model model){
        model.addAttribute("profiles", profileService.findAll());
        return "profile";
    }

    @RequestMapping(value="/newProfile", method = RequestMethod.POST)
    public String saveProfile(@RequestParam String typeOfProfile,
                              @RequestParam String dimensions,
                              @RequestParam String weight,
                              @RequestParam String length,
                              @RequestParam String price,
                              @RequestParam String gost){

        profileService.save(new Profile(typeOfProfile, dimensions, Double.parseDouble(weight),
                                Double.parseDouble(length), Double.parseDouble(price), gost));

        return "redirect:/profile";
    }


/*    @RequestMapping(value="/del/{id}", method=RequestMethod.GET)
    public String deleteIngradient(@PathVariable String id){

        ingradientService.delete(Integer.parseInt(id));

        return "redirect:/ingradient";
    }


    @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
    public String updateIngradient(@PathVariable String id, Model model){

        Ingradient ingradient = ingradientService.findOne(Integer.parseInt(id));

        model.addAttribute("ingradientForUpdate", ingradient);

        return "updateIngradient";
    }

    @RequestMapping(value = "update/saveUpdateIngradient/{id}", method=RequestMethod.POST)
    public String update(@PathVariable String id, @RequestParam String newName,
                         @RequestParam String newAmount ){

        Ingradient ingradient = ingradientService.findOne(Integer.parseInt(id));

        ingradient.setName(newName);
        ingradient.setAmount(newAmount);

        ingradientService.save(ingradient);

        return "redirect:/ingradient";*/
/*    }*/
}
