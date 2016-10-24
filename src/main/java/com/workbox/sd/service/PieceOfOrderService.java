package com.workbox.sd.service;

import com.workbox.sd.entity.PieceOfOrder;

import java.util.List;

public interface PieceOfOrderService {

    void save(PieceOfOrder pieceOfOrder);

    List<PieceOfOrder> findAll();

    PieceOfOrder findOne(int id);

    void delete(int id);
}
