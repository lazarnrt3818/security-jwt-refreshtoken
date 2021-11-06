package com.example.securityjwtrefreshtoken.repo;

import com.example.securityjwtrefreshtoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
