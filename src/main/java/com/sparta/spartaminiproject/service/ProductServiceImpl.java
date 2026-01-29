package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.ProductDto;
import com.sparta.spartaminiproject.entity.Product;
import com.sparta.spartaminiproject.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    @Transactional
    public void createProduct(ProductDto productDto) {
        Product product = productDto.toEntity();
        productRepository.save(product);
    }
}
