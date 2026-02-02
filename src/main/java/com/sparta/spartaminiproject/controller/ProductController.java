package com.sparta.spartaminiproject.controller;

import com.sparta.spartaminiproject.dto.ProductCreateDto;
import com.sparta.spartaminiproject.dto.ProductUpdateDto;
import com.sparta.spartaminiproject.entity.Product;
import com.sparta.spartaminiproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/add")
    public void insertProduct(@RequestBody ProductCreateDto productCreateDto) {
        productService.createProduct(productCreateDto);
    }

    @PostMapping("/update")
    public void updateProduct(@RequestBody ProductUpdateDto productDto) {
        try {
            productService.updateProduct(productDto);
        } catch (Exception e) {
            log.error("상품 수정 에러 발생! 상품 ID: {}, 메시지: {}", productDto.getProductId(), e.getMessage());
        }
    }

    @PostMapping("/{productId}/disable")
    public ResponseEntity<?> disableProduct(@PathVariable Long productId) {
        Product product;
        try {
            product = productService.disableProduct(productId);
            return ResponseEntity.ok(product);
        } catch (Exception e) {
            log.error("상품 삭제 에러 발생! 상품 ID: {}, 메시지: {}", productId, e.getMessage());
            return ResponseEntity.badRequest().body("상품 삭제 실패: " + e.getMessage());
        }
    }

    @GetMapping("/{productId}")
    public ResponseEntity<?> getProduct(@PathVariable Long productId) {
        Product product;
        try {
            product = productService.getProduct(productId);
            return ResponseEntity.ok(product);
        } catch (Exception e) {
            log.error("상품 조회 실패: {}", e.getMessage());
            return ResponseEntity.badRequest().body("상품 조회 실패: " + e.getMessage());
        }
    }
}
