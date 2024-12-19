package com.crudOperation.webapp.useDAO;

import com.crudOperation.webapp.model.UsersList;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UsersList,Integer> {
}
