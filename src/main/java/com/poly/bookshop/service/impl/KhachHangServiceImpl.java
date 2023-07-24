package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.KhachHangRepository;
import com.poly.bookshop.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;
}
