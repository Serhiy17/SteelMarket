package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Profile;
import com.workbox.sd.repository.ProfileRepository;
import com.workbox.sd.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public void save(Profile profile) {
        profileRepository.save(profile);
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    public Profile findOne(int id) {
        return profileRepository.findOne(id);
    }

    public void delete(int id) {
        profileRepository.delete(id);
    }

    @Override
    public List<Profile> findByType(String type) {
        return profileRepository.findAllByType(type);
    }

    @Override
    public Profile findByTypeOfProfile(String typeOfProfile){
        return profileRepository.findByTypeOfProfile(typeOfProfile);
    }

    @Override
    public Profile findByDimensions(String dimensions){
        return profileRepository.findByDimensions(dimensions);
    }

    @Override
    public Profile findByWeight(double weight){
        return profileRepository.findByWeight(weight);
    }

    @Override
    public Profile findByLength(double length){
        return profileRepository.findByLength(length);
    }

    @Override
    public Profile findByGost(String gost){
        return profileRepository.findByGost(gost);
    }

}
