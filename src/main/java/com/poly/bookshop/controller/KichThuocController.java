package com.poly.bookshop.controller;

import com.poly.bookshop.entity.KichThuoc;
import com.poly.bookshop.service.KichThuocService;
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
@RequestMapping("/admin/kich-thuoc")
public class KichThuocController {

    @Autowired
    private KichThuocService kichThuocService;

    @GetMapping()
    public List<KichThuoc> getSizes() {
        return kichThuocService.getAll();
    }

    @GetMapping("/{id}")
    public KichThuoc getSize(@PathVariable("id") String id) {
        return kichThuocService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public KichThuoc addSize(@RequestBody KichThuoc size) {
        return kichThuocService.save(size);
    }

    @PutMapping("/{id}")
    public KichThuoc updateSize(@RequestBody KichThuoc size) {
        return kichThuocService.update(size);
    }

    @DeleteMapping("/{id}")
    public void deleteSize(@PathVariable("id") String id) {
        kichThuocService.delete(Long.parseLong(id));
    }
}
