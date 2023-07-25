package com.poly.bookshop.service;

import com.poly.bookshop.entity.KhachHang;

import java.util.List;

public interface KhachHangService {

    KhachHang save(KhachHang khachHang);

    KhachHang update(KhachHang khachHang);

    void delete(Long id);

    KhachHang getOne(Long id);

    List<KhachHang> getAll();
}
