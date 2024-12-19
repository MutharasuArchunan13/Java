package com.crudOperation.webapp.controller;

import com.crudOperation.webapp.model.UsersList;
import com.crudOperation.webapp.useDAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/users")
public class WebAppController {
    @Autowired
    UserDao userDaoObj;
    private UsersList user;

//    @RequestMapping("index")
//    public  String index(){
//        return "index.jsp";
//    }

    @PostMapping
    public ResponseEntity<UsersList> addUser(@RequestBody UsersList user){
        UsersList savedUser = userDaoObj.save(user);
        return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
    }

   @GetMapping("/{id}")
    public  ResponseEntity<UsersList> getUser(@PathVariable int id){
        return userDaoObj.findById(id).map(
                user -> new ResponseEntity<>(user,HttpStatus.OK)
        ).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping("deleteUser")
    public ModelAndView deleteUser(@RequestParam int id){
        UsersList user = userDaoObj.findById(id).orElse(new UsersList());
        userDaoObj.deleteById(id);
        ModelAndView mov = new ModelAndView("deleteUser.jsp");
        mov.addObject("user", user);
        return mov;
    }
}
