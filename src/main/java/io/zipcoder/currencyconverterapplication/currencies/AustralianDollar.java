package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import static io.zipcoder.currencyconverterapplication.CurrencyType.AUSTRALIAN_DOLLAR;


public class AustralianDollar implements ConvertableCurrency {
    public CurrencyType getType() {

    return this.australian;
    }
    private CurrencyType australian  = AUSTRALIAN_DOLLAR;
}