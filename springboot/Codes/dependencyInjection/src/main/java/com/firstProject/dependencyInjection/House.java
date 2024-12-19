package com.firstProject.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class House {
    // POJO class --> plain old java object
    public  House(){
        System.out.println("house constructor");
    }
    private int doNo;
    private String name;
    @Autowired
    NetworkConnection modem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoNo() {
        return doNo;
    }

    public void setDoNo(int doNo) {
        this.doNo = doNo;
    }

    public void getInternet(){
        modem.getConnection();
    }

}
