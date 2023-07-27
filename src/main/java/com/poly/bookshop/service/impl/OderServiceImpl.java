package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Oder;
import com.poly.bookshop.repository.OderRepository;
import com.poly.bookshop.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderServiceImpl implements OderService {

    @Autowired
    private OderRepository oderRepository;

    @Override
    public Oder save(Oder oder) {
        return oderRepository.save(oder);
    }

    @Override
    public Oder update(Oder oder) {
        return oderRepository.save(oder);
    }

    @Override
    public List<Oder> getAll() {
        return oderRepository.findAll();
    }

    @Override
    public Oder getByHoaDonCT(Long id) {
        return null;
    }
}
