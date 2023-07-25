package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.BiaSach;
import com.poly.bookshop.repository.BiaSachRepository;
import com.poly.bookshop.service.BiaSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiaSachServiceImpl implements BiaSachService {

    @Autowired
    private BiaSachRepository loaiBiaRepository;

    @Override
    public BiaSach save(BiaSach loaiBia) {
        return loaiBiaRepository.save(loaiBia);
    }

    @Override
    public BiaSach update(BiaSach loaiBia) {
        return loaiBiaRepository.save(loaiBia);
    }

    @Override
    public void delete(Long id) {
         loaiBiaRepository.deleteById(id);
    }

    @Override
    public BiaSach getOne(Long id) {
        return loaiBiaRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<BiaSach> getAll() {
        return loaiBiaRepository.findAll();
    }
}
