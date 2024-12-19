package com.firstProject.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class NetworkConnection {
    private  String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public  void getConnection(){
        System.out.println("now internet connection was available");
    }
}
