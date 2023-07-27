package com.poly.bookshop.service.impl;

import com.poly.bookshop.dto.PositionDTO;
import com.poly.bookshop.entity.Position;
import com.poly.bookshop.repository.PositionRepository;
import com.poly.bookshop.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Position update(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void delete(Long id) {
        positionRepository.deleteById(id);
    }

    @Override
    public Position getOne(Long id) {
        return positionRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay"));
    }

    @Override
    public List<Position> getAll() {
        return positionRepository.findAll();
    }
}
