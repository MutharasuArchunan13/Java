package com.hibernateExample.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateExample.demo.model.Department;



@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long>{

}