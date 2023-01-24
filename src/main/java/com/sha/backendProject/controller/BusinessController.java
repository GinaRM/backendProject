package com.sha.backendProject.controller;

import com.sha.backendProject.model.Business;
import com.sha.backendProject.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;
    @PostMapping
    public ResponseEntity<?> saveBusiness(@RequestBody Business business) {
        return new ResponseEntity<>(businessService.saveBusiness(business), HttpStatus.CREATED);
    }

    @DeleteMapping("{businessId}")
    public ResponseEntity<?> deleteBusiness(@PathVariable Long businessId){
        businessService.deleteBusiness(businessId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllBusinesses() {
        return new ResponseEntity<>(businessService.findAllBusinesses(), HttpStatus.OK);
    }
}
