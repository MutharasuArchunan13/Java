package com.CRUD.demo.Controller;

import com.CRUD.demo.DAO.SaveUser;
import com.CRUD.demo.model.AddUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private SaveUser userDAO;

    // Create - POST
    @PostMapping
    public ResponseEntity<AddUser> createUser(@RequestBody AddUser user) {
        AddUser savedUser = userDAO.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Read - GET (single user)
    @GetMapping("/{id}")
    public ResponseEntity<AddUser> getUser(@PathVariable int id) {
        return userDAO.findById(id)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Read - GET (all users)
    @GetMapping
    public ResponseEntity<List<AddUser>> getAllUsers() {
        List<AddUser> users = (List<AddUser>) userDAO.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Update - PUT
    @PutMapping("/{id}")
    public ResponseEntity<AddUser> updateUser(@PathVariable int id, @RequestBody AddUser user) {
        if (!userDAO.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        user.setId(id); // Ensure the ID matches the path variable
        AddUser updatedUser = userDAO.save(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Delete - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        if (!userDAO.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}