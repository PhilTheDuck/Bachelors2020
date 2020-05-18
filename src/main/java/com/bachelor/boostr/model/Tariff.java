package com.bachelor.boostr.model;

import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Tariff {

    @Id
    private int id;

    private int tariffId;

    private String tariffName;

    private List<Product> services;

    private Date activeFrom;

    private Date activeUntil;

    private Boolean isForBusiness;

    private Boolean isDiscountable;

    private Price price;


}
