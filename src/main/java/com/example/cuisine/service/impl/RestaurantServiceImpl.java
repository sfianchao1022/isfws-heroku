package com.example.cuisine.service.impl;

import com.example.cuisine.dao.model.Owner;
import com.example.cuisine.dao.model.Restaurant;
import com.example.cuisine.dao.repository.OwnerRepository;
import com.example.cuisine.dao.repository.RestaurantRepository;
import com.example.cuisine.dto.request.RestaurantRequest;
import com.example.cuisine.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final OwnerRepository ownerRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, OwnerRepository ownerRepository){
        this.restaurantRepository = restaurantRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public String addRestaurantInfo(String adminId, RestaurantRequest restaurantRequest) throws ParseException {

        Restaurant restaurant = new Restaurant();
        Optional<Owner> ownerOptional = ownerRepository.findById(Long.valueOf(adminId));

        if (ownerOptional.isPresent()){
            Owner owner = ownerOptional.get();
            System.out.println(owner.getId());
            restaurant.setOwnerId(owner);
        } else {
            System.out.println("owner : " + adminId + " not found !");
        }

        restaurant.setStartTime(restaurantRequest.getStartTime());
        restaurant.setEndTime(restaurantRequest.getEndTime());
        restaurant.setName(restaurantRequest.getName());
        restaurant.setLocation(restaurantRequest.getLocation());
        restaurant.setWebsite(restaurantRequest.getWebsite());
        restaurant.setPhone(restaurantRequest.getPhone());
        restaurant.setImage(restaurantRequest.getImage());
        restaurant.setIntroduction(restaurantRequest.getIntroduction());
        restaurant.setPromotion(restaurantRequest.getPromotion());
        restaurantRepository.save(restaurant);

        return adminId + " add restaurant detail information success !";
    }
}
