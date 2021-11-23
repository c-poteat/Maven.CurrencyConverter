package io.zipcoder.currencyconverterapplication;

import java.util.Currency;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getType().getRate();
    }
    CurrencyType getType();
}

