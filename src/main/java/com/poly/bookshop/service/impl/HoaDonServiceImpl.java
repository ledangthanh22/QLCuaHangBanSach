package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.HoaDon;
import com.poly.bookshop.repository.HoaDonRepository;
import com.poly.bookshop.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonServiceImpl implements HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Override
    public HoaDon save(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public HoaDon update(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDon getByHoaDonCT(Long id) {
        return null;
    }
}
