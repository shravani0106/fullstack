package com.codewithshravani.fullstackbackend.repository;

import com.codewithshravani.fullstackbackend.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser, Long> {

    LoginUser findByEmail(String email);

}