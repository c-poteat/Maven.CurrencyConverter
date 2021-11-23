package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    public CurrencyType getType() {
        return this.universalCurrency;
    }
    private CurrencyType universalCurrency = CurrencyType.UNIVERSAL_CURRENCY;
}

