package com.example.H2CURD2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.H2CURD2.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
