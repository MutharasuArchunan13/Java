package com.CRUD.demo.DAO;


import com.CRUD.demo.model.AddUser;
import org.springframework.data.repository.CrudRepository;

public interface SaveUser extends CrudRepository<AddUser,Integer> {

}
