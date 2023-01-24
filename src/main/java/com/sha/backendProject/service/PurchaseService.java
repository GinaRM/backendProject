package com.sha.backendProject.service;

import com.sha.backendProject.model.Purchase;
import com.sha.backendProject.repostory.projection.PurchaseBusiness;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseBusiness> findPurchaseItemsOfUser(Long userId);
}
