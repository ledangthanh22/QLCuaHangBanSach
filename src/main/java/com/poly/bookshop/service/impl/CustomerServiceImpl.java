package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Customer;
import com.poly.bookshop.repository.CustomerRepository;
import com.poly.bookshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getOne(Long id) {
        return customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
