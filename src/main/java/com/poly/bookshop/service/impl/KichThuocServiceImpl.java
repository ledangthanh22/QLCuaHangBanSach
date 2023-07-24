package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.KichThuocRepository;
import com.poly.bookshop.service.KichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KichThuocServiceImpl implements KichThuocService {

    @Autowired
    private KichThuocRepository kichThuocRepository;
}
