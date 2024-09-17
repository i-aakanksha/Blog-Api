package com.aakanksha.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aakanksha.blog.entities.User;

public interface  UserRepo extends JpaRepository<User, Integer>{

}
