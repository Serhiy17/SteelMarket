package com.workbox.sd.validator;

import com.workbox.sd.entity.Person;
import com.workbox.sd.service.PersonService;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

    private final PersonService personService;

    public PersonValidator(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(Person.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "", "email can't be empty");
        if(personService.findByEmail(person.getEmail()) != null) {
            errors.rejectValue("email", "", "email already exist");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "", "username can't be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surName", "", "surName can't be empty");
    }
}
