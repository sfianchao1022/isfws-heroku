package com.example.cuisine.dao.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "owner")
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    private String gender;

    private String phone;

//
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreationTimestamp
//    private Date created_at;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @UpdateTimestamp
//    private Date modified_at;

}
