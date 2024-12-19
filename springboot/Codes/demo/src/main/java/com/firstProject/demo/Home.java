package com.firstProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Home {
    @Autowired
    InternetConnection modem;
    public  Home(){
        System.out.println("Home constructor");
    }
    private  int doNo;
    private int Name;

    public int getDoNo() {
        return doNo;
    }

    public void setDoNo(int doNo) {
        this.doNo = doNo;
    }

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    public void network(){
        modem.establishConnection();
    }

}
