package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Staff;
import com.poly.bookshop.repository.StaffRepository;
import com.poly.bookshop.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff save(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff update(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public void delete(Long id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Staff getOne(Long id) {
        Optional<Staff> result = staffRepository.findById(id);
        return result.isPresent() ? result.get() : null ;
    }

    @Override
    public List<Staff> getAll() {
        return staffRepository.findAll();
    }
}
