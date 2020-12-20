package com.example.cuisine.dao.repository;

import com.example.cuisine.dao.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
