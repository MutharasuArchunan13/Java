package com.cahcheloading.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cahcheloading.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * FROM user_details",nativeQuery = true)
    List<User> getAllUsers();
}
