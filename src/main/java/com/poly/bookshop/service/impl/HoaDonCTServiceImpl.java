package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.HoaDonCTRepository;
import com.poly.bookshop.service.HoaDonCTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonCTServiceImpl implements HoaDonCTService {

    @Autowired
    private HoaDonCTRepository hoaDonCTRepository;
}
