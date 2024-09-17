package com.aakanksha.blog.repositories;

import com.aakanksha.blog.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

    
} 
