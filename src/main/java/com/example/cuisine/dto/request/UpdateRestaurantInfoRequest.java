package com.example.cuisine.dto.request;

import lombok.Data;

@Data
public class UpdateRestaurantInfoRequest {

    private String name;

    private String image;

    private String introduction;

    private String promotion;
}
