package com.training.crypto.cryptoapp.controller;

/*
 * Create CryptoCurrencyController class which is a RestController
 * autowire the CryptoCurrencyService
 * create a method to fetch the list of cryptocurrencies, no url in getmapping
 * set request mapping to "/api/cryptocurrencies"
 * return the list of cryptocurrencies * 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.crypto.cryptoapp.model.CryptoCurrenciesList;
import com.training.crypto.cryptoapp.service.CryptoCurrencyService;

@RestController
@RequestMapping("/api/cryptocurrencies")
public class CryptoCurrencyController {

    @Autowired
    private CryptoCurrencyService cryptoCurrencyService;

    @GetMapping
    public CryptoCurrenciesList getCryptoCurrencies() {
        return cryptoCurrencyService.getLatestCryptoCurrency();
    }
}
