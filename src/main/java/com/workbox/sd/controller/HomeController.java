package com.workbox.sd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model){
        return "home";
    }

    @RequestMapping(value = "/delivery")
    public String delivery(){return  "delivery";}

    @RequestMapping(value = "/aboutUs")
    public String aboutUs(){return  "aboutUs";}

    @RequestMapping(value = "/contacts")
    public String contacts(){return  "contacts";}
}
