package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.PTVanChuyen;
import com.poly.bookshop.repository.PTVanChuyenRepository;
import com.poly.bookshop.service.PTVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PTVanChuyenServiceImpl implements PTVanChuyenService {

    @Autowired
    private PTVanChuyenRepository vanChuyenRepository;

    @Override
    public PTVanChuyen save(PTVanChuyen vanChuyen) {
        return vanChuyenRepository.save(vanChuyen);
    }

    @Override
    public PTVanChuyen update(PTVanChuyen vanChuyen) {
        return vanChuyenRepository.save(vanChuyen);
    }

    @Override
    public void delete(Long id) {
        vanChuyenRepository.deleteById(id);
    }

    @Override
    public PTVanChuyen getOne(Long id) {
        return vanChuyenRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<PTVanChuyen> getAll() {
        return vanChuyenRepository.findAll();
    }
}
