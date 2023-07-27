package com.poly.bookshop.controller;

import com.poly.bookshop.entity.Size;
import com.poly.bookshop.service.SizeService;
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
@RequestMapping("/admin/size")
public class SizeController {

    @Autowired
    private SizeService sizeService;

    @GetMapping()
    public List<Size> getSizes() {
        return sizeService.getAll();
    }

    @GetMapping("/{id}")
    public Size getSize(@PathVariable("id") String id) {
        return sizeService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Size addSize(@RequestBody Size size) {
        return sizeService.save(size);
    }

    @PutMapping("/{id}")
    public Size updateSize(@RequestBody Size size) {
        return sizeService.update(size);
    }

    @DeleteMapping("/{id}")
    public void deleteSize(@PathVariable("id") String id) {
        sizeService.delete(Long.parseLong(id));
    }
}
