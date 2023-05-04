package com.devsuperior.userdpt.controllers;
import com.devsuperior.userdpt.entities.User;
import com.devsuperior.userdpt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findALL(){
        List<User> result = repository.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
    @PutMapping(value = "/{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        //User result = repository.update(id, user);
    }
}