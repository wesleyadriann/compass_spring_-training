package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.example.demo.dto.UserResponseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.services.UserService;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/create_user",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody UserDTO user) {
        return userService.create(user);
    }
}
