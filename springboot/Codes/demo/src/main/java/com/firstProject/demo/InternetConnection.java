package com.firstProject.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
    private int ip;

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public void establishConnection(){
        System.out.println("internet connection enabled");
    }
}
