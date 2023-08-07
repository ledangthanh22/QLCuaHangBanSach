package com.poly.bookshop.service;

import com.poly.bookshop.entity.Order;

import java.util.List;

public interface OrderService {

    Order save(Order oder);

    Order update(Order oder);

    List<Order> getAll();

    Order getByHoaDonCT(Long id);
}
