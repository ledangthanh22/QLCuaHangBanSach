package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.HoaDonRepository;
import com.poly.bookshop.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonServiceImpl implements HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;
}
