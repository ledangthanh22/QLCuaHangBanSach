package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Order;
import com.poly.bookshop.repository.OrderRepository;
import com.poly.bookshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order save(Order oder) {
        return orderRepository.save(oder);
    }

    @Override
    public Order update(Order oder) {
        return orderRepository.save(oder);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getByHoaDonCT(Long id) {
        return null;
    }
}
