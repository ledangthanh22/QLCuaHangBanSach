package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Shipper;
import com.poly.bookshop.repository.ShipperRepository;
import com.poly.bookshop.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipperServiceImpl implements ShipperService {

    @Autowired
    private ShipperRepository shipperRepository;

    @Override
    public Shipper save(Shipper shippeer) {
        return shipperRepository.save(shippeer);
    }

    @Override
    public Shipper update(Shipper shippeer) {
        return shipperRepository.save(shippeer);
    }

    @Override
    public void delete(Long id) {
        shipperRepository.deleteById(id);
    }

    @Override
    public Shipper getOne(Long id) {
        return shipperRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Shipper> getAll() {
        return shipperRepository.findAll();
    }
}
