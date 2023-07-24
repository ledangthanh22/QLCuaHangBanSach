package com.poly.bookshop.service.impl;

import com.poly.bookshop.repository.NhaXuatBanRepository;
import com.poly.bookshop.service.NhaXuatBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhaXuatBanServiceImpl implements NhaXuatBanService {

    @Autowired
    private NhaXuatBanRepository nhaXuatBanRepository;
}
