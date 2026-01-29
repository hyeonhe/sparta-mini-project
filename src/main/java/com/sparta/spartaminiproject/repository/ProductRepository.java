package com.sparta.spartaminiproject.repository;

import com.sparta.spartaminiproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
