package com.workbox.sd.repository;

import com.workbox.sd.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer>{

    Person findByUsername(String username);

}
