package com.sha.backendProject.service.impl;

import com.sha.backendProject.model.Purchase;
import com.sha.backendProject.repostory.PurchaseRepository;
import com.sha.backendProject.repostory.projection.PurchaseBusiness;
import com.sha.backendProject.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;


    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {

        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseBusiness> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }

}
