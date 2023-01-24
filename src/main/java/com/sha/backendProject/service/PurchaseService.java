package com.sha.backendProject.service;

import com.sha.backendProject.model.User_business;
import com.sha.backendProject.repostory.projection.PurchaseBusiness;

import java.util.List;

public interface PurchaseService {
    User_business savePurchase(User_business userBusiness);

    List<PurchaseBusiness> findPurchaseItemsOfUser(Long userId);
}
