package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

    public CurrencyType getType() {
        return this.chineseYR;
    }
    private CurrencyType chineseYR = CurrencyType.CHINESE_YR;
}

