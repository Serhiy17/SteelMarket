package com.workbox.sd.repository;

import com.workbox.sd.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Serhiy on 16.10.2016.
 */
public interface OrdersRepository  extends JpaRepository<Orders, Integer>{
}
