package com.poly.bookshop.service;

import com.poly.bookshop.entity.PTVanChuyen;

import java.util.List;

public interface PTVanChuyenService {

    PTVanChuyen save(PTVanChuyen vanChuyen);

    PTVanChuyen update(PTVanChuyen vanChuyen);

    void delete(Long id);

    PTVanChuyen getOne(Long id);

    List<PTVanChuyen> getAll();
}
