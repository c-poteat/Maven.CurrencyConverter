package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import static io.zipcoder.currencyconverterapplication.CurrencyType.CANADIAN_DOLLAR;

public class CanadianDollar implements ConvertableCurrency {
    public CurrencyType getType() {

        return this.canadian;
    }
    private CurrencyType canadian  = CANADIAN_DOLLAR;
}
