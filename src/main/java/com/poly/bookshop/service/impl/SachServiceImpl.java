package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.SachRepository;
import com.poly.bookshop.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SachServiceImpl implements SachService {

    @Autowired
    private SachRepository sachRepository;
}
