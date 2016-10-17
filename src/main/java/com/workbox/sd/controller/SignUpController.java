package com.workbox.sd.controller;

import com.workbox.sd.entity.Person;
import com.workbox.sd.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SignUpController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value="/signUp", method=RequestMethod.GET)
    public String personPage(Model model){
//      model.addAttribute("persons", personService.findAll());
        return "signUp";
    }

    @RequestMapping(value="/checkPerson", method = RequestMethod.POST)
    public String checkPerson(@RequestParam String email,
                              @RequestParam String password){
        Person person = new Person(null, null, email, password);

        List<Person> list = personService.findAll();

        String nextPage = "/";

        for (Person p : list) {
            if( (p.getEmail().equals("sd.workbox@gmail.com")) && (p.getPassword().equals("260462")) ){
                nextPage = "/admin";
            }
        }

        for (Person p : list) {
            if( (p.getEmail().equals(person.getEmail())) && (p.getPassword().equals(person.getPassword())) ){
                nextPage = "/saling";
            }else{
                nextPage = "/registration";
            }
        }

        return nextPage;
    }
}

