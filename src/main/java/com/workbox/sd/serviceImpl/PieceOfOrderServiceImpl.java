package com.workbox.sd.serviceImpl;

import com.workbox.sd.entity.PieceOfOrder;
import com.workbox.sd.repository.PieceOfOrderRepository;
import com.workbox.sd.service.PieceOfOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PieceOfOrderServiceImpl implements PieceOfOrderService {

    @Autowired
    private PieceOfOrderRepository pieceOfOrderRepository;

    @Override
    public void save(PieceOfOrder pieceOfOrder) {
        pieceOfOrderRepository.save(pieceOfOrder);
    }

    @Override
    public List<PieceOfOrder> findAll() {
        return pieceOfOrderRepository.findAll();
    }

    @Override
    public PieceOfOrder findOne(int id) {
        return pieceOfOrderRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        pieceOfOrderRepository.delete(id);
    }
}
