package com.bachelor.boostr.controller;

import com.bachelor.boostr.model.Customer;
import com.bachelor.boostr.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/findAllCustomers")
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }
}
