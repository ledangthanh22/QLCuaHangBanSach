package com.poly.bookshop.service;

import com.poly.bookshop.entity.Shipper;

import java.util.List;

public interface ShipperService {

    Shipper save(Shipper shippeer);

    Shipper update(Shipper shippeer);

    void delete(Long id);

    Shipper getOne(Long id);

    List<Shipper> getAll();
}
