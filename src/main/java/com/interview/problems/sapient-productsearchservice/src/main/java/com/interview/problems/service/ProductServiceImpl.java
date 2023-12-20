package com.interview.problems.service;

import com.interview.problems.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository repository;
    @Override
    public String getProductBySku(String skuId) throws Exception {
        repository.findById(skuId);
        return null;
    }
}
