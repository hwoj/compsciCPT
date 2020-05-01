package com.example.SMCSLearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class Auth {
    @PostMapping(path = "/signup/student", consumes = "application/json")
    public User registerStudent(@RequestBody User student) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();


        String jsonString = mapper.writeValueAsString(student);
        try {
            File file = new File(getClass().getResource("/json/students.json").getFile());
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] strBytes = jsonString.getBytes();
            outputStream.write(strBytes);
            outputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }


        return student;

    }

    @PostMapping(path = "/signup/tutor", consumes = "application/json")
    public Tutor registerTutor(@RequestBody Tutor tutor) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();


        String jsonString = mapper.writeValueAsString(tutor);
        try {
            File file = new File(getClass().getResource("/json/tutors.json").getFile());
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] strBytes = jsonString.getBytes();
            outputStream.write(strBytes);
            outputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }


        return tutor;

    }
}
