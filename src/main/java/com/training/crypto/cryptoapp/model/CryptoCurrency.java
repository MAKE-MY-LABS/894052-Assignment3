package com.training.crypto.cryptoapp.model; 
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*
 * Create a class called CryptoCurrency
 * add a constructor with all fields, no-argument constructor, and all args constructor, also add builder, data and entity annotations using lomboc
 * create below fields
 * {"symbol":"0xBTC/BTC","available_exchanges":["Hotbit","Mercatox"],"currency_base":"0xBitcoin","currency_quote":"Bitcoin"}
 * 
 */
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CryptoCurrency {
    @Id
    private String id;
    private String symbol;
    private List<String> available_exchanges;
    private String currency_base;
    private String currency_quote;
}