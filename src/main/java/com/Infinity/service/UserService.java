package com.Infinity.service;

import com.Infinity.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

// 用户服务接口
public interface UserService {

    User saveUser(User user);

    User registerUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    // 根据用户名进行分页模糊查询
    Page<User> listUsersByNameLike(String name, Pageable pageable);
}
