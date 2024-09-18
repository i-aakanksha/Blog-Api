package com.aakanksha.blog.services;

import com.aakanksha.blog.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto,  Integer postId);
    void deleteComment(Integer commentId);
   
}
