package com.poly.bookshop.service;

import com.poly.bookshop.entity.HTThanhToan;

import java.util.List;

public interface HTThanhToanService {

    HTThanhToan save(HTThanhToan thanhToan);

    HTThanhToan update(HTThanhToan thanhToan);

    void delete(Long id);

    HTThanhToan getOne(Long id);

    List<HTThanhToan> getAll();
}
