package com.bachelor.boostr;

import com.bachelor.boostr.model.*;
import com.bachelor.boostr.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class BoostrApplication {

	@Autowired
	private CustomerRepository repository;

	@PostConstruct
	public void initCustomerRepo() {
		Random  random = new Random();

		Product internet = new Product("Internet", 100, "Mb/S");
		Product sms = new Product("Sms", 30, "Sms quantity");
		Product calls = new Product("Calls", 100, "minutes");
		List<Product> products = new ArrayList<>();
		products.add(internet);
		products.add(sms);
		products.add(calls);

		Price price = new Price(new BigDecimal(Integer.toString(random.nextInt())), true);

		Tariff tariff = new Tariff(random.nextInt(), random.nextInt(), "Vkluchaisa! standard", products, new Date(), new Date(), false, false, price);

		BillingAccount billingAccount = new BillingAccount(new BigDecimal((Integer.toString(random.nextInt()))), "1234 869548", Integer.toString(random.nextInt()), random.nextBoolean());

		repository.saveAll(Stream.of(
				new Customer(random.nextInt(), "Svyatoslav Dmitrievich Tarasov", "+79991234567", "Khabarovskaya ul. dom 10", new Date(), false, "Active", tariff, billingAccount)
		).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(BoostrApplication.class, args);
	}

}
