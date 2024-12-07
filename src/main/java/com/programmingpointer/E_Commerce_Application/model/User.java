package com.programmingpointer.E_Commerce_Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity(name = "users")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
}
