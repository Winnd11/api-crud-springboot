package org.william.cruddpt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.william.cruddpt.entities.User;
import org.william.cruddpt.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/get")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping(value = "/user")
    public List<User> getAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping(value = "/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping(value = "/insert")
    public User insertUser(@RequestBody User user) {
        return repository.save(user);
    }
}
