package com.example.securityjwtrefreshtoken;

import com.example.securityjwtrefreshtoken.model.Role;
import com.example.securityjwtrefreshtoken.model.User;
import com.example.securityjwtrefreshtoken.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityJwtRefreshTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJwtRefreshTokenApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
          userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User("John Travolta","john","password",new ArrayList<>()));
            userService.saveUser(new User("Will Smith","will","password",new ArrayList<>()));
            userService.saveUser(new User("Jim Carry","jim","password",new ArrayList<>()));
            userService.saveUser(new User("Arnold Svarceneger","arnold","password",new ArrayList<>()));


            userService.addRoleToUser("will","ROLE_MANAGER");
            userService.addRoleToUser("jim","ROLE_ADMIN");
            userService.addRoleToUser("arnold","ROLE_SUPER_ADMIN");
            userService.addRoleToUser("arnold","ROLE_ADMIN");
            userService.addRoleToUser("arnold","ROLE_USER");
            userService.addRoleToUser("john","ROLE_USER");
            userService.addRoleToUser("john","ROLE_MANAGER");


        };
    }

}
