package com.poly.bookshop.service;

import com.poly.bookshop.entity.HoaDonCT;

import java.util.List;

public interface HoaDonCTService {

    HoaDonCT save(HoaDonCT hoaDonCT);

    List<HoaDonCT> getAll();
}
