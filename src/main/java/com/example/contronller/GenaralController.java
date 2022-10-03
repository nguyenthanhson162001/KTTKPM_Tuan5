package com.example.contronller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class GenaralController {
    @GetMapping("/all")
    public String all() {
        return "ok";
    }
 
}
