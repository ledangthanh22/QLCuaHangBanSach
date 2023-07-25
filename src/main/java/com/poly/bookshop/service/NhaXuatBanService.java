package com.poly.bookshop.service;

import com.poly.bookshop.entity.NhaXuatBan;

import java.util.List;

public interface NhaXuatBanService {

    NhaXuatBan save(NhaXuatBan nhaXuatBan);

    NhaXuatBan update(NhaXuatBan nhaXuatBan);

    void delete(Long id);

    NhaXuatBan getOne(Long id);

    List<NhaXuatBan> getAll();
}
