package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class UserEntity {
    
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PASSWORD")
    public String password;

    @Column(name = "FULLNAME")
    public String fullname;

    @Column(name = "BIRTH_DATE")
    public String birthDate;
}
