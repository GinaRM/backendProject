package com.sha.backendProject.service;

import com.sha.backendProject.model.Business;

import java.util.List;

public interface ProductService {


    Business saveProduct(Business product);

    void deleteProduct(Long id);

    List<Business> findAllProducts();
}
