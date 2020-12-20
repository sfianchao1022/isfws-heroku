package com.example.cuisine.dao.repository;

import com.example.cuisine.dao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
