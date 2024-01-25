package com.example.demo.services;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.repositories.UserRepository;
import com.example.demo.entities.UserEntity;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public ResponseEntity<UserResponseDTO> create(UserDTO user) {

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setBirthDate(user.getBirthDate());
        userEntity.setFullname(user.getFullname());

        String password = user.getPassword();
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());

        userEntity.setPassword(encodedPassword);

        UserResponseDTO response = new UserResponseDTO();
        try {
            repository.save(userEntity);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception error) {
            response.setMsg("Error to created user, Exception: " + error.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

    }
}
