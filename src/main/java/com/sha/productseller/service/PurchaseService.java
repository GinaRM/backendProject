package com.sha.productseller.service;

import com.sha.productseller.model.Purchase;
import com.sha.productseller.repostory.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
