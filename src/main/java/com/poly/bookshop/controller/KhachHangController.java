package com.poly.bookshop.controller;


import com.poly.bookshop.entity.KhachHang;
import com.poly.bookshop.service.KhachHangService;
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
@RequestMapping("/admin/khach-hang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping()
    public List<KhachHang> getCustomers() {
        return khachHangService.getAll();
    }

    @GetMapping("/{id}")
    public KhachHang getCustomer(@PathVariable("id") String id) {
        return khachHangService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public KhachHang addCustomer(@RequestBody KhachHang customer) {
        return khachHangService.save(customer);
    }

    @PutMapping("/{id}")
    public KhachHang updateCustomer(@PathVariable("id") String id, @RequestBody KhachHang customer) {
        return khachHangService.update(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id) {
        khachHangService.delete(Long.parseLong(id));
    }
}
