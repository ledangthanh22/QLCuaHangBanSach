package com.poly.bookshop.service;

import com.poly.bookshop.entity.KichThuoc;

import java.util.List;

public interface KichThuocService {

    KichThuoc save(KichThuoc kichThuoc);

    KichThuoc update(KichThuoc kichThuoc);

    void delete(Long id);

    KichThuoc getOne(Long id);

    List<KichThuoc> getAll();
}
