package com.poly.bookshop.controller;

import com.poly.bookshop.entity.ChucVu;
import com.poly.bookshop.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
@RequestMapping("/admin/chuc-vu")
public class ChucVuController {

    @Autowired
    private  ChucVuService chucVuService;

    @GetMapping()
    public List<ChucVu> getPositions() {
        return chucVuService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable("id") String id) {
        chucVuService.delete(Long.parseLong(id));
    }

    @GetMapping("/{id}")
    public ChucVu getPosition(@PathVariable("id") String id) {
        return chucVuService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public ChucVu addPosition(@RequestBody ChucVu position) {
        return chucVuService.save(position);
    }

    @PutMapping("/{id}")
    public ChucVu updatePosition(@PathVariable("id") String id, @RequestBody ChucVu position) {
        return chucVuService.update(position);
    }
}
