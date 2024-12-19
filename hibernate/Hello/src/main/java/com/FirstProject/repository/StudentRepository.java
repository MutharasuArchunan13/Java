package com.FirstProject.repository;

import org.springframework.stereotype.Repository;

import com.FirstProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
