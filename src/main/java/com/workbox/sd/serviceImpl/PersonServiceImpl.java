package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Person;
import com.workbox.sd.entity.Role;
import com.workbox.sd.repository.PersonRepository;
import com.workbox.sd.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class PersonServiceImpl implements PersonService, UserDetailsService{

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;



    @Override
    public void save(Person person) {
        person.setRole(Role.ROLE_USER);
        person.setPassword(encoder.encode(person.getPassword()));
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return personRepository.findByUsername(username);
    }
}
