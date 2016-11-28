package com.workbox.sd.controller;

import com.workbox.sd.entity.Person;
import com.workbox.sd.service.PersonService;
import com.workbox.sd.validator.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.setValidator(new PersonValidator(personService));
    }

    @RequestMapping(value="/registration", method= RequestMethod.GET)
    public String newPersonPage(Model model){
        model.addAttribute("person", new Person());
        return "views-base-registration";
    }

    @RequestMapping(value="/newPerson", method = RequestMethod.POST)
    public String newPerson(@ModelAttribute @Valid Person person, @RequestParam String username,
                            BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "views-base-registration";
        }

        person.setUserame(username);
        personService.save(person);

        return "redirect:/";
    }

    @RequestMapping(value="/loginpage", method=RequestMethod.GET)
    public String login(){
        return "views-base-loginpage";
    }

    @RequestMapping(value="/logout", method=RequestMethod.POST)
    public String logout(){
        return "redirect:/";
    }

    @RequestMapping(value="/home", method=RequestMethod.POST)
    public String home(){
        return "redirect:/";
    }

    @RequestMapping(value = "/saveImage", method = RequestMethod.POST)
    public String saveImage(Principal principal, @RequestParam MultipartFile image){
        personService.saveImage(principal, image);
        return "views-base-registration";
    }
    @RequestMapping(value="/loginprocesing", method=RequestMethod.POST)
    public String loginprocesing(){
        return "redirect:/home";
    }

    @RequestMapping(value="/getOrder", method=RequestMethod.GET)
    public String getOrder(Principal principal){

        Person person = personService.findOne(Integer.parseInt(principal.getName()));

        System.out.println(person);
        return "redirect:/";
    }
}
