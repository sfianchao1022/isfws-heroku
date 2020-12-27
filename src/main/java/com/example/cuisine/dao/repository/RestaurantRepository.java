package com.example.cuisine.dao.repository;

import com.example.cuisine.dao.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Modifying
    @Query("update Restaurant r set r.name = ?1, r.image = ?2, r.introduction = ?3, r.promotion = ?4 where r.id = ?5")
    void updateRestaurantInfoById(String name, String image, String introduction, String promotion, Long restaurantId);

}
