package com.example.apiMarketplace.controller;

import com.example.apiMarketplace.model.entity.*;
import com.example.apiMarketplace.model.entity.repository.*;
import jakarta.validation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Product> criar(@RequestBody @Valid Product product) {
        repository.save(product);
        return ResponseEntity.status(201).body(product);
    }

}
