package com.example.jwt.payload;

import lombok.*;

@Getter @Setter
public class AuthRequest {
    private String username;
    private String password;
}
