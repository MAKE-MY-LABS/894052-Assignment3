package com.training.crypto.cryptoapp.service;

/*
 * Create a service interface called WishListService
 * create below methods
 *  1. saveWishList - to save the CryptoCurrency throw WishListAlreadyExistException
 *  2. getsWishList - to fetch the CryptoCurrency
 *  3. deleteWishListById - to delete the CryptoCurrency by id(string)
 *  4. updateWishList - to update the CryptoCurrency by id(string)
 */

import java.util.List;

import com.training.crypto.cryptoapp.exception.WishListAlreadyExistException;
import com.training.crypto.cryptoapp.model.CryptoCurrency;

public interface WishListService {
    CryptoCurrency saveWishList(CryptoCurrency cryptoCurrency) throws WishListAlreadyExistException;
    List<CryptoCurrency> getsWishList();
    void deleteWishListById(String id);
    CryptoCurrency updateWishList(CryptoCurrency cryptoCurrency);
}
