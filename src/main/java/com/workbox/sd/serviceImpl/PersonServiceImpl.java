package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Person;
import com.workbox.sd.repository.PersonRepository;
import com.workbox.sd.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findOne(int id) {
        return personRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        personRepository.delete(id);
    }
}
