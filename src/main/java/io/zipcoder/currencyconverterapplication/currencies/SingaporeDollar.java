package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    public CurrencyType getType() {
        return this.singaporeDollar;
    }
    private CurrencyType singaporeDollar = CurrencyType.SINGAPORE_DOLLAR;
}

