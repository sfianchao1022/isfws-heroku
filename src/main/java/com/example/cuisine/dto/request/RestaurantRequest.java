package com.example.cuisine.dto.request;

import lombok.Data;

@Data
public class RestaurantRequest {

    private String name;

    private String location;

    private String startTime;

    private String endTime;

    private String website;

    private String phone;

    private String image;

    private String introduction;

    private String promotion;

}
