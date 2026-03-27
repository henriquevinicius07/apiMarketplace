package com.example.apiMarketplace.controller;

import com.example.apiMarketplace.model.entity.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public String listar() {
        return "product/list";
    }
}
