package com.poly.bookshop.service;

import com.poly.bookshop.entity.TacGia;

import java.util.List;

public interface TacGiaService {

    TacGia save(TacGia tacGia);

    TacGia update(TacGia tacGia);

    void delete(Long id);

    TacGia getOne(Long id);

    List<TacGia> getAll();
}
