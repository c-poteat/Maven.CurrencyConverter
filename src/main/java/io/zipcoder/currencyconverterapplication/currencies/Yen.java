package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import static io.zipcoder.currencyconverterapplication.CurrencyType.YEN;

public class Yen implements ConvertableCurrency {
    public CurrencyType getType() {
        return this.yen;
    }
    private CurrencyType yen = YEN;
}
