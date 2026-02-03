package com.sparta.spartaminiproject.repository;

import com.sparta.spartaminiproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
