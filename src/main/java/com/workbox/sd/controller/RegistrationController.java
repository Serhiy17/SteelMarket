package com.workbox.sd.controller;

import com.workbox.sd.entity.Person;
import com.workbox.sd.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value="/registration", method= RequestMethod.GET)
    public String newPersonPage(Model model){
        model.addAttribute("person", new Person());
        return "registration";
    }

    @RequestMapping(value="/newPerson", method = RequestMethod.POST)
    public String newPerson(@ModelAttribute Person person){

        personService.save(person);

        return "/home";
    }
}
