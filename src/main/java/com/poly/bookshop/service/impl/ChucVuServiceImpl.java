package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.ChucVu;
import com.poly.bookshop.repository.ChucVuRepository;
import com.poly.bookshop.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ChucVuServiceImpl implements ChucVuService {

//    SimpleDateFormat dateFormatter = new SimpleDateFormat ("yyyy-MM-dd"); //Format for output

    @Autowired
    private ChucVuRepository chucVuRepository;

    @Override
    public ChucVu save(ChucVu chucVu) {
//        ChucVu vu = new ChucVu();
//        chucVu.setNgayTao(vu.getNgayTao());
        return chucVuRepository.save(chucVu);
    }

    @Override
    public ChucVu update(ChucVu chucVu) {
//        chucVu.setNgaySua(dateFormatter.format(new Date()));
        return chucVuRepository.save(chucVu);
    }

    @Override
    public void delete(Long id) {
         chucVuRepository.deleteById(id);
    }

    @Override
    public ChucVu getOne(Long id) {
        return chucVuRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay"));
    }

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepository.findAll();
    }
}
