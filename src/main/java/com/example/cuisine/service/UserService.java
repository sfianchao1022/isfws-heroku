package com.example.cuisine.service;

import com.example.cuisine.dao.model.User;
import com.example.cuisine.dto.request.AddOwnerInfoRequest;
import com.example.cuisine.dto.request.AddUserInfoRequest;

import java.util.List;

public interface UserService {

    String addUserInfo(AddUserInfoRequest addUserInfoRequest);

    List<User> getAllUser();
}
