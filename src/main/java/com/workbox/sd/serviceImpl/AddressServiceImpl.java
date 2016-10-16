package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Address;
import com.workbox.sd.repository.AddressRepository;
import com.workbox.sd.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository adderssRepository;

    @Override
    public void save(Address address) {
        adderssRepository.save(address);
    }

    @Override
    public List<Address> findAll() {
        return adderssRepository.findAll();
    }

    @Override
    public Address findOne(int id) {
        return adderssRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        adderssRepository.delete(id);
    }
}
