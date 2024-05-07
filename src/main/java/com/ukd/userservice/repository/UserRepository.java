package com.ukd.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ukd.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
