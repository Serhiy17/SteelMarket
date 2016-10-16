package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.MetalProfile;
import com.workbox.sd.repository.MetalProfileRepository;
import com.workbox.sd.service.MetalProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetalProfileServiceImpl implements MetalProfileService {

    @Autowired
    private MetalProfileRepository metalProfileRepository;

    @Override
    public void save(MetalProfile metalProfile) {
        metalProfileRepository.save(metalProfile);
    }

    @Override
    public List<MetalProfile> findAll() {
        return metalProfileRepository.findAll();
    }

    @Override
    public MetalProfile fintOne(int id) {
        return metalProfileRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        metalProfileRepository.delete(id);
    }
}
