// package com.cahcheloading.demo.service;

// import jakarta.transaction.Transactional;

// import org.springframework.cache.annotation.Cacheable;
// import org.springframework.stereotype.Service;

// import com.cahcheloading.demo.model.User;
// import com.cahcheloading.demo.repository.UserRepository;

// @Service
// public class UserService {

//     private final UserRepository userRepository;

//     public UserService(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Transactional
//     public void demonstrateFirstLevelCache(Long userId) {
//         // Fetch User for the first time (Query sent to DB)
//         User user1 = userRepository.findById(userId).orElseThrow();
//         System.out.println("First fetch: " + user1);

//         // Fetch the same User again (No Query sent to DB)
//         User user2 = userRepository.findById(userId).orElseThrow();
//         System.out.println("Second fetch: " + user2);

//         // Modify and save the user
//         user1.setName("Updated Name");
//         userRepository.save(user1);

//         // Fetch again (still cached in the session)
//         User user3 = userRepository.findById(userId).orElseThrow();
//         System.out.println("Third fetch: " + user3);
//     }


//     @Transactional
//     public User addUser(User user){
//         return userRepository.save(user);
//     }

//     @Transactional
//     @Cacheable(key = "#userId", value = "userCache")
//     public User getUser(Long userId) {
//     // First fetch from DB, which will be cached
//     User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
//     System.out.println("Fetched from DB: " + user);
//     return user; // This will be cached and used for subsequent calls
// }
// }

