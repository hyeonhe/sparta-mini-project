package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.ProductDto;
import com.sparta.spartaminiproject.entity.Product;

public interface ProductService {
    void createProduct(ProductDto productDto);
}
