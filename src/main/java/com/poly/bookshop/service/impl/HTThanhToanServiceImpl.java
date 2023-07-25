package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.HTThanhToan;
import com.poly.bookshop.repository.HTThanhToanRepository;
import com.poly.bookshop.service.HTThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HTThanhToanServiceImpl implements HTThanhToanService {

    @Autowired
    private HTThanhToanRepository thanhToanRepository;

    @Override
    public HTThanhToan save(HTThanhToan thanhToan) {
        return thanhToanRepository.save(thanhToan);
    }

    @Override
    public HTThanhToan update(HTThanhToan thanhToan) {
        return thanhToanRepository.save(thanhToan);
    }

    @Override
    public void delete(Long id) {
         thanhToanRepository.deleteById(id);
    }

    @Override
    public HTThanhToan getOne(Long id) {
        return thanhToanRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<HTThanhToan> getAll() {
        return thanhToanRepository.findAll();
    }
}
