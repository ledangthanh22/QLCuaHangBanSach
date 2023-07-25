package com.poly.bookshop.service;

import com.poly.bookshop.entity.NguoiGiaoHang;

import java.util.List;

public interface NguoiGiaoHangService {

    NguoiGiaoHang save(NguoiGiaoHang nguoiGiaoHang);

    NguoiGiaoHang update(NguoiGiaoHang nguoiGiaoHang);

    void delete(Long id);

    NguoiGiaoHang getOne(Long id);

    List<NguoiGiaoHang> getAll();
}
