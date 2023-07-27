package com.poly.bookshop.service;

import com.poly.bookshop.entity.OderDetail;

import java.util.List;

public interface OderDetailService {

    OderDetail save(OderDetail oderDetail);

    List<OderDetail> getAll();
}
