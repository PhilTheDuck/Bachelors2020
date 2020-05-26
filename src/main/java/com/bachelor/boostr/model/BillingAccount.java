package com.bachelor.boostr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BillingAccount {

    private Double balance;

    private String passportData;

    private String contractNumber;

    private boolean isInDebt;

}
