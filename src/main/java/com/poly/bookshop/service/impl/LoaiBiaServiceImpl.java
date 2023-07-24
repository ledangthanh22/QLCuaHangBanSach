package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.LoaiBiaRepository;
import com.poly.bookshop.service.LoaiBiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiBiaServiceImpl implements LoaiBiaService {

    @Autowired
    private LoaiBiaRepository loaiBiaRepository;
}
