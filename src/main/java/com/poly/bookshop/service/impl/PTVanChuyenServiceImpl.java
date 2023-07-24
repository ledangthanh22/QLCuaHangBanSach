package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.PTVanChuyenRepository;
import com.poly.bookshop.service.PTVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PTVanChuyenServiceImpl implements PTVanChuyenService {

    @Autowired
    private PTVanChuyenRepository vanChuyenRepository;

}
