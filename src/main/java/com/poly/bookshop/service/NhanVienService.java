package com.poly.bookshop.service;

import com.poly.bookshop.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    NhanVien save(NhanVien nhanVien);

    NhanVien update(NhanVien nhanVien);

    void delete(Long id);

    NhanVien getOne(Long id);

    List<NhanVien> getAll();
}
