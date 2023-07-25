package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.NhanVien;
import com.poly.bookshop.repository.NhanVienRepository;
import com.poly.bookshop.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public NhanVien save(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public NhanVien update(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(Long id) {
         nhanVienRepository.deleteById(id);
    }

    @Override
    public NhanVien getOne(Long id) {
        return nhanVienRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }
}
