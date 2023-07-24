package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.NhanVienRepository;
import com.poly.bookshop.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;
}
