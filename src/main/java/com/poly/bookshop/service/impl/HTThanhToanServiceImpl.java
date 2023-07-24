package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.HTThanhToanRepository;
import com.poly.bookshop.service.HTThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HTThanhToanServiceImpl implements HTThanhToanService {

    @Autowired
    private HTThanhToanRepository thanhToanRepository;

}
