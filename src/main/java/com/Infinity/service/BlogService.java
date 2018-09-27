package com.Infinity.service;

import com.Infinity.domain.Blog;
import com.Infinity.domain.Catalog;
import com.Infinity.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    Blog saveBlog(Blog blog);

    void removeBlog(Long id);

    Blog updateBlog(Blog blog);

    Blog getBlogById(Long id);

    Page<Blog> listBlogsByTitleLike(User user, String title, Pageable pageable);

    Page<Blog> listBlogsByTitleLikeAndSort(User suser, String title, Pageable pageable);

    void readingIncrease(Long id);

    Blog createComment(Long blogId, String commentContent);

    void removeComment(Long blogId, long commentId);

    Blog createVote(Long blogId);

    void removeVote(Long blogId, Long voteId);

    Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable);
}
