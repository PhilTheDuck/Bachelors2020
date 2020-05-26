package com.bachelor.boostr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Price {

    private Double price;

    boolean isMonthlyOrEverydayPayments;

}

