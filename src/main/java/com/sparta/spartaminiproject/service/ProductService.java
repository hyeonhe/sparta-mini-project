package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.ProductDto;
import com.sparta.spartaminiproject.dto.ProductUpdateDto;

public interface ProductService {
    void createProduct(ProductDto productDto);
    void updateProduct(ProductUpdateDto productDto) throws Exception;
}
