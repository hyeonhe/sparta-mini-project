package com.sparta.spartaminiproject.service;

import com.sparta.spartaminiproject.dto.OrderCreateDto;
import com.sparta.spartaminiproject.entity.Order;
import com.sparta.spartaminiproject.entity.Product;
import com.sparta.spartaminiproject.repository.OrderRepository;
import com.sparta.spartaminiproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Override
    @Transactional
    public Order createOrder(OrderCreateDto orderDto) {
        Product product = productRepository.findByProductId(orderDto.getProductId());
        Order order = Order.builder()
                .product(product)
                .quantity(orderDto.getQuantity())
                .totalAmount(product.getPrice() * orderDto.getQuantity())
                .build();

        orderRepository.save(order);
        return order;
    }

}
