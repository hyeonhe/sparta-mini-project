package com.sparta.spartaminiproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class OrderCreateDto {
    private Long productId;
    private Integer quantity;
}
