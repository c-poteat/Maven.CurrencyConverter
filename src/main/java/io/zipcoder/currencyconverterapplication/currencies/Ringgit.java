package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;


public class Ringgit implements ConvertableCurrency {

    public CurrencyType getType() {
        return this.ringgit;
    }
    private CurrencyType ringgit = CurrencyType.RINGGIT;
}
