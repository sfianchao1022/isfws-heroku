package com.example.cuisine.dto.request;

import lombok.Data;

@Data
public class AddOwnerInfoRequest {

    private String name;

    private String gender;

    private String phone;
}
