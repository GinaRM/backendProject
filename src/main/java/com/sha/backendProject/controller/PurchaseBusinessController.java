package com.sha.backendProject.controller;

import com.sha.backendProject.model.User_business;
import com.sha.backendProject.security.UserPrinciple;
import com.sha.backendProject.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchaseBusiness")
public class PurchaseBusinessController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody User_business userBusiness) {
        return new ResponseEntity<>(purchaseService.savePurchase(userBusiness), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple) {
        return  ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrinciple.getId()));
    }


}
