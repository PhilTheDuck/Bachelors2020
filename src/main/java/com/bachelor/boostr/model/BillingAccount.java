package com.bachelor.boostr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class BillingAccount {

    private BigDecimal balance;

    private String passportData;

    private String contractNumber;

    private boolean isInDebt;



}
