package com.poly.bookshop.controller;



import com.poly.bookshop.entity.NhaXuatBan;
import com.poly.bookshop.service.NhaXuatBanService;
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
@RequestMapping("/admin/nha-xuat-ban")
public class NhaXuatBanController {

    @Autowired
    private NhaXuatBanService nhaXuatBanService;

    @GetMapping()
    public List<NhaXuatBan> getPublishes() {
        return nhaXuatBanService.getAll();
    }

    @GetMapping("/{id}")
    public NhaXuatBan getPublishing(@PathVariable("id") String id) {
        return nhaXuatBanService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public NhaXuatBan addPublishing(@RequestBody NhaXuatBan publishing) {
        return nhaXuatBanService.save(publishing);
    }

    @PutMapping("/{id}")
    public NhaXuatBan updatePublishing(@RequestBody NhaXuatBan publishing) {
        return nhaXuatBanService.update(publishing);
    }

    @DeleteMapping("/{id}")
    public void deletePublishing(@PathVariable("id") String id) {
        nhaXuatBanService.delete(Long.parseLong(id));
    }
}
