package com.workbox.sd.service;

import com.workbox.sd.entity.Orders;

import java.util.List;

public interface OrdersService {

    void save(Orders orders);

    List<Orders> findAll();

    Orders findOne(int id);

    void delete(int id);


}
