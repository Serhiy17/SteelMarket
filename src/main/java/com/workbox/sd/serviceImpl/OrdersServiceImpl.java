package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Orders;
import com.workbox.sd.repository.OrdersRepository;
import com.workbox.sd.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public void save(Orders orders) {
        ordersRepository.save(orders);
    }

    @Override
    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders findOne(int id) {
        return ordersRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        ordersRepository.delete(id);
    }
}
