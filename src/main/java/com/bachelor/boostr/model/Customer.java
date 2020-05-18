package com.bachelor.boostr.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Customer {

    @Id
    private int id;

    @Field
    private String fullName;

    @Field
    private String phoneNumber;

    @Field
    private String address;

    @Field
    private Date registrationDate;

    private boolean isBusiness;

    private String status;

    private Tariff currentTariff;

    private BillingAccount billingAccount;

}
