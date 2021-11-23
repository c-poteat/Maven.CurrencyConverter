package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.POUND;

public class Pound implements ConvertableCurrency {
    public CurrencyType getType() {

        return this.pound;
    }
    private CurrencyType pound  = POUND;
}


