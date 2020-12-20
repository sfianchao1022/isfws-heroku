package com.example.cuisine.dao.model;

import lombok.Data;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    private int age;

    private String gender;

    private String facebook;

    private String phone;

    private String eatingHabit;
}

