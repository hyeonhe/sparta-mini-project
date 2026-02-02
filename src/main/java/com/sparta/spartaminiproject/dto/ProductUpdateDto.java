package com.sparta.spartaminiproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ProductUpdateDto {
    private Long productId;
    private String name;
    private Integer price;
    private Integer stock;

}
