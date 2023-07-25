package com.poly.bookshop.controller;


import com.poly.bookshop.entity.LoaiSach;
import com.poly.bookshop.entity.NguoiGiaoHang;
import com.poly.bookshop.entity.Sach;
import com.poly.bookshop.service.LoaiSachService;
import com.poly.bookshop.service.NguoiGiaoHangService;
import com.poly.bookshop.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/nguoi-giao-hang")
public class NguoiGiaoHangController {

    @Autowired
    private NguoiGiaoHangService nguoiGiaoHangService;

    @GetMapping()
    public List<NguoiGiaoHang> getShippers() {
        return nguoiGiaoHangService.getAll();
    }

    @GetMapping("/{id}")
    public NguoiGiaoHang getShipper(@PathVariable("id") String id) {
        return nguoiGiaoHangService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public NguoiGiaoHang addShipper(@RequestBody NguoiGiaoHang shipper) {
        return nguoiGiaoHangService.save(shipper);
    }

    @PutMapping("/{id}")
    public NguoiGiaoHang updateShipper(@RequestBody NguoiGiaoHang shipper) {
        return nguoiGiaoHangService.update(shipper);
    }

    @DeleteMapping("/{id}")
    public void deleteShipper(@PathVariable("id") String id) {
        nguoiGiaoHangService.delete(Long.parseLong(id));
    }
}
