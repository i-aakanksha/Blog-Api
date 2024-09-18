package com.aakanksha.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aakanksha.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
