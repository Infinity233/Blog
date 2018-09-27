package com.Infinity.repository;

import com.Infinity.domain.Blog;
import com.Infinity.domain.Catalog;
import com.Infinity.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    Page<Blog> findByUserAndTitleLike(User user, String title, Pageable pageable);

    Page<Blog> findByUserAndTitleLikeOrderByCreateTimeDesc(User user, String title, Pageable pageable);

    Page<Blog> findByCatalog(Catalog catalog, Pageable pageable);

    Page<Blog> findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(String title,User user,String tags,User user2,Pageable pageable);
}
