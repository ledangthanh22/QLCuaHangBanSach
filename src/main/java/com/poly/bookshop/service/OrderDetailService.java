package com.poly.bookshop.service;

import com.poly.bookshop.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {

    OrderDetail save(OrderDetail oderDetail);

    List<OrderDetail> getAll();
}
