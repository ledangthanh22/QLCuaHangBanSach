package com.poly.bookshop.service;

import com.poly.bookshop.entity.Size;

import java.util.List;

public interface SizeService {

    Size save(Size size);

    Size update(Size size);

    void delete(Long id);

    Size getOne(Long id);

    List<Size> getAll();
}
