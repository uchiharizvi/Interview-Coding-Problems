package com.interview.problems.controller;

import com.interview.problems.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/{skuId}")
    public String getProductBySKU(@PathVariable String skuId) throws Exception {
        return service.getProductBySku(skuId);
    }
}
