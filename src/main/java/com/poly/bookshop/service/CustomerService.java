package com.poly.bookshop.service;

import com.poly.bookshop.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(Long id);

    Customer getOne(Long id);

    List<Customer> getAll();
}
