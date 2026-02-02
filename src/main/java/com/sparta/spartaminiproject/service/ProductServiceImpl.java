package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.ProductCreateDto;
import com.sparta.spartaminiproject.dto.ProductUpdateDto;
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
    public void createProduct(ProductCreateDto productDto) {
        Product product = productDto.toEntity();
        productRepository.save(product);
    }

    @Override
    @Transactional
    public void updateProduct(ProductUpdateDto productDto) throws Exception {
        Product product = productRepository.findById(productDto.getProductId()).orElseThrow(() -> new Exception("상품이 존재하지 않습니다."));
        product.updateInfo(productDto.getName(), productDto.getPrice(), productDto.getStock());
    }

    @Override
    @Transactional
    public Product disableProduct(Long productId) throws Exception {
        Product product = productRepository.findById(productId).orElseThrow(() -> new Exception("상품이 존재하지 않습니다."));
        product.disableProduct();
        return product;
    }

    @Override
    @Transactional
    public Product getProduct(Long productId) throws Exception {
        return productRepository.findById(productId).orElseThrow(() -> new Exception("상품이 존재하지 않습니다."));
    }
}
