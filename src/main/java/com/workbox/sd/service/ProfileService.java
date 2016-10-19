package com.workbox.sd.service;

import com.workbox.sd.entity.Profile;

import java.util.List;

public interface ProfileService {

    void save(Profile profile);

    List<Profile> findAll();

    Profile fintOne(int id);

    void delete(int id);
}
