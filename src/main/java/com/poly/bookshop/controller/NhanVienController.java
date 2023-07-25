package com.poly.bookshop.controller;

import com.poly.bookshop.entity.NhanVien;
import com.poly.bookshop.service.NhanVienService;
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
@RequestMapping("/admin/nhan-vien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping()
    public List<NhanVien> getStaffs(){
        return nhanVienService.getAll();
    }

    @GetMapping("/{id}")
    public NhanVien getStaffs(@PathVariable("id") String id){
        return nhanVienService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public NhanVien addStaff(@RequestBody NhanVien staff){
        return nhanVienService.save(staff);
    }

    @PutMapping("/{id}")
    public NhanVien updateStaff(@PathVariable("id") String id,@RequestBody NhanVien staff){
        return nhanVienService.update(staff);
    }

    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable("id") String id){
        nhanVienService.delete(Long.parseLong(id));
    }
}
