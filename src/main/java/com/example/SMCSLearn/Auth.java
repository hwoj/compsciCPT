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

        User[] students = new User[]{};
        User s = new User();
        try {
            File file = new File(getClass().getResource("/json/students.json").getFile());

            User[] stu = mapper.readValue(file, User[].class);
            int leng = stu.length;
            User[] stus = new User[leng + 1];
            for(int i = 0; i < stu.length; i++){
                stus[i] = stu[i];
            }
            student.setId((long) leng);
            stus[leng] = student;
            s = student;
            students = stus;
            FileOutputStream outputStream = new FileOutputStream(file);
            String jsonString = mapper.writeValueAsString(stus);
            byte[] strBytes = jsonString.getBytes();
            outputStream.write(strBytes);
            outputStream.close();


        } catch (IOException e){
            e.printStackTrace();
        }


        return s;

    }

    @PostMapping(path = "/signup/tutor", consumes = "application/json")
    public Tutor registerTutor(@RequestBody Tutor tutor) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Tutor t = new Tutor();
        Tutor[] tuts = new Tutor[]{};
        try {
            File file = new File(getClass().getResource("/json/tutors.json").getFile());
            Tutor[] tut = mapper.readValue(file, Tutor[].class);
            int leng = tut.length;
            Tutor[] tutors = new Tutor[leng + 1];
            for(int i = 0; i < tut.length; i++){
                tutors[i] = tut[i];
            }
            tutor.setId((long) leng);
            t = tutor;
            tutors[leng] = tutor;

            FileOutputStream outputStream = new FileOutputStream(file);
            String jsonString = mapper.writeValueAsString(tutors);
            byte[] strBytes = jsonString.getBytes();
            outputStream.write(strBytes);
            outputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        return t;


    }

    @PostMapping(path = "login/student",consumes = "application/json")
    public User loginStudent(@RequestBody LoginInfo info) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File(getClass().getResource("/json/students.json").getFile());
        User user = null;
        User[] arr = mapper.readValue(file, User[].class);

        for(int i = 0; i < arr.length; i++){
            if (arr[i].getEmail().equals(info.getEmail()) && arr[i].getPassword().equals(info.getPassword())){
                return arr[i];
            }
        }

        return null;


    }
}
