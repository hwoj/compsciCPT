package com.example.SMCSLearn;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class PersonalityController {

    @GetMapping("/personality")
    @CrossOrigin("http://localhost:4200")
    public Question[] personalityQuestions() {
        Question[] questions = new Question[32];
        //Judging vs Perceiving
        questions[0] = new Question("Do you remember small details from the past?");
        questions[1] = new Question("Do you like to make wishes for events to happen?");
        questions[2] = new Question("Do you think about solutions with only logic in mind?");
        questions[3] = new Question("Do you always follow the rules?");
        questions[4] = new Question("Do you like to look for one clear answer?");
        questions[5] = new Question("Do you have innovative ideas?");
        questions[6] = new Question("Are you very organized?");
        questions[7] = new Question("Do you start a project right away?");
        //introvert and extrovert
        questions[8] = new Question("Do you like to go out to the movies with friends?");
        questions[9] = new Question("Do you like to play games by yourself?");
        questions[10] = new Question("Do you enjoy reading?");
        questions[11] = new Question("Do you enjoy meeting new people?");
        questions[12] = new Question("Would you rather stay in then go out?");
        questions[13] = new Question("Do you like to reflect on your experiences?");
        questions[14] = new Question("Do you like being the centre of attention?");
        questions[15] = new Question("Do you usually get noticed right away in class?");
        //Thinking and feeling
        questions[16] = new Question("Are you not interested in other people's problems?");
        questions[17] = new Question("Are you concerned about others?");
        questions[18] = new Question("Do you use others for your own ends?");
        questions[19] = new Question("Do you ask a friend before making an important choice");
        questions[20] = new Question("Are you indifferent to the feelings of others?");
        questions[21] = new Question("Do you obstruct others' plans?");
        questions[22] = new Question("Do you boast about your virtues?");
        questions[23] = new Question("Do you think you are better then others?");
        //Sensing and intuition
        questions[24] = new Question("Do you look at things at a literal level?");
        questions[25] = new Question("Do you focus on what happened in the past");
        questions[26] = new Question("Do you describe past events with great detail?");
        questions[27] = new Question("Do you pay attention in class?");
        questions[28] = new Question("Do you have an organized binder?");
        questions[29] = new Question("Do you bring all materials needed to class?");
        questions[30] = new Question("Do you take pride in your work?");
        questions[31] = new Question("Are you interested in what you are learning?");

        //For questions they are divided up from 0-7 as sensing & intuition, 8-15 as introvert and extrovert,
        // 16-23 as Thinking and feeling and the rest for Judging vs. Perceiving

        return questions;
    }


    RestTemplate restTemplate;
/*
    @PostMapping(path = "/personality", consumes = "application/json")
    public String receiveAnswers(@RequestBody String[] answers, @RequestParam(value = "id") int id) {
        String[] responses;
        responses = answers;

        String JP;
        String EI;
        String TF;
        String SI;

        int judging_score=0;
        int extro_score =0;
        int sensing_score=0;
        int thinking_score=0;

        for (int i = 0; i < 9; i++) {

            if (responses[i].equals("0")) {
                judging_score++;
            } else if (responses[i].equals("1")) {
                judging_score += 2;
            } else if (responses[i].equals("2")) {
                judging_score += 3;
            } else {
                judging_score += 4;
            }
        }

        for (int i = 9; i < 17; i++) {
            if (responses[i].equals("0")) {
                extro_score++;
            } else if (responses[i].equals("1")) {
                extro_score += 2;
            } else if (responses[i].equals("2")) {
                extro_score += 3;
            } else {
                extro_score += 4;
            }
        }
        for (
                int i = 17;
                i < 25; i++) {
            if (responses[i].equals("0")) {
                thinking_score++;
            } else if (responses[i].equals("1")) {
                thinking_score += 2;
            } else if (responses[i].equals("2")) {
                thinking_score += 3;
            } else {
                thinking_score += 4;
            }
        }
        for (
                int i = 25;
                i < 33; i++) {
            if (responses[i].equals("0")) {
                sensing_score++;
            } else if (responses[i].equals("1")) {
                sensing_score += 2;
            } else if (responses[i].equals("2")) {
                sensing_score += 3;
            } else {
                sensing_score += 4;
            }

        }

        if (judging_score >= 17) {
            JP = "J";
        } else {
            JP = "P";
        }

        if (extro_score >= 17) {
            EI = "E";
        } else {
            EI = "I";
        }

        if (thinking_score >= 17) {
            TF = "T";
        } else {
            TF = "F";
        }

        if (sensing_score >= 17) {
            SI = "S";
        } else {
            SI = "I";
        }

        return (EI + SI + TF + JP);
    }

    public int[] personalitycompare() {

        String Student_Type;
        int[] great;
        int[] good;
        int[] bad;

        if (Student_Type.equals("ENTJ")){
            //Best types for a relationship: ESTJ, ISTP, ENTJ, ENFJ, INTJ
            //Possible types for a relationship: ISTJ, ESTP, ENTP, INTP, INFJ, ENFP
            //Least likely types for a relationship: ESFJ, ISFJ, ESFP, ISFP, INFP

        }
        else if (Student_Type.equals("ENTP")){

            //Best types for a relationship: ENTP, INTP, INFJ
            //Possible types for a relationship: ESTJ, ISTJ, ESTP, ESFP, ENTJ, ENFP, INFP, ENFJ
            //Least likely types for a relationship: ESFJ, ISFJ, ISTP, ISFP, INTJ
        }
        else if (Student_Type.equals("INTJ")){
            //Best types for a relationship: ESTJ, INTJ, ISTP, ENTJ
            //Possible types for a relationship: INTP, INFJ, INFP, ENFP
            //Least likely types for a relationship: ESFJ, ISFJ, ESTP, ESFP, ISFP, ENTP, INFP, ENFJ
        }
        else if (Student_Type.equals("INTP")){
            //Best types for a relationship: ENTP, INTP, INTJ
            //Possible types for a relationship: ESTJ, ISTJ, ESTP, ENTJ, ENFJ, INFJ, ENFP, INFP
            //Least likely types for a relationship: ESFJ, ISFJ, ISTP, ESFP, ISFP
        }
        else if (Student_Type.equals("ESTJ")){
            //Best types for a relationship: ISTJ, ESFJ, ISFJ, ENTJ, INTJ, ISTP
            //Possible types for a relationship: ENTP, INTP, ESTP, ESFP, ISFP
            //Least likely types for a relationship: ESTJ, ENFJ, INFJ, INFP, ENFP
        }
        else if (Student_Type.equals("ESFJ")){
            //Best types for a relationship: ESTJ, ENFP
            //Possible types for a relationship: ISFJ, ESFJ, ENFJ, INFP, ISFP, ISTP, ESFP
            //Least likely types for a relationship: ESTP, ENTJ, INTJ, ENTP, INTP, INFJ, ISTJ
        }
        else if (Student_Type.equals("ISTJ")){

            //Best types for a relationship: ESTJ, ISTJ, INTJ, ISTP, ESTP
            //Possible types for a relationship: ENTJ, INTP, ENFJ, INFJ, ISFJ, ISFP, ENTP
            //Least likely types for a relationship: ESFJ, ESFP, ENFP, INFP
        }
        else if (Student_Type.equals("ISFJ")){
            //Best types for a relationship: ISFJ, ENFJ, ESTJ
            //Possible types for a relationship: ESFJ, ESTP, ISFP, INFJ, INFP, ESFP, ISTJ, ISFP
            //Least likely types for a relationship: ENTJ, INTJ, ENTP, INTP, ENFP
        }
        else if (Student_Type.equals("ENFJ")){
            //Best types for a relationship: ISFJ, ENFJ, ENTJ, INFJ, ENFP, INFP
            //Possible types for a relationship: ESFJ, ESFP, ISFP, INTP, ISTJ, ENTP
            //Least likely types for a relationship: ESTJ, ESTP, ISTP, INTJ
        }
        else if (Student_Type.equals("ENFP")){
            //Best types for a relationship: INFJ, INFP, ENFJ, ENFP, ESFJ
            //Possible types for a relationship: ENTJ, ENTP, INTJ, INTP,ESFP, ISFP
            //Least likely types for a relationship: ISTJ, ESTJ, ISTP, ESTP, ISFJ
        }
        else if (Student_Type.equals("INFJ")){
            //Best types for a relationship: ENTP, ENFP, INFJ, INFP, ENFJ
            //Possible types for a relationship: ISFJ, ESFP, ISFP, ENTJ, INTJ, INTP, ISTJ
            //Least likely types for a relationship: ESTJ, ESFJ, ESTP, ISTP
        }
        else if (Student_Type.equals("INFP")){
            //Best types for a relationship: ENFP, INFP, ENFJ, INFJ
            //Possible types for a relationship: ISFJ, ESFJ, ESFP, ISFP, ENTP, INTP
            //Least likely types for a relationship: ESTJ, ISTJ, ESTP, ISTP, ENTJ, INTJ
        }
        else if (Student_Type.equals("ESTP")){
            //Best types for a relationship: ISTJ, ESTP, ISTP, ESFP
            //Possible types for a relationship: ESTJ, ISFP, ENTJ, ENTP, INTP, ISFJ
            //Least likely types for a relationship: ESFJ, INTJ, ENFJ, INFJ, ENFP, INFP
        }
        else if (Student_Type.equals("ESFP")){
            //Best types for a relationship: ESTP, ISFP
            //Possible types for a relationship: ESTJ, ESFJ, ISFJ, ESFP, ENTP, ENFJ, INFJ, ENFP, INFP
            //Least likely types for a relationship: ISTJ, ISTP, ENTJ, INTJ, INTP
        }
        else if (Student_Type.equals("ISTP")){

            //Best types for a relationship: ESTJ, ISTJ, ENTJ, ESTP
            //Possible types for a relationship: ESFJ, ISFP, INTJ, ISFJ
            //Least likely types for a relationship: ISTP, ESFP, ENTP, INTP, ENFJ, INFJ, ENFP, INFP
        }
        else if (Student_Type.equals("ISFP")){
            //Best types for a relationship: ESFP, ISFP
            //Possible types for a relationship: ESTP, ESTJ, ESFJ, ISTP, ENFJ, INFJ, INFP, ISFJ, ISTJ, ENFP
            //Least likely types for a relationship: ENTJ, INTJ, ENTP, INTP
        }

        return(great,good,bad);
    }
    */



}