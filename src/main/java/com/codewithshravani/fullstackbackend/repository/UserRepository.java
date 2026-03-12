package com.codewithshravani.fullstackbackend.repository;

import com.codewithshravani.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
