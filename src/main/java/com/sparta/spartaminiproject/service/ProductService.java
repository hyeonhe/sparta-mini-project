package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.ProductCreateDto;
import com.sparta.spartaminiproject.dto.ProductUpdateDto;
import com.sparta.spartaminiproject.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    void createProduct(ProductCreateDto productDto);
    void updateProduct(ProductUpdateDto productDto) throws Exception;
    Product disableProduct(Long productId) throws Exception;
    Product getProduct(Long productId) throws Exception;
    Page<Product> getProductList(Pageable pageable);
}
