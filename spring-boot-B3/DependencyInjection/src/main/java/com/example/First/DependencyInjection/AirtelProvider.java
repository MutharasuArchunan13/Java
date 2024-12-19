package com.example.First.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelProvider implements InternetProvider {
    private String ipAddress;
    private String name;
    private int price;

    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void internetConnection(){
        System.out.println("Airtel Now you have the internet connection.... enjoy your day");
    }
}
