package com.workbox.sd.service;

import com.workbox.sd.entity.Orders;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface OrdersService {

    void save(Orders orders);

    List<Orders> findAll();

    Orders findOne(int id);

    void delete(int id);

    Cookie intoBasket(int id, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
}

