package com.example.cuisine.service.impl;

import com.example.cuisine.dao.model.Owner;
import com.example.cuisine.dao.model.Restaurant;
import com.example.cuisine.dao.repository.OwnerRepository;
import com.example.cuisine.dao.repository.RestaurantRepository;
import com.example.cuisine.dto.projection.RestaurantLocation;
import com.example.cuisine.dto.request.RestaurantRequest;
import com.example.cuisine.dto.request.UpdateRestaurantInfoRequest;
import com.example.cuisine.dto.response.RestaurantLocationResponse;
import com.example.cuisine.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
            System.out.println("owner id is " + owner.getId());
            restaurant.setOwnerId(owner);
        } else {
            System.out.println("owner : " + adminId + " not found !");
            return adminId + " add restaurant detail information failed !";
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

    @Override
    public List<Restaurant> getAllRestaurant(){
        return restaurantRepository.findAll();
    }

    @Transactional
    @Override
    public String updateRestaurantInfo(String restaurantId, UpdateRestaurantInfoRequest request){
        restaurantRepository.updateRestaurantInfoById(request.getName(), request.getImage(), request.getIntroduction(), request.getPromotion(), Long.valueOf(restaurantId));
        return restaurantId + " update success ! ";
    }

    @Transactional
    @Override
    public String deleteRestaurantInfo(String restaurantId){
        restaurantRepository.deleteById(Long.valueOf(restaurantId));
        return restaurantId + " delete success ! ";
    }

    @Override
    public RestaurantLocationResponse getRestaurantInfoWithLocation(String region){
        List<RestaurantLocation> restaurantList = restaurantRepository.findAllByLocationContaining(region);
//        System.out.println(restaurantList.get(0));
        return new RestaurantLocationResponse(restaurantList);
    }

    @Override
    public List<Restaurant> getRestaurantInfoWithName(String name){
        return restaurantRepository.findAllByNameContaining(name);
    }

}
