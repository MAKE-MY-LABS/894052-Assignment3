package com.training.crypto.cryptoapp.model;

/*
 * Create a class called CryptoCurrenciesList
 * add a constructor with all fields, no-argument constructor, and all args constructor, also add builder, data and entity annotations using lomboc
 * create below field with list of CryptoCurrency
 */
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CryptoCurrenciesList {
    private List<CryptoCurrency> data;
}