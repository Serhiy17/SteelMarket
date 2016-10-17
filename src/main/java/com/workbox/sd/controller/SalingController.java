package com.workbox.sd.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SalingController {
    @RequestMapping(value="/saling", method= RequestMethod.GET)
    public String personPage(Model model){

        return "signUp";
    }
}
