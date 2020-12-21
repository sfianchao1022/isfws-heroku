package com.example.cuisine.service.impl;

import com.example.cuisine.dao.model.User;
import com.example.cuisine.dao.repository.UserRepository;
import com.example.cuisine.dto.request.AddUserInfoRequest;
import com.example.cuisine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public String addUserInfo(AddUserInfoRequest addUserInfoRequest){

        User user = new User();

        user.setName(addUserInfoRequest.getName());
        user.setAge(addUserInfoRequest.getAge());
        user.setGender(addUserInfoRequest.getGender());
        user.setFacebook(addUserInfoRequest.getFacebook());
        user.setPhone(addUserInfoRequest.getPhone());
        user.setEatingHabit(addUserInfoRequest.getEatingHabit());

        userRepository.save(user);

        return "add user info success !";
    }

    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }


}
