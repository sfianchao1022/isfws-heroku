package com.example.cuisine.dto.response;

import com.example.cuisine.dto.projection.RestaurantLocation;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RestaurantLocationResponse {

    List<RestaurantLocation> restaurantLocations;

}
