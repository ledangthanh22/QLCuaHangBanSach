package com.poly.bookshop.controller;

import com.poly.bookshop.entity.Staff;
import com.poly.bookshop.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping()
    public ResponseEntity<List<Staff>> getStaffs(){
        return new ResponseEntity<>(staffService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> getStaffs(@PathVariable("id") String id){
        return new ResponseEntity<>(staffService.getOne(Long.parseLong(id)),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff){
        return new ResponseEntity<>(staff,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable("id") String id, @RequestBody Staff staff){
        return new ResponseEntity<>(staffService.update(staff),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable("id") String id){
        staffService.delete(Long.parseLong(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
