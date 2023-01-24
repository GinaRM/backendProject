package com.sha.backendProject.service.impl;

import com.sha.backendProject.model.Business;
import com.sha.backendProject.repostory.BusinessRepository;
import com.sha.backendProject.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final BusinessRepository productRepository;

    public ProductServiceImpl(BusinessRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Business saveProduct(Business business) {

        return productRepository.save(business);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Business> findAllProducts(){
        return productRepository.findAll();
    }


}
