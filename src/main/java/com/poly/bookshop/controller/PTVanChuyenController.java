package com.poly.bookshop.controller;


import com.poly.bookshop.entity.PTVanChuyen;
import com.poly.bookshop.service.PTVanChuyenService;
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
@RequestMapping("/admin/phuong-thuc-van-chuyen")
public class PTVanChuyenController {

    @Autowired
    private PTVanChuyenService vanChuyenService;

    @GetMapping()
    public List<PTVanChuyen> getShippingMethods() {
        return vanChuyenService.getAll();
    }

    @GetMapping("/{id}")
    public PTVanChuyen getShippingMethod(@PathVariable("id") String id) {
        return vanChuyenService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public PTVanChuyen addShippingMethod(@RequestBody PTVanChuyen shippingMethod) {
        return vanChuyenService.save(shippingMethod);
    }

    @PutMapping("/{id}")
    public PTVanChuyen updateShippingMethod(@RequestBody PTVanChuyen shippingMethod) {
        return vanChuyenService.update(shippingMethod);
    }

    @DeleteMapping("/{id}")
    public void deleteShippingMethod(@PathVariable("id") String id) {
        vanChuyenService.delete(Long.parseLong(id));
    }
}
