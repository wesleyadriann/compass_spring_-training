package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
    @Email
    @NotBlank(message = "userId is mandatory")
    public String userId;

    @NotBlank(message = "password is mandatory")
    public String password;

    @NotBlank(message = "fullname is mandatory")
    public String fullname;

    @NotBlank(message = "birthDate is mandatory")
    public String birthDate;
}
