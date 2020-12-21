package com.example.cuisine.service;

import com.example.cuisine.dao.model.Restaurant;
import com.example.cuisine.dto.request.RestaurantRequest;

import java.text.ParseException;
import java.util.List;

public interface RestaurantService {

    String addRestaurantInfo(String adminId, RestaurantRequest restaurantRequest) throws ParseException;

    List<Restaurant> getAllRestaurant();
}
