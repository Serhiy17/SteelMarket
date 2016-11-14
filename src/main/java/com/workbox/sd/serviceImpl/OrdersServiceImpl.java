package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.Orders;
import com.workbox.sd.entity.Profile;
import com.workbox.sd.repository.OrdersRepository;
import com.workbox.sd.repository.ProfileRepository;
import com.workbox.sd.service.OrdersService;
import com.workbox.sd.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private ProfileRepository profileRepository;


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

    @Override
    public Cookie intoBasket(int id, HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse) {

        httpServletRequest.getSession(false);

        Profile profile = profileRepository.findOne(id);

        Cookie cookie = new Cookie(profile.getTypeOfProfile(), String.valueOf(profile.getId()));
        cookie.setMaxAge(24*60*60*60);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        return cookie;
    }
}
