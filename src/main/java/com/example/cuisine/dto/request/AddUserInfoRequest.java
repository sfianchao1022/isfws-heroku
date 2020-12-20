package com.example.cuisine.dto.request;

import lombok.Data;

@Data
public class AddUserInfoRequest {

    private String name;

    private int age;

    private String gender;

    private String facebook;

    private String phone;

    private String eatingHabit;
}
