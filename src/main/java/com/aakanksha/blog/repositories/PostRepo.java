package com.aakanksha.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aakanksha.blog.entities.Category;
import com.aakanksha.blog.entities.Post;
import com.aakanksha.blog.entities.User;

import java.util.List;


public interface PostRepo extends JpaRepository<Post, Integer>{
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category cat);
    List<Post> findByTitleContaining(String title);
}
