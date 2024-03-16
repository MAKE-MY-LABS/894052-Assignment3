package com.training.crypto.cryptoapp.service;

/*
 * Create a service class called WishListServiceImpl which implements WishListService
 * autowire the WishListRepository
 * create below all methods
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.crypto.cryptoapp.exception.WishListAlreadyExistException;
import com.training.crypto.cryptoapp.model.CryptoCurrency;
import com.training.crypto.cryptoapp.repository.WishListRepository;

import java.util.List;

@Service
public class WishListServiceImpl implements WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    @Override
    public CryptoCurrency saveWishList(CryptoCurrency cryptoCurrency) throws WishListAlreadyExistException {

        if (wishListRepository.existsById(cryptoCurrency.getId())) {
            throw new WishListAlreadyExistException("WishList already exist");
        }
        return wishListRepository.save(cryptoCurrency);
    }

    @Override
    public List<CryptoCurrency> getsWishList() {
        return (List<CryptoCurrency>) wishListRepository.findAll();
    }

    @Override
    public void deleteWishListById(String id) {
        wishListRepository.deleteById(id);
    }

    @Override
    public CryptoCurrency updateWishList(CryptoCurrency cryptoCurrency) {
        return wishListRepository.save(cryptoCurrency);
    }
}