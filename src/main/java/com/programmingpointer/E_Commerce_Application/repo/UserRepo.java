package com.programmingpointer.E_Commerce_Application.repo;

import com.programmingpointer.E_Commerce_Application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
