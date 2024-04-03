package com.example.cloudcomputing.controller;

import com.example.cloudcomputing.dto.Product;
import com.example.cloudcomputing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/test")
    public ResponseEntity<List<Product>> autho(){
        List<Product> products = productService.getAll();
        return ResponseEntity.ok().header("sort", "as").body(products);
    }

    @GetMapping("/DuyTung")
    public String test(){
        return "test";
    }

    @GetMapping("/")
    public String oke(){
        return "Web của Thế Anh!";
    }

}
