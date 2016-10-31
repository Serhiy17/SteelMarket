package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Person;
import com.workbox.sd.entity.Role;
import com.workbox.sd.repository.PersonRepository;
import com.workbox.sd.service.PersonService;
import org.apache.commons.io.FileUtils;
import org.aspectj.bridge.IMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
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

    @Override
    public void saveImage(Principal principal, MultipartFile multipartFile){

        Person person = personRepository.findOne(Integer.parseInt(principal.getName()));

        String path = System.getProperty("catalina.home")+"/resources/"+
                person.getOriginUsername() + "/" + "avatar.igp";

        person.setPathImage("resources/" + person.getOriginUsername() + "/" + multipartFile.getOriginalFilename());

        File file = new File(path);

        try {
            file.mkdirs();

            try {
                FileUtils.cleanDirectory(new File(System.getProperty("catalina.home") + "/resources/" + person.getOriginUsername() + "/"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileUtils.cleanDirectory(new File(System.getProperty("catalina.home") + "/resources/" + person.getOriginUsername() + "/"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            multipartFile.transferTo(file);
        }catch(IOException e){
            System.out.println("error with file");
        }
        personRepository.save(person);
    }
}
