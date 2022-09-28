package com.app.feature.currency.dto;

import lombok.Data;

@Data
public class CurrencyItemMono {
    private Currency currencyCodeA;
    private Currency currencyCodeB;
    private String date;
    private float rateBuy;
    private float rateSale;
}
