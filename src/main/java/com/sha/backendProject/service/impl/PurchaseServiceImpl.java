package com.sha.backendProject.service.impl;

import com.sha.backendProject.model.User_business;
import com.sha.backendProject.repostory.PurchaseRepository;
import com.sha.backendProject.repostory.projection.PurchaseBusiness;
import com.sha.backendProject.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;


    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {

        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public User_business savePurchase(User_business userbusiness) {
        return purchaseRepository.save(userbusiness);
    }

    @Override
    public List<PurchaseBusiness> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }


}
