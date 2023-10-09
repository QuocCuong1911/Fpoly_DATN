package com.fpoly.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.fpoly.entity.User;
import com.fpoly.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserRestController {
	@Autowired
	private UserRepository UserRepository;
	
	@GetMapping("/users")
	public List<User> fetchUser(){
		return UserRepository.findAll();
		
	}
	
	// GET - Retrieve a single user by ID
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getOne(@PathVariable("id") int id) {
        User user = UserRepository.findById(id).get();
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST - Create a new user
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = UserRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    // PUT - Update an existing user
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User updatedUser) {
        User user = UserRepository.findById(id).get();
        if (user != null) {
            User updated = UserRepository.save(updatedUser);
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE - Delete a user by ID
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
        User user = UserRepository.findById(id).get();
        if (user != null) {
        	UserRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
