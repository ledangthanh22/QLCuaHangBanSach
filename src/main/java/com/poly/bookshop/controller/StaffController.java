package com.poly.bookshop.controller;

import com.poly.bookshop.entity.Staff;
import com.poly.bookshop.service.StaffService;
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
@RequestMapping("/admin/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping()
    public  List<Staff> getStaffs(){
        return staffService.getAll();
    }

    @GetMapping("/{id}")
    public Staff getStaffs(@PathVariable("id") String id){
        return staffService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Staff addStaff(@RequestBody Staff staff){
        return staffService.save(staff);
    }

    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable("id") String id, @RequestBody Staff staff){
        return staffService.update(staff);
    }

    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable("id") String id){
        staffService.delete(Long.parseLong(id));
    }
}
