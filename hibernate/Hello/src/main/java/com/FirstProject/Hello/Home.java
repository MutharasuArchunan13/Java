package com.FirstProject.Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Home { // home
    private  int doNo;
    private String Name;
    public Home(){
        System.out.println("home home constructor");
    }
    
    @Autowired
    private InternetConnection modem ;

    public int getDoNo() {
        return doNo;
    }

    public void setDoNo(int doNo) {
        this.doNo = doNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void connection(){
        System.out.println("Internet connection.......requested...");
        modem.internet();

        // advantages in springBoot :
        /*
         * auto - configuration
         * it give the basic set-up
         * war and jar files maintaining  -> maintain the version --> bill of materials
         * embedded server
         */
    }
}
