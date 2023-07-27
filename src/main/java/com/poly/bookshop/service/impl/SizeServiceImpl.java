package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Size;
import com.poly.bookshop.repository.SizeRepository;
import com.poly.bookshop.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public Size save(Size size) {
        return sizeRepository.save(size);
    }

    @Override
    public Size update(Size size) {
        return sizeRepository.save(size);
    }

    @Override
    public void delete(Long id) {
        sizeRepository.deleteById(id);
    }

    @Override
    public Size getOne(Long id) {
        return sizeRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Size> getAll() {
        return sizeRepository.findAll();
    }
}
