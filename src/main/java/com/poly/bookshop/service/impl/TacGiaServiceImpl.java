package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.TacGia;
import com.poly.bookshop.repository.TacGiaRepository;
import com.poly.bookshop.service.TacGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacGiaServiceImpl implements TacGiaService {

    @Autowired
    private TacGiaRepository tacGiaRepository;

    @Override
    public TacGia save(TacGia tacGia) {
        return tacGiaRepository.save(tacGia);
    }

    @Override
    public TacGia update(TacGia tacGia) {
        return tacGiaRepository.save(tacGia);
    }

    @Override
    public void delete(Long id) {
        tacGiaRepository.deleteById(id);
    }

    @Override
    public TacGia getOne(Long id) {
        return tacGiaRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<TacGia> getAll() {
        return tacGiaRepository.findAll();
    }
}
