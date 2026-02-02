package com.sparta.spartaminiproject.dto;

import com.sparta.spartaminiproject.entity.Product;
import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class ProductCreateDto {
    private Long productId;
    private String name;
    private Integer price;
    private Integer stock;

    public Product toEntity() {
        return Product.builder()
                .name(name)
                .price(price)
                .stock(stock)
                .isActive(true)
                .build();
    }
}
