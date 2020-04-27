package com.example.SMCSLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class UserController {

    @GetMapping("/user")
    public User show(@RequestParam(value = "id", defaultValue = "1")int id){
        User[] users = new User[10];
        users[0] = new User(1,"Henry", "Wojnicki", "hwojnicki41@gmail.com");
        return users[id-1];
    }

    @GetMapping("/json")
    public Tutor jsonAttempt() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(getClass().getResource("/json/tutors.json").getFile());

        Tutor tut = mapper.readValue(file, Tutor.class);
        return tut;
    }
}
