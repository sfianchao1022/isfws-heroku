package com.example.cuisine.controller;

import com.example.cuisine.dto.request.AddUserInfoRequest;
import com.example.cuisine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController // This means that this class is a Controller
@RequestMapping(path="api/") // This means URL's start with /user (after Application path)
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //    @CrossOrigin(origins = "http://127.0.0.1")
    @PostMapping(value = "/user")
    public ResponseEntity<?> addUserDetailInformation(@RequestBody AddUserInfoRequest addUserInfoRequest) throws ParseException {
        return new ResponseEntity<>(userService.addUserInfo(addUserInfoRequest), HttpStatus.OK);
    }

    @GetMapping(value = "/user/all")
    public ResponseEntity<?> getAllUserDetailInformation(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }
}
