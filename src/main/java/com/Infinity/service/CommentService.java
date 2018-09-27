package com.Infinity.service;

import com.Infinity.domain.Comment;

public interface CommentService {

    Comment getCommentById(Long id);

    void removeComment(Long id);
}
