package com.example.cuisine.service.impl;

import com.example.cuisine.dao.model.Owner;
import com.example.cuisine.dao.repository.OwnerRepository;
import com.example.cuisine.dto.request.AddOwnerInfoRequest;
import com.example.cuisine.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerServiceImpl(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    @Override
    public String addOwnerInfo(AddOwnerInfoRequest addOwnerInfoRequest){

        Owner owner = new Owner();
        owner.setName(addOwnerInfoRequest.getName());
        owner.setGender(addOwnerInfoRequest.getGender());
        owner.setPhone(addOwnerInfoRequest.getPhone());
        ownerRepository.save(owner);

        return "new owner add information success !";
    }
}
