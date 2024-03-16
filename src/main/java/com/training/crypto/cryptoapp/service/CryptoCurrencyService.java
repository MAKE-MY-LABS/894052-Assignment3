package com.training.crypto.cryptoapp.service;

import com.training.crypto.cryptoapp.model.CryptoCurrenciesList;

// Create a service interface called CryptoCurrencyService
// add a method called getLatestCryptoCurrency

public interface CryptoCurrencyService {
    CryptoCurrenciesList getLatestCryptoCurrency();
}