package com.sparta.spartaminiproject.dto;

import com.sparta.spartaminiproject.entity.Product;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long productId;
    private String name;
    private Integer price;
    private Integer stock;
    private boolean isActive;

    public Product toEntity() {
        return Product.builder()
                .name(name)
                .price(price)
                .stock(stock)
                .isActive(isActive)
                .build();
    }
}
