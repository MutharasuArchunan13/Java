package com.hibernateExample.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateExample.demo.model.Course;
import com.hibernateExample.demo.service.CourseService;

    
@RestController
@RequestMapping("/api/courses")
public class ControllerClass {
    private final CourseService courseService;

    @Autowired
    public ControllerClass(CourseService courseService) {
        this.courseService = courseService;
    }

    // Get Course by ID (Cached)
    @GetMapping(value = "/{id}",produces = "application/json")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id)
            .map(course -> ResponseEntity.ok(course))
            .orElse(ResponseEntity.notFound().build());
    }

    // Update Course (Evicts Cache)
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(
        @PathVariable Long id, 
        @RequestBody Course courseDetails
    ) {
        courseDetails.setId(id);
        Course updatedCourse = courseService.updateCourse(courseDetails);
        return ResponseEntity.ok(updatedCourse);
    }

    // Delete Course (Evicts Cache)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.ok().build();
    }
}

