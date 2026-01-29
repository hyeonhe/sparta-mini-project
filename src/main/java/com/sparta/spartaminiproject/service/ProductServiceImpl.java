package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.entity.Product;
import com.sparta.spartaminiproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }
}
