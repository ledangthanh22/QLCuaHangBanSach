package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Shipping;
import com.poly.bookshop.repository.SippingRepository;
import com.poly.bookshop.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingServiceImpl implements ShippingService {

    @Autowired
    private SippingRepository sippingRepository;

    @Override
    public Shipping save(Shipping shipping) {
        return sippingRepository.save(shipping);
    }

    @Override
    public Shipping update(Shipping shipping) {
        return sippingRepository.save(shipping);
    }

    @Override
    public void delete(Long id) {
        sippingRepository.deleteById(id);
    }

    @Override
    public Shipping getOne(Long id) {
        return sippingRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Shipping> getAll() {
        return sippingRepository.findAll();
    }
}
