package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.NhaXuatBan;
import com.poly.bookshop.repository.NhaXuatBanRepository;
import com.poly.bookshop.service.NhaXuatBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaXuatBanServiceImpl implements NhaXuatBanService {

    @Autowired
    private NhaXuatBanRepository nhaXuatBanRepository;

    @Override
    public NhaXuatBan save(NhaXuatBan nhaXuatBan) {
        return nhaXuatBanRepository.save(nhaXuatBan);
    }

    @Override
    public NhaXuatBan update(NhaXuatBan nhaXuatBan) {
        return nhaXuatBanRepository.save(nhaXuatBan);
    }

    @Override
    public void delete(Long id) {
        nhaXuatBanRepository.deleteById(id);
    }

    @Override
    public NhaXuatBan getOne(Long id) {
        return nhaXuatBanRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<NhaXuatBan> getAll() {
        return nhaXuatBanRepository.findAll();
    }
}
