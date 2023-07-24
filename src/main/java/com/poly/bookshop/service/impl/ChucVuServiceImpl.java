package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.ChucVuRepository;
import com.poly.bookshop.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChucVuServiceImpl implements ChucVuService {

    @Autowired
    private ChucVuRepository chucVuRepository;
}
