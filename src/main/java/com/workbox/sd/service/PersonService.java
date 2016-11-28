package com.workbox.sd.service;

import com.workbox.sd.entity.Person;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;

public interface PersonService {

    void save(Person person);

    List<Person> findAll();

    Person findOne(int id);

    void delete(int id);

    Person findByUsername(String username);

    Person findBySurName(String surName);

    Person findByEmail(String email);

    void saveImage (Principal principal, MultipartFile multipartFile);

}
