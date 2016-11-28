package com.workbox.sd.validator;

import com.workbox.sd.entity.Profile;
import com.workbox.sd.service.ProfileService;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProfileValidator implements Validator{

    private final ProfileService profileService;

    public ProfileValidator(ProfileService profileService) {
        this.profileService = profileService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(Profile.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Profile profile = (Profile) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "typeOfProfile", "", "type of profile can't be empty");
        if(profileService.findByTypeOfProfile(profile.getTypeOfProfile()) != null) {
            errors.rejectValue("typeOfProfile", "", "type of profile already exist");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dimensions", "", "dimensions can't be empty");
        if(profileService.findByDimensions(profile.getDimensions()) != null) {
            errors.rejectValue("dimensions", "", "dimensions exist");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "weight", "", "weight can't be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "length", "", "length can't be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gost", "", "gost can't be empty");
    }
}
