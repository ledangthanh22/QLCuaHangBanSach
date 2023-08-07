package com.poly.bookshop.service;

import com.poly.bookshop.entity.Position;

import java.util.List;

public interface PositionService {

    Position save(Position position);

    Position update(Position position);

    void delete(Long id);

    Position getOne(Long id);

    List<Position> getAll();
}
