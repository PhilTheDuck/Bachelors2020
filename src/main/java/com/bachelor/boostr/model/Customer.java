package com.bachelor.boostr.model;

import com.couchbase.client.java.repository.annotation.Id;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import java.util.Date;

@Data
@Document
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;

    private String fullName;

    private String phoneNumber;

    private String address;

    private Date registrationDate;

    private boolean isBusiness;

    private String status;

    private Tariff currentTariff;

    private BillingAccount billingAccount;

    public Customer(String fullName, String phoneNumber, String address, Date registrationDate, boolean isBusiness, String status, Tariff currentTariff, BillingAccount billingAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registrationDate = registrationDate;
        this.isBusiness = isBusiness;
        this.status = status;
        this.currentTariff = currentTariff;
        this.billingAccount = billingAccount;
    }
}
