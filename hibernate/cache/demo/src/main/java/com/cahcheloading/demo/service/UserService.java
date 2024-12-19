package com.cahcheloading.demo.service;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.cahcheloading.demo.model.User;
import com.cahcheloading.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // public UserService(UserRepository userRepository) {
    //     this.userRepository = userRepository;
    // }

    @Transactional
    public void getUserById(Long userId) {
        /*
         * 1-st level cache -> it's called as session cache
         * if you are in same session that time if you try to access the same data again it wont execute the query
         * to database instead of it take from the session.
         */
        // Fetch User for the first time (Query sent to DB)
       User user1 = userRepository.findById(userId).orElseThrow();
       System.out.println("First fetch "+user1);

       User user2 = userRepository.findById(userId).orElseThrow();
       System.out.println("Second fetch "+user2);
       user2.setName("Mutharasu");
       userRepository.save(user2);

       User user3 = userRepository.findById(userId).orElseThrow();
       System.out.println("Third fetch "+user3);

    }

    @Cacheable(value = "userCache", key = "#userId", unless = "#result == null")
    public User getUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println("Fetched from DB: " + user);
        return user;
    }

    @Cacheable(value ="usersListCache",key = "'AllUsers'", unless = "#result == null")
    public List<User> getUsers(){
        System.out.println("Fetching the users from db...");
        return userRepository.getAllUsers();
    }

    //Whenever the new user inserted to db need to deactivate the cache
    @CacheEvict(cacheNames = {"userCache","usersListCache"},allEntries = true)
    @Transactional
    public User addUser(User newUser){
        System.out.println("New user going to create so deactivate the existing cache");
        return userRepository.save(newUser);
    }
    
}


