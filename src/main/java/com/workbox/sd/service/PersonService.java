package com.workbox.sd.service;

import com.workbox.sd.entity.Person;

import java.util.List;

public interface PersonService {

    void save(Person person);

    List<Person> findAll();

    Person findOne(int id);

    void delete(int id);
}
