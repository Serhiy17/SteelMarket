package com.workbox.sd.controller;

import com.workbox.sd.entity.Person;
import com.workbox.sd.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value="/registration", method= RequestMethod.GET)
    public String newPersonPage(Model model){
        return "registration";
    }

    @RequestMapping(value="/newPerson", method = RequestMethod.POST)
    public String addPerson(@RequestParam String name,
                              @RequestParam String surName,
                              @RequestParam String email,
                              @RequestParam String password){

        personService.save(new Person(name, surName, email, password));

        return "saling";
    }
}
