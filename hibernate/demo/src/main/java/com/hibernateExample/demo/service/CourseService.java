package com.hibernateExample.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernateExample.demo.model.Course;
import com.hibernateExample.demo.repository.CourseRepository;
import com.hibernateExample.demo.repository.DepartmentRepo;

@Service
public class CourseService {
    @Autowired
     private CourseRepository courseRepo;
     @Autowired
     private DepartmentRepo DepartmentRepo;

    @Transactional
    // @Cacheable(value = "courseCache", key = "#id")
    public Optional<Course> getCourseById(Long id) {
        return courseRepo.findById(id);
    }

    // Method to update course (which evicts cache)
    @Transactional
    // @CacheEvict(value = "courseCache", key = "#course.id")
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    // Method to delete course (which evicts cache)
    @Transactional
    // @CacheEvict(value = "courseCache", key = "#id")
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }
}