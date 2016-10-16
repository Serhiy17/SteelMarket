package com.workbox.sd.service;

import com.workbox.sd.entity.MetalProfile;

import java.util.List;

public interface MetalProfileService {

    void save(MetalProfile metalProfile);

    List<MetalProfile> findAll();

    MetalProfile fintOne(int id);

    void delete(int id);
}
