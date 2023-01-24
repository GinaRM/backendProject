package com.sha.backendProject.service;

import com.sha.backendProject.model.Business;

import java.util.List;

public interface BusinessService {


    Business saveBusiness(Business business);

    void deleteBusiness(Long id);

    List<Business> findAllBusinesses();
}
