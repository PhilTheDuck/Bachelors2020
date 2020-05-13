package com.bachelor.boostr;

import com.bachelor.boostr.model.Customer;
import com.bachelor.boostr.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class BoostrApplication {

	@Autowired
	private CustomerRepository repository;

	@PostConstruct
	public void initCustomerRepo() {
		repository.saveAll(Stream.of(new Customer(555, "Svyatoslav"),
				new Customer(444, "Evgeniy"),
				new Customer(333, "Philipp")
		).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(BoostrApplication.class, args);
	}

}
