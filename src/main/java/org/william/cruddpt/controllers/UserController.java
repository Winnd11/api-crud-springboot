package org.william.cruddpt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.william.cruddpt.entities.User;
import org.william.cruddpt.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/db")
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

    @PostMapping(value = "/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        Optional<User> result = repository.findById(id);
        if (result.isPresent()) {
            User userUpdate = result.get();
            userUpdate.setName(user.getName());
            userUpdate.setEmail(user.getEmail());
            userUpdate.setDepartment(user.getDepartment());

            return repository.save(userUpdate);
        } else {
            return null;
        }
    }
}
