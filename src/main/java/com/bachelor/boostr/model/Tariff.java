package com.bachelor.boostr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Tariff {

    private String tariffId;

    private String tariffName;

    private List<Product> services;

    private Date activeFrom;

    private Date activeUntil;

    private Boolean isForBusiness;

    private Boolean isDiscountable;

    private Price price;

}
