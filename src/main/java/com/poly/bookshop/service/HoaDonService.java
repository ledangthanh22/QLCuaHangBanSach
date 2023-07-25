package com.poly.bookshop.service;

import com.poly.bookshop.entity.HoaDon;

import java.util.List;

public interface HoaDonService {

    HoaDon save(HoaDon hoaDon);

    HoaDon update(HoaDon hoaDon);

    List<HoaDon> getAll();

    HoaDon getByHoaDonCT(Long id);
}
