package com.sparta.spartaminiproject.controller;

import com.sparta.spartaminiproject.dto.OrderCreateDto;
import com.sparta.spartaminiproject.dto.OrderDto;
import com.sparta.spartaminiproject.entity.Order;
import com.sparta.spartaminiproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{orderId}")
    public ResponseEntity<?> getOrder(@PathVariable Long orderId) {
        OrderDto order;
        try {
            order = orderService.getOrder(orderId);
            return ResponseEntity.ok(order);
        } catch (Exception e) {
            log.error("주문 조회 실패: {}", e.getMessage());
            return ResponseEntity.badRequest().body("주문 조회 실패: " + e.getMessage());
        }
    }
}
