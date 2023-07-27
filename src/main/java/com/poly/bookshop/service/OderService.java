package com.poly.bookshop.service;

import com.poly.bookshop.entity.Oder;

import java.util.List;

public interface OderService {

    Oder save(Oder oder);

    Oder update(Oder oder);

    List<Oder> getAll();

    Oder getByHoaDonCT(Long id);
}
