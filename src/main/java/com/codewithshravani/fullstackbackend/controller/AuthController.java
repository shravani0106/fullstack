package com.codewithshravani.fullstackbackend.controller;

import com.codewithshravani.fullstackbackend.model.LoginUser;
import com.codewithshravani.fullstackbackend.repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin("http://localhost:3000")
public class AuthController {

    @Autowired
    private LoginUserRepository repo;

    // REGISTER USER
    @PostMapping("/register")
    public LoginUser register(@RequestBody LoginUser user){
        return repo.save(user);
    }

    // LOGIN USER
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginUser user){

        LoginUser existingUser = repo.findByEmail(user.getEmail());

        if(existingUser == null){
            return ResponseEntity.status(401).body("User not found");
        }

        if(!existingUser.getPassword().equals(user.getPassword())){
            return ResponseEntity.status(401).body("Invalid password");
        }

        return ResponseEntity.ok(existingUser);
    }

}