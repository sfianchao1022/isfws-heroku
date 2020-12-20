package com.example.cuisine.service;

import com.example.cuisine.dto.request.RestaurantRequest;

import java.text.ParseException;

public interface RestaurantService {

    String addRestaurantInfo(String adminId, RestaurantRequest restaurantRequest) throws ParseException;
}
