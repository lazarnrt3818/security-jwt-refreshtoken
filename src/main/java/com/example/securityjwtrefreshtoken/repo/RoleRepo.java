package com.example.securityjwtrefreshtoken.repo;

import com.example.securityjwtrefreshtoken.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByName(String name);
}

