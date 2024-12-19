package com.example.First.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype") // singleton
public class House {
    private int doNo;
    private String name;

    @Autowired // 1. class path scanning -> if the object just establish the connection
    @Qualifier("jio")
    private InternetProvider modem; // broken the rule as interface object creation

    public House(){
        System.out.println("this is the house constructor");
    }
    public int getDoNo() {
        return doNo;
    }
    public void setDoNo(int doNo) {
        this.doNo = doNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void internet(){
        modem.internetConnection();
    }
}
