package com.poly.bookshop.service;

import com.poly.bookshop.entity.Shipper;

import java.util.List;

public interface ShipperService {

    Shipper save(Shipper shipper);

    Shipper update(Shipper shipper);

    void delete(Long id);

    Shipper getOne(Long id);

    List<Shipper> getAll();
}
