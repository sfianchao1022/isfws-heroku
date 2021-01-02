package com.example.cuisine.service;

import com.example.cuisine.dao.model.Restaurant;
import com.example.cuisine.dto.request.RestaurantRequest;
import com.example.cuisine.dto.request.UpdateRestaurantInfoRequest;
import com.example.cuisine.dto.response.RestaurantLocationResponse;

import java.text.ParseException;
import java.util.List;

public interface RestaurantService {

    String addRestaurantInfo(String adminId, RestaurantRequest restaurantRequest) throws ParseException;

    List<Restaurant> getAllRestaurant();

    String updateRestaurantInfo(String restaurantId, UpdateRestaurantInfoRequest request);

    String deleteRestaurantInfo(String restaurantId);

    RestaurantLocationResponse getRestaurantInfoWithLocation(String region);

    List<Restaurant> getRestaurantInfoWithName(String name);
}
