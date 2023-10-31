package com.example.cloudcomputing.service;

import com.example.cloudcomputing.dto.Product;
import com.example.cloudcomputing.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Transactional
    public List<Product> getAll() {
        return productRepo.findAll();
    }
}
