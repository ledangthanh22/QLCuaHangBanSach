package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.LoaiSach;
import com.poly.bookshop.repository.LoaiSachRepository;
import com.poly.bookshop.service.LoaiSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSachServiceImpl implements LoaiSachService {

    @Autowired
    private LoaiSachRepository loaiSachRepository;

    @Override
    public LoaiSach save(LoaiSach loaiSach) {
        return loaiSachRepository.save(loaiSach);
    }

    @Override
    public LoaiSach update(LoaiSach loaiSach) {
        return loaiSachRepository.save(loaiSach);
    }

    @Override
    public void delete(Long id) {
         loaiSachRepository.deleteById(id);
    }

    @Override
    public LoaiSach getOne(Long id) {
        return loaiSachRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<LoaiSach> getAll() {
        return loaiSachRepository.findAll();
    }
}
