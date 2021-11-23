package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.FRANC;

public class Franc implements ConvertableCurrency {
    public CurrencyType getType() {

        return this.franc;
    }
    private CurrencyType franc  = FRANC;
}

