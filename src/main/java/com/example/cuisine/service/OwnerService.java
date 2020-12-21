package com.example.cuisine.service;

import com.example.cuisine.dao.model.Owner;
import com.example.cuisine.dto.request.AddOwnerInfoRequest;

import java.util.List;

public interface OwnerService {

    String addOwnerInfo(AddOwnerInfoRequest addOwnerInfoRequest);

    List<Owner> getAllOwner();
}
