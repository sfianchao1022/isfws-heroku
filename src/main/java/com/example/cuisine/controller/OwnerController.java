package com.example.cuisine.controller;

import com.example.cuisine.dto.request.AddOwnerInfoRequest;
import com.example.cuisine.dto.request.RestaurantRequest;
import com.example.cuisine.service.OwnerService;
import com.example.cuisine.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController // This means that this class is a Controller
@RequestMapping(path="api/") // This means URL's start with /owner (after Application path)
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //    @CrossOrigin(origins = "http://127.0.0.1")
    @PostMapping(value = "/owner")
    public ResponseEntity<?> addOwnerDetailInformation(@RequestBody AddOwnerInfoRequest ownerInfoRequest) throws ParseException {
        return new ResponseEntity<>(ownerService.addOwnerInfo(ownerInfoRequest), HttpStatus.OK);
    }

    @GetMapping(value = "/owner/all")
    public ResponseEntity<?> getAllOwnerDetailInformation(){
        return new ResponseEntity<>(ownerService.getAllOwner(), HttpStatus.OK);
    }



}
