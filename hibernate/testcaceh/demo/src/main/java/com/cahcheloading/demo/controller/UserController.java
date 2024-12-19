// package com.cahcheloading.demo.controller;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseStatus;
// import org.springframework.web.bind.annotation.RestController;

// import com.cahcheloading.demo.model.User;
// import com.cahcheloading.demo.service.UserService;

// // @RestController
// public class UserController {

//     private final UserService userService;

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     // @GetMapping("/test-cache")
//     // public String testFirstLevelCache(@RequestParam(name = "user_id") Long userId) {
//     //     userService.demonstrateFirstLevelCache(userId);
//     //     return "Check console for logs!";
//     // }
//     @GetMapping("/users/{userId}")  // Make sure the variable name is consistent
//     public ResponseEntity<User> getUser(@PathVariable Long userId) {
//     User gotUser = userService.getUser(userId);
//     return ResponseEntity.ok(gotUser);
// }

//     @PostMapping("/add-user")
//     public ResponseEntity<User> addUser(@RequestBody User user){
//         User savedUser = userService.addUser(user);
//         return ResponseEntity.ok(savedUser);
//     }

// }
