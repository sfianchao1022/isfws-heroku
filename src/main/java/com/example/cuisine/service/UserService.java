package com.example.cuisine.service;

import com.example.cuisine.dto.request.AddOwnerInfoRequest;
import com.example.cuisine.dto.request.AddUserInfoRequest;

public interface UserService {

    String addUserInfo(AddUserInfoRequest addUserInfoRequest);

}
