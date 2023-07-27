package com.poly.bookshop.service;

import com.poly.bookshop.entity.Shipping;

import java.util.List;

public interface ShippingService {

    Shipping save(Shipping shipping);

    Shipping update(Shipping shipping);

    void delete(Long id);

    Shipping getOne(Long id);

    List<Shipping> getAll();
}
