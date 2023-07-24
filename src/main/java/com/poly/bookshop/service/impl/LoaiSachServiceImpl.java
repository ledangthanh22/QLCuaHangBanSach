package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.LoaiSachRepository;
import com.poly.bookshop.service.LoaiSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiSachServiceImpl implements LoaiSachService {

    @Autowired
    private LoaiSachRepository loaiSachRepository;
}
