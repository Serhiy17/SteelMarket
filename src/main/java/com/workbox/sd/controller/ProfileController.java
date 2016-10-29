package com.workbox.sd.controller;

import com.workbox.sd.entity.Profile;
import com.workbox.sd.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileService;


//    Rebar, LProfileEquilateral, LProfileNonEquilateral,
    //    IBeamAdded, IBeamAngle, IBeamCol, IBeamNorm, IBeamWide,
//    TBeamCol, TBeamWide, SquarePipe, RectangularPipe, CirclePipe,
//    ChanelAngle, ChanelBend, ChanelParalel

    @RequestMapping(value="/profileForAdmin", method= RequestMethod.GET)
    public String profilePage(Model model){
        model.addAttribute("profiles", profileService.findAllRebar());
        model.addAttribute("profiles", profileService.findAllLProfileEquilateral());
        model.addAttribute("profiles", profileService.findAllLProfileNonEquilateral());
        model.addAttribute("profiles", profileService.findAllIBeamAdded());
        model.addAttribute("profiles", profileService.findAllIBeamAngle());
        model.addAttribute("profiles", profileService.findAllIBeamCol());
        model.addAttribute("profiles", profileService.findAllIBeamNorm());
        model.addAttribute("profiles", profileService.findAllIBeamWide());
        model.addAttribute("profiles", profileService.findAllTBeamCol());
        model.addAttribute("profiles", profileService.findAllTBeamWide());
        model.addAttribute("profiles", profileService.findAllSquarePipe());
        model.addAttribute("profiles", profileService.findAllRectangularPipe());
        model.addAttribute("profiles", profileService.findAllCirclePipe());
        model.addAttribute("profiles", profileService.findAllChanelAngle());
        model.addAttribute("profiles", profileService.findAllChanelBend());
        model.addAttribute("profiles", profileService.findAllChanelParalel());
        return "profileForAdmin";
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

        return "redirect:/profileForAdmin";
    }


    @RequestMapping(value="/del/{id}", method=RequestMethod.GET)
    public String deleteProfile(@PathVariable String id){

        profileService.delete(Integer.parseInt(id));

        return "redirect:/profileForAdmin";
    }


    @RequestMapping(value="/updateAll/{id}", method=RequestMethod.GET)
    public String updateProfile(@PathVariable String id, Model model){

        Profile profile = profileService.findOne(Integer.parseInt(id));

        model.addAttribute("profileForUpdate", profile);

        return "updateProfileAll";
    }

    @RequestMapping(value = "/updateAll/saveUpdateProfile/{id}", method=RequestMethod.POST)
    public String update(@PathVariable String id, @RequestParam String newTypeOfProfile,
                         @RequestParam String newDimensions,
                         @RequestParam String newWeight,
                         @RequestParam String newLength,
                         @RequestParam String newPrice,
                         @RequestParam String newGost ){

        Profile profile = profileService.findOne(Integer.parseInt(id));

        profile.setTypeOfProfile(newTypeOfProfile);
        profile.setDimensions(newDimensions);
        profile.setWeight(Double.parseDouble(newWeight));
        profile.setLength(Double.parseDouble(newLength));
        profile.setPrice(Double.parseDouble(newPrice));
        profile.setGost(newGost);

        profileService.save(profile);

        return "redirect:/profileForAdmin";
    }


    @RequestMapping(value="/updatePrice/{id}", method=RequestMethod.GET)
    public String updateProfilePrice(@PathVariable String id, Model model){

        Profile profile = profileService.findOne(Integer.parseInt(id));

        model.addAttribute("profileForUpdatePrice", profile);

        return "updateProfilePrice";
    }

    @RequestMapping(value = "/updatePrice/saveUpdateProfilePrice/{id}", method=RequestMethod.POST)
    public String updatePrice(@PathVariable String id,
                         @RequestParam String newPrice){

        Profile profile = profileService.findOne(Integer.parseInt(id));

        profile.setPrice(Double.parseDouble(newPrice));

        profileService.save(profile);

        return "redirect:/profileForAdmin";
    }
}
