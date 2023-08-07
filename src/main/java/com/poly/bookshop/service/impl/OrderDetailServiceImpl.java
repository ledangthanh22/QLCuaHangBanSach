package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.OrderDetail;
import com.poly.bookshop.repository.OrderDetailRepository;
import com.poly.bookshop.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail save(OrderDetail oderDetail) {
        return orderDetailRepository.save(oderDetail);
    }

    @Override
    public List<OrderDetail> getAll() {
        return orderDetailRepository.findAll();
    }
}
