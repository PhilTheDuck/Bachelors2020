package com.bachelor.boostr.controller;

import com.bachelor.boostr.model.*;
import com.bachelor.boostr.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/findAllCustomers")
    public Iterable<Customer> getAll() {

        return repository.findAll();
    }

    @GetMapping("/findCustomer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable String id){
        return repository.findById(id);
    }

    @PostMapping("/generateThousandCustomers")
    public String generateCustomers() {
        Random random = new Random();
        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            Product internet = new Product("Internet", Integer.toString(random.nextInt(91) + 10), "Mb/S");
            Product sms = new Product("Sms", Integer.toString(random.nextInt(41) + 10), "Sms quantity");
            Product calls = new Product("Calls", Integer.toString(random.nextInt(601) + 100), "minutes");
            List<Product> products = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                products.add(internet);
                products.add(sms);
                products.add(calls);
            }

            Price price = new Price(new Double(Integer.toString(random.nextInt(301) + 200)), true);

            Tariff tariff = new Tariff(
                    Integer.toString(random.nextInt(Integer.MAX_VALUE)),
                    "Vkluchaisa! configurable", products,
                    new Date("Fri, 1 May 2020 13:30:00 GMT+0430"),
                    new Date("Fri, 1 May 2021 13:30:00 GMT+0430"),
                    false, false, price
            );

            BillingAccount billingAccount = new BillingAccount(
                    new Double((Integer.toString(random.nextInt(10001)))),
                    "1234 869548",
                    Integer.toString(random.nextInt(Integer.MAX_VALUE)),
                    random.nextBoolean()
            );
            customers.add(new Customer(
                    "Ivanov Ivan Ivanovich",
                    "+79991234567",
                    "ul. Lenina dom 10",
                    new Date(), false, "Active",
                    tariff, billingAccount
                    )
            );
        }
        repository.saveAll(customers);
        return "Generated successfully.";
    }
}
