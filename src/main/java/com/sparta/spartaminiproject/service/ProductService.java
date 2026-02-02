package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.ProductCreateDto;
import com.sparta.spartaminiproject.dto.ProductUpdateDto;
import com.sparta.spartaminiproject.entity.Product;

public interface ProductService {
    void createProduct(ProductCreateDto productDto);
    void updateProduct(ProductUpdateDto productDto) throws Exception;
    Product disableProduct(Long productId) throws Exception;
}
