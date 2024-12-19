package com.mvsConcept.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcomeClass {
    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    private String greetings;

    @GetMapping("index")
    public String index(){
        return "index.jsp";
    }
    @GetMapping("indexe")
    public String index1(){
        return "index.jsp";
    }
    @GetMapping("indexe")
    public String index3(){
        return "index.jsp";
    }
}
