package com.spring.web.web;

import com.spring.web.domain.User;
import com.spring.web.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.cache.annotation.Cacheable;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user = userRepository.findByUserName("aa");
        System.out.println("若下面没有出现\"无缓存的时候调用\"字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/getUsers")
    @Cacheable(value="key-Users")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        System.out.println("若下面没有出现\"无缓存的时候调用\"字样且能打印出数据表示测试成功");
        return users;
    }

}
