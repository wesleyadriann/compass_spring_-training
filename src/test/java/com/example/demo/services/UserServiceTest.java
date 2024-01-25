package com.example.demo.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.repositories.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    // @Mock
    // private UserRepository userRepository;

    @InjectMocks
    private UserService userService;
}
