package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.NguoiGiaoHang;
import com.poly.bookshop.repository.NguoiGiaoHangRepository;
import com.poly.bookshop.service.NguoiGiaoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiGiaoHangServiceImpl implements NguoiGiaoHangService {

    @Autowired
    private NguoiGiaoHangRepository nguoiGiaoHangRepository;

    @Override
    public NguoiGiaoHang save(NguoiGiaoHang nguoiGiaoHang) {
        return nguoiGiaoHangRepository.save(nguoiGiaoHang);
    }

    @Override
    public NguoiGiaoHang update(NguoiGiaoHang nguoiGiaoHang) {
        return nguoiGiaoHangRepository.save(nguoiGiaoHang);
    }

    @Override
    public void delete(Long id) {
        nguoiGiaoHangRepository.deleteById(id);
    }

    @Override
    public NguoiGiaoHang getOne(Long id) {
        return nguoiGiaoHangRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<NguoiGiaoHang> getAll() {
        return nguoiGiaoHangRepository.findAll();
    }
}
