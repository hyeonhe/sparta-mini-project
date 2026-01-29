package com.sparta.spartaminiproject.controller;

import com.sparta.spartaminiproject.dto.ProductDto;
import com.sparta.spartaminiproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/add")
    public void insertProduct(@RequestBody ProductDto productDto) {
        productService.createProduct(productDto);
    }
}
