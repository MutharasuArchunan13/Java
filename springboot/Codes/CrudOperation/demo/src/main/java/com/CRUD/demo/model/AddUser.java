package com.CRUD.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddUser {
    @Id
    private int id;
    private String username;

    public String toString(){
        return "id : " +id +" : username : " +username;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
