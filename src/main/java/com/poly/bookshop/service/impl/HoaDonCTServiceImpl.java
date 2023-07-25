package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.HoaDonCT;
import com.poly.bookshop.repository.HoaDonCTRepository;
import com.poly.bookshop.service.HoaDonCTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonCTServiceImpl implements HoaDonCTService {

    @Autowired
    private HoaDonCTRepository hoaDonCTRepository;

    @Override
    public HoaDonCT save(HoaDonCT hoaDonCT) {
        return hoaDonCTRepository.save(hoaDonCT);
    }

    @Override
    public List<HoaDonCT> getAll() {
        return hoaDonCTRepository.findAll();
    }
}
