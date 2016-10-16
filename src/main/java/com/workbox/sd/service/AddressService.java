package com.workbox.sd.service;

import com.workbox.sd.entity.Address;

import java.util.List;

public interface AddressService {

    void save(Address address);

    List<Address> findAll();

    Address findOne(int id);

    void delete (int id);
}
