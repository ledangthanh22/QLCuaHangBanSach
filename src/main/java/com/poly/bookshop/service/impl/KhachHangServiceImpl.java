package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.KhachHang;
import com.poly.bookshop.repository.KhachHangRepository;
import com.poly.bookshop.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public KhachHang save(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang update(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public void delete(Long id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang getOne(Long id) {
        return khachHangRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }
}
