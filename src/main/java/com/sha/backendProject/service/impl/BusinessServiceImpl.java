package com.sha.backendProject.service.impl;

import com.sha.backendProject.model.Business;
import com.sha.backendProject.repostory.BusinessRepository;
import com.sha.backendProject.service.BusinessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessRepository businessRepository;

    public BusinessServiceImpl(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    @Override
    public Business saveBusiness(Business business) {

        return businessRepository.save(business);
    }

    @Override
    public void deleteBusiness(Long id) {
        businessRepository.deleteById(id);
    }

    @Override
    public List<Business> findAllBusinesses(){
        return businessRepository.findAll();
    }


}
