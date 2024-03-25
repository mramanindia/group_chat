package com.groupchat.groupchat.repository;

import com.groupchat.groupchat.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}