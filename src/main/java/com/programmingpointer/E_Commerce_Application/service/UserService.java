package com.programmingpointer.E_Commerce_Application.service;

import com.programmingpointer.E_Commerce_Application.model.User;
import com.programmingpointer.E_Commerce_Application.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public void registerUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
    }
}
