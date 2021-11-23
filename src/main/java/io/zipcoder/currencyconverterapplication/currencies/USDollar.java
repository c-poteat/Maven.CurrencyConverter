package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    public CurrencyType getType() {
        return this.usDollar;
    }
    private CurrencyType usDollar = CurrencyType.US_DOLLAR;
}

