package com.sparta.spartaminiproject.controller;

import com.sparta.spartaminiproject.dto.ProductCreateDto;
import com.sparta.spartaminiproject.dto.ProductUpdateDto;
import com.sparta.spartaminiproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
