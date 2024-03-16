package com.training.crypto.cryptoapp.controller;
/*
 * Create WishListController class which is a RestController
 * autowire the WishListService and model as cryptocurrency
 * set request mapping to "/api/wishlist"
 * generate all methods for the WishListService
*/


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.training.crypto.cryptoapp.model.CryptoCurrency;
import com.training.crypto.cryptoapp.service.WishListService;

@RestController
@RequestMapping("/api/wishlist")
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @PostMapping
    public CryptoCurrency saveWishList(@RequestBody CryptoCurrency cryptoCurrency) {
        return wishListService.saveWishList(cryptoCurrency);
    }

    @GetMapping
    public List<CryptoCurrency> getsWishList() {
        return wishListService.getsWishList();
    }

    @DeleteMapping("/{id}")
    public void deleteWishListById(@PathVariable String id) {
        wishListService.deleteWishListById(id);
    }

    @PutMapping
    public CryptoCurrency updateWishList(@RequestBody CryptoCurrency cryptoCurrency) {
        return wishListService.updateWishList(cryptoCurrency);
    }
}