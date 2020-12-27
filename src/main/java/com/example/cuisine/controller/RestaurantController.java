package com.example.cuisine.controller;

import com.example.cuisine.dto.request.RestaurantRequest;
import com.example.cuisine.dto.request.UpdateRestaurantInfoRequest;
import com.example.cuisine.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;


@Controller // This means that this class is a Controller
@RequestMapping(path="api/") // This means URL's start with /restaurant (after Application path)
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

//    @CrossOrigin(origins = "http://127.0.0.1")
    @PostMapping(value = "/restaurant/{adminId}")
    public ResponseEntity<?> addRestaurantDetailInformation(@PathVariable String adminId, @RequestBody RestaurantRequest restaurantRequest) throws ParseException {
        return new ResponseEntity<>(restaurantService.addRestaurantInfo(adminId, restaurantRequest), HttpStatus.OK);
    }

    @GetMapping(value = "/restaurant/all")
    public ResponseEntity<?> getAllRestaurantDetailInformation(){
        return new ResponseEntity<>(restaurantService.getAllRestaurant(), HttpStatus.OK);
    }

    @PatchMapping(value = "/restaurant/update/{restaurantId}")
    public ResponseEntity<?> updateRestaurantDetailInformation(@PathVariable String restaurantId, @RequestBody UpdateRestaurantInfoRequest request){
        return new ResponseEntity<>(restaurantService.updateRestaurantInfo(restaurantId, request), HttpStatus.OK);
    }
}
