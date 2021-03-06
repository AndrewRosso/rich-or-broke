package ru.andrewrosso.richorbroke.service;

import ru.andrewrosso.richorbroke.constant.Compare;

import java.util.Set;

public interface OpenExchangeRatesService {
    Set<String> getCurrencyCodes();

    Compare getCompareCurrencyRates(String currencyCode);

    void checkAndUpdateCurrencyRates();
}
