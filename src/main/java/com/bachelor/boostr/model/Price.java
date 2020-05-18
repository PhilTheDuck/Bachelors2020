package com.bachelor.boostr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Price {

    private BigDecimal price;

    boolean isMonthlyOrEverydayPayments;


}

