package com.poly.bookshop.service;

import com.poly.bookshop.entity.ChucVu;

import java.util.List;

public interface ChucVuService {

    ChucVu save(ChucVu chucVu);

    ChucVu update(ChucVu chucVu);

    void delete(Long id);

    ChucVu getOne(Long id);

    List<ChucVu> getAll();
}
