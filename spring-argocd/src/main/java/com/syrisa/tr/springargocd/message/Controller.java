package com.syrisa.tr.springargocd.message;

import com.syrisa.tr.springargocd.entity.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @GetMapping("/message")
    public String message(){
        System.out.println("Hi from Spring");
        return "Hi from spring";
    }

    @PostMapping("/create/message")
    public ResponseEntity<Message> createMessage(@RequestBody Message message){
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}
