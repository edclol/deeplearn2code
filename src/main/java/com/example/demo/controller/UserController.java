/*
package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entry.setjson.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
public class UserController {


    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/user")
    public int create(@RequestBody User user) {

        return userMapper.insert("user.getName()",12);
//        return userService.create(user.getName(), user.getAge());
    }

    @GetMapping("/user/{name}")
    public List<User> getByName(@PathVariable String name) {
        return userService.getByName(name);
    }

    @DeleteMapping("/user/{name}")
    public int deleteByName(@PathVariable String name) {
        return userService.deleteByName(name);
    }

    @GetMapping("/user/count")
    public int getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/user/all")
    public int deleteAllUsers() {
        return userService.deleteAllUsers();
    }

}*/
