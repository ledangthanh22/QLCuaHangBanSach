package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.OderDetail;
import com.poly.bookshop.repository.OderDetailRepository;
import com.poly.bookshop.service.OderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderDetailServiceImpl implements OderDetailService {

    @Autowired
    private OderDetailRepository oderDetailRepository;

    @Override
    public OderDetail save(OderDetail oderDetail) {
        return oderDetailRepository.save(oderDetail);
    }

    @Override
    public List<OderDetail> getAll() {
        return oderDetailRepository.findAll();
    }
}
