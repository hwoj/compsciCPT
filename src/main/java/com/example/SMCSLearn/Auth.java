package com.example.SMCSLearn;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth {
    @PostMapping(path = "/signup/student", consumes = "application/json")
    public void registerStudent(@RequestBody User student){

    }
}
