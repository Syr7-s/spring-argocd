package com.syrisa.tr.springargocd.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @GetMapping("/message")
    public String message(){
        System.out.println("Hi from Spring");
        return "Hi from spring";
    }
}
