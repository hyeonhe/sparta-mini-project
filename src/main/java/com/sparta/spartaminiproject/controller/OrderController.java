package com.sparta.spartaminiproject.controller;

import com.sparta.spartaminiproject.dto.OrderCreateDto;
import com.sparta.spartaminiproject.entity.Order;
import com.sparta.spartaminiproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/add")
    public Order insertOrder(@RequestBody OrderCreateDto orderDto) {
        return orderService.createOrder(orderDto);
    }
}
