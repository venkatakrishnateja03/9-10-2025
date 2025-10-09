package com.example.jwt;

import com.example.jwt.model.Role;
import com.example.jwt.repository.RoleRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public ApplicationRunner runner(RoleRepository roleRepository) {
        return args -> {
            if (!roleRepository.findByName("ROLE_USER").isPresent()) {
                roleRepository.save(new Role(null,"ROLE_USER"));
            }
            if (!roleRepository.findByName("ROLE_ADMIN").isPresent()) {
                roleRepository.save(new Role(null,"ROLE_ADMIN"));
            }
        };
    }
}
