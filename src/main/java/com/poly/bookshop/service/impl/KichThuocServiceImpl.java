package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.KichThuoc;
import com.poly.bookshop.repository.KichThuocRepository;
import com.poly.bookshop.service.KichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KichThuocServiceImpl implements KichThuocService {

    @Autowired
    private KichThuocRepository kichThuocRepository;

    @Override
    public KichThuoc save(KichThuoc kichThuoc) {
        return kichThuocRepository.save(kichThuoc);
    }

    @Override
    public KichThuoc update(KichThuoc kichThuoc) {
        return kichThuocRepository.save(kichThuoc);
    }

    @Override
    public void delete(Long id) {
        kichThuocRepository.deleteById(id);
    }

    @Override
    public KichThuoc getOne(Long id) {
        return kichThuocRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<KichThuoc> getAll() {
        return kichThuocRepository.findAll();
    }
}
