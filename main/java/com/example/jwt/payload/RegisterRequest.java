package com.example.jwt.payload;

import lombok.*;
import java.util.Set;

@Getter @Setter
public class RegisterRequest {
    private String username;
    private String password;
    private Set<String> roles; // e.g. ["ROLE_USER"] or ["ROLE_ADMIN"]
}
