package com.sparta.spartaminiproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class OrderDto {
    private Long orderId;
    private Long productId;
    private String name;
    private Integer quantity;
    private Integer totalAmount;
}
