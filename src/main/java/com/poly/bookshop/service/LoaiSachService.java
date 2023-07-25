package com.poly.bookshop.service;

import com.poly.bookshop.entity.LoaiSach;

import java.util.List;

public interface LoaiSachService {

    LoaiSach save(LoaiSach loaiSach);

    LoaiSach update(LoaiSach loaiSach);

    void delete(Long id);

    LoaiSach getOne(Long id);

    List<LoaiSach> getAll();
}
