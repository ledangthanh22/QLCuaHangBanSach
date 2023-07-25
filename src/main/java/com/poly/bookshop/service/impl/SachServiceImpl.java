package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Sach;
import com.poly.bookshop.repository.SachRepository;
import com.poly.bookshop.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachServiceImpl implements SachService {

    @Autowired
    private SachRepository sachRepository;

    @Override
    public Sach save(Sach sach) {
        return sachRepository.save(sach);
    }

    @Override
    public Sach update(Sach sach) {
        return sachRepository.save(sach);
    }

    @Override
    public void delete(Long id) {
        sachRepository.deleteById(id);
    }

    @Override
    public Sach getOne(Long id) {
        return sachRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Sach> getAll() {
        return sachRepository.findAll();
    }
}
