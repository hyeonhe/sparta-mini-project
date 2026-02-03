package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.OrderCreateDto;
import com.sparta.spartaminiproject.entity.Order;

public interface OrderService {
    Order createOrder(OrderCreateDto orderDto);
}
