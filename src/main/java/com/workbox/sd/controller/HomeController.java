package com.workbox.sd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = {"/","/home"}, method= RequestMethod.GET)
    public String home(Model model){
        return "views-base-home";
    }

    @RequestMapping(value = "/profileForUser", method=RequestMethod.GET)
    public String profileForUser(){return "views-base-profileForUser";}

    @RequestMapping(value = "/delivery", method=RequestMethod.GET)
    public String delivery(){return "views-base-delivery";}

    @RequestMapping(value = "/aboutUs", method=RequestMethod.GET)
    public String aboutUs(){return "views-base-aboutUs";}

    @RequestMapping(value = "/contacts", method=RequestMethod.GET)
    public String contacts(){return "views-base-contacts";}
}
