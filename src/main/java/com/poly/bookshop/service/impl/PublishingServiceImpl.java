package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Publishing;
import com.poly.bookshop.repository.PublishingRepository;
import com.poly.bookshop.service.PublishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishingServiceImpl implements PublishingService {

    @Autowired
    private PublishingRepository publishingRepository;

    @Override
    public Publishing save(Publishing publishing) {
        return publishingRepository.save(publishing);
    }

    @Override
    public Publishing update(Publishing publishing) {
        return publishingRepository.save(publishing);
    }

    @Override
    public void delete(Long id) {
        publishingRepository.deleteById(id);
    }

    @Override
    public Publishing getOne(Long id) {
        return publishingRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Publishing> getAll() {
        return publishingRepository.findAll();
    }
}
