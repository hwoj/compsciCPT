package com.example.SMCSLearn;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


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


    @PostMapping(path = "/personality-testing", consumes = "application/json")
    public String bad(@RequestBody String ous) {
        return ous;
    }

    @PostMapping(path = "/personality-test/{userType}/{userEmail}", consumes = "application/json")
    public String receiveAnswers(@RequestBody ResponseObjectToString answers, @PathVariable(value = "userType") String userType, @PathVariable(value = "userEmail") String userEmail) throws IOException {


        String JP;
        String EI;
        String TF;
        String SN;

        int judging_score = 0;
        int extro_score = 0;
        int sensing_score = 0;
        int thinking_score = 0;
        int i = 0;


        if (answers.getAnswer1().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer1().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer1().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer2().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer2().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer2().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer3().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer3().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer3().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer4().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer4().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer4().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer5().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer5().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer5().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer6().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer6().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer6().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer7().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer7().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer7().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer8().equals("0")) {
            judging_score++;
        } else if (answers.getAnswer8().equals(("1"))) {
            judging_score += 2;
        } else if (answers.getAnswer8().equals("2")) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }

        if (answers.getAnswer9().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer9().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer9().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer10().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer10().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer10().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer11().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer11().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer11().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer12().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer12().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer12().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer13().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer13().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer13().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer14().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer14().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer14().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer15().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer15().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer15().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer16().equals("0")) {
            extro_score++;
        } else if (answers.getAnswer16().equals("1")) {
            extro_score += 2;
        } else if (answers.getAnswer16().equals("2")) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }

        if (answers.getAnswer17().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer17().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer17().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer18().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer18().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer18().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer19().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer19().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer19().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer20().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer20().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer20().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer21().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer21().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer21().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer22().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer22().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer22().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer23().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer23().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer23().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer24().equals("0")) {
            thinking_score++;
        } else if (answers.getAnswer24().equals("1")) {
            thinking_score += 2;
        } else if (answers.getAnswer24().equals("2")) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }

        if (answers.getAnswer25().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer25().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer25().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer26().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer26().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer26().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer27().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer27().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer27().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer28().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer28().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer28().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer29().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer29().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer29().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer30().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer30().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer30().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer31().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer31().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer31().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
        }

        if (answers.getAnswer32().equals("0")) {
            sensing_score++;
        } else if (answers.getAnswer32().equals("1")) {
            sensing_score += 2;
        } else if (answers.getAnswer32().equals("2")) {
            sensing_score += 3;
        } else {
            sensing_score += 4;
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
            SN = "S";
        } else {
            SN = "N";
        }

        if (userType.equals(("student"))) {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File(getClass().getResource("/json/students.json").getFile());

            User[] arr = mapper.readValue(file, User[].class);

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].getEmail().equals(userEmail)) {
                    arr[j].setPersonality(EI + SN + TF + JP);
                    FileOutputStream outputStream = new FileOutputStream(file);
                    String jsonString = mapper.writeValueAsString(arr);
                    byte[] strBytes = jsonString.getBytes();
                    outputStream.write(strBytes);
                    outputStream.close();
                }
            }
        } else if (userType.equals("tutor")) {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File(getClass().getResource("/json/tutors.json").getFile());

            Tutor[] arr = mapper.readValue(file, Tutor[].class);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].getEmail().equals(userEmail)) {
                    arr[j].setPersonality(EI + SN + TF + JP);
                    FileOutputStream outputStream = new FileOutputStream(file);
                    String jsonString = mapper.writeValueAsString(arr);
                    byte[] strBytes = jsonString.getBytes();
                    outputStream.write(strBytes);
                    outputStream.close();
                }
            }
        }
        return (EI + SN + TF + JP);
    }

    @GetMapping("/json-stu")
    public User[] jsonAttemptStu() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(getClass().getResource("/json/students.json").getFile());

        User[] arr = mapper.readValue(file, User[].class);
        return arr;
    }
    public User[] jsonAttemptTut() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(getClass().getResource("/json/tutors.json").getFile());

        User[] arr = mapper.readValue(file, User[].class);
        return arr;
    }

    public Long[][] personalitycompare() throws IOException {

        User[] Student = jsonAttemptStu();
        User[] Tutor = subjectCompare();

        User Student_Type = Student[0];
        //User[] Tutor_Type = Tutor;
        Long[] great = new Long[Tutor.length];
        Long[] good = new Long[Tutor.length];
        Long[] bad = new Long[Tutor.length];

        for (User Tutor_Type : Tutor) {

            int i = Tutor_Type.getId().intValue();


            if (Student_Type.getPersonality().equals("ENTJ")) {
                //Best types for a relationship: ESTJ, ISTP, ENTJ, ENFJ, INTJ
                if (Tutor_Type.getPersonality().equals("ESTJ")) {
                    great[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("ISTP")) {
                    great[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("ENTJ")) {
                    great[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("INTJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ISTJ, ESTP, ENTP, INTP, INFJ, ENFP
                if (Tutor_Type.getPersonality().equals("ISTJ")) {
                    good[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("ESTP")) {
                    good[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("ENTP")) {
                    good[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("INTP")) {
                    good[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("INFJ")) {
                    good[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.getPersonality().equals("ENFP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ESFP, ISFP, INFP
                if (Tutor_Type.equals("ESFJ")) {
                    bad[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.equals("ISFJ")) {
                    bad[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.equals("ESFP")) {
                    bad[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.equals("ISFP")) {
                    bad[i] = Tutor_Type.getId();
                }
                if (Tutor_Type.equals("INFP")) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ENTP")) {

                //Best types for a relationship: ENTP, INTP, INFJ
                if (Tutor_Type.getPersonality().equals("ENTP") || Tutor_Type.getPersonality().equals("INTP") || Tutor_Type.getPersonality().equals("INFJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESTJ, ISTJ, ESTP, ESFP, ENTJ, ENFP, INFP, ENFJ
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ISTJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("ENFP")) || Tutor_Type.getPersonality().equals(("INFP")) || Tutor_Type.getPersonality().equals(("ENFJ"))) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ISTP, ISFP, INTJ
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals(("INTJ"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("INTJ")) {
                //Best types for a relationship: ESTJ, INTJ, ISTP, ENTJ
                if (Tutor_Type.getPersonality().equals("ESTJ") || Tutor_Type.getPersonality().equals("INTJ") || Tutor_Type.getPersonality().equals("ISTP") || Tutor_Type.getPersonality().equals("ENTJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: INTP, INFJ, INFP, ENFP
                if (Tutor_Type.getPersonality().equals(("INTP")) || Tutor_Type.getPersonality().equals(("INFJ")) || Tutor_Type.getPersonality().equals(("INFP")) || Tutor_Type.getPersonality().equals(("ENFP"))) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ESTP, ESFP, ISFP, ENTP, INFP, ENFJ
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals("ENTP") || Tutor_Type.getPersonality().equals("INFP") || Tutor_Type.getPersonality().equals("ENFJ")) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("INTP")) {
                //Best types for a relationship: ENTP, INTP, INTJ
                if (Tutor_Type.getPersonality().equals("ENTP") || Tutor_Type.getPersonality().equals("INTP") || Tutor_Type.getPersonality().equals("INTJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESTJ, ISTJ, ESTP, ENTJ, ENFJ, INFJ, ENFP, INFP
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ISTJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ENTJ"))|| Tutor_Type.getPersonality().equals("ENFJ")|| Tutor_Type.getPersonality().equals("INFJ")||Tutor_Type.getPersonality().equals("ENFP")||Tutor_Type.getPersonality().equals("INFP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ISTP, ESFP, ISFP
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ISFP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ESTJ")) {
                ////////////////////////////////////
                //Best types for a relationship: ISTJ, ESFJ, ISFJ, ENTJ, INTJ, ISTP
                if (Tutor_Type.getPersonality().equals("ISTJ") || Tutor_Type.getPersonality().equals("ESFJ") || Tutor_Type.getPersonality().equals("ISFJ") || Tutor_Type.getPersonality().equals("ENTJ")|| Tutor_Type.getPersonality().equals("INTJ")|| Tutor_Type.getPersonality().equals("ISTP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ENTP, INTP, ESTP, ESFP, ISFP
                if (Tutor_Type.getPersonality().equals(("ENFP")) || Tutor_Type.getPersonality().equals(("INTP")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ESFP"))) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESTJ, ENFJ, INFJ, INFP, ENFP
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ENFJ")) || Tutor_Type.getPersonality().equals(("INFJ")) || Tutor_Type.getPersonality().equals(("INFP")) || Tutor_Type.getPersonality().equals(("ENFP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ESFJ")) {
                //Best types for a relationship: ESTJ, ENFP
                if (Tutor_Type.getPersonality().equals("ESTJ") || Tutor_Type.getPersonality().equals("ENFP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ISFJ, ESFJ, ENFJ, INFP, ISFP, ISTP, ESFP
                if (Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ENFJ")) || Tutor_Type.getPersonality().equals(("INFP"))||Tutor_Type.getPersonality().equals("ISFP")||Tutor_Type.getPersonality().equals("ISTP")||Tutor_Type.getPersonality().equals("ESFP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESTP, ENTJ, INTJ, ENTP, INTP, INFJ, ISTJ
                if (Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ENFJ")) || Tutor_Type.getPersonality().equals(("INTJ")) || Tutor_Type.getPersonality().equals(("ENTP")) || Tutor_Type.getPersonality().equals(("INTP"))||Tutor_Type.getPersonality().equals("INFJ")||Tutor_Type.getPersonality().equals("ISTJ")) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ISTJ")) {
                //Best types for a relationship: ESTJ, ISTJ, INTJ, ISTP, ESTP
                if (Tutor_Type.getPersonality().equals("ESTJ") || Tutor_Type.getPersonality().equals("ISTJ") || Tutor_Type.getPersonality().equals("INTJ") || Tutor_Type.getPersonality().equals("ISTP")|| Tutor_Type.getPersonality().equals("ESTP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ENTJ, INTP, ENFJ, INFJ, ISFJ,                                                                                                  ISFP, ENTP
                if (Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("INTP")) || Tutor_Type.getPersonality().equals(("ENFJ")) || Tutor_Type.getPersonality().equals(("INFJ"))|| Tutor_Type.getPersonality().equals("ISFP")|| Tutor_Type.getPersonality().equals("ENTP")||Tutor_Type.getPersonality().equals("ISFJ")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESFJ, ESFP, ENFP, INFP
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ENFP")) || Tutor_Type.getPersonality().equals(("INFP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ISFJ")) {
                //Best types for a relationship: ISFJ, ENFJ, ESTJ
                if (Tutor_Type.getPersonality().equals("ISTJ") || Tutor_Type.getPersonality().equals("ENFJ") || Tutor_Type.getPersonality().equals("ESTJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESFJ, ESTP, ISFP, INFJ, INFP, ESFP, ISTJ, ISFP
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals(("INFJ"))|| Tutor_Type.getPersonality().equals("INFP")|| Tutor_Type.getPersonality().equals("ESFP")||Tutor_Type.getPersonality().equals("ISTJ")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ENTJ, INTJ, ENTP, INTP, ENFP
                if (Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("INTJ")) || Tutor_Type.getPersonality().equals(("ENTP")) || Tutor_Type.getPersonality().equals(("INTP")) || Tutor_Type.getPersonality().equals(("ENFP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ENFJ")) {
                //Best types for a relationship: ISFJ, ENFJ, ENTJ, INFJ, ENFP, INFP
                if (Tutor_Type.getPersonality().equals("ISFJ") || Tutor_Type.getPersonality().equals("ENTJ") || Tutor_Type.getPersonality().equals("ENFJ") || Tutor_Type.getPersonality().equals("INFJ")|| Tutor_Type.getPersonality().equals("ENFP")|| Tutor_Type.getPersonality().equals("INFP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESFJ, ESFP, ISFP, INTP, ISTJ, ENTP
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals(("INTP"))|| Tutor_Type.getPersonality().equals("ISTJ")|| Tutor_Type.getPersonality().equals("ENTP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESTJ, ESTP, ISTP, INTJ
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("INTJ"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ENFP")) {
                //Best types for a relationship: INFJ, INFP, ENFJ, ENFP, ESFJ
                if (Tutor_Type.getPersonality().equals("INFJ") || Tutor_Type.getPersonality().equals("INFP") || Tutor_Type.getPersonality().equals("ENFJ") || Tutor_Type.getPersonality().equals("ENFP")|| Tutor_Type.getPersonality().equals("ESFJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ENTJ, ENTP, INTJ, INTP,ESFP, ISFP
                if (Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("ENTP")) || Tutor_Type.getPersonality().equals(("INFJ")) || Tutor_Type.getPersonality().equals(("INTP"))|| Tutor_Type.getPersonality().equals("ESFP")|| Tutor_Type.getPersonality().equals("ISFP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ISTJ, ESTJ, ISTP, ESTP, ISFJ
                if (Tutor_Type.getPersonality().equals(("ISTJ")) || Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ISFJ"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("INFJ")) {
                //Best types for a relationship: ENTP, ENFP, INFJ, INFP, ENFJ
                if (Tutor_Type.getPersonality().equals("ENTP") || Tutor_Type.getPersonality().equals("ENFP") || Tutor_Type.getPersonality().equals("INFJ") || Tutor_Type.getPersonality().equals("INFP")|| Tutor_Type.getPersonality().equals("ENFJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ISFJ, ESFP, ISFP, ENTJ, INTJ, INTP, ISTJ
                if (Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals(("ENTJ"))|| Tutor_Type.getPersonality().equals("INTJ")|| Tutor_Type.getPersonality().equals("INTP")||Tutor_Type.getPersonality().equals("ISTJ")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESTJ, ESFJ, ESTP, ISTP
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ISTP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("INFP")) {
                //Best types for a relationship: ENFP, INFP, ENFJ, INFJ
                if (Tutor_Type.getPersonality().equals("ENFP") || Tutor_Type.getPersonality().equals("INFP") || Tutor_Type.getPersonality().equals("ENFJ") || Tutor_Type.getPersonality().equals("INFJ")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ISFJ, ESFJ, ESFP, ISFP, ENTP, INTP
                if (Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ISFP"))|| Tutor_Type.getPersonality().equals("ENTP")|| Tutor_Type.getPersonality().equals("INTP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESTJ, ISTJ, ESTP, ISTP, ENTJ, INTJ
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ISTJ")) || Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("ENTJ"))||Tutor_Type.getPersonality().equals("INTJ")) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ESTP")) {
                //Best types for a relationship: ISTJ, ESTP, ISTP, ESFP
                if (Tutor_Type.getPersonality().equals("ISTJ") || Tutor_Type.getPersonality().equals("ESTP") || Tutor_Type.getPersonality().equals("ISTP") || Tutor_Type.getPersonality().equals("ESFP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESTJ, ISFP, ENTJ, ENTP, INTP, ISFJ
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("ENTP"))|| Tutor_Type.getPersonality().equals("INTP")||Tutor_Type.getPersonality().equals("ISFJ")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ESFJ, INTJ, ENFJ, INFJ, ENFP, INFP
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("INTJ")) || Tutor_Type.getPersonality().equals(("ENFJ")) || Tutor_Type.getPersonality().equals(("INFJ")) || Tutor_Type.getPersonality().equals(("ENFP"))||Tutor_Type.getPersonality().equals("INFP")) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ESFP")) {
                //Best types for a relationship: ESTP, ISFP
                if (Tutor_Type.getPersonality().equals("ESTP") || Tutor_Type.getPersonality().equals("ISFP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESTJ, ESFJ, ISFJ, ESFP, ENTP, ENFJ, INFJ, ENFP, INFP
                if (Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ISFJ")) || Tutor_Type.getPersonality().equals(("ESFP"))|| Tutor_Type.getPersonality().equals("ENTP")|| Tutor_Type.getPersonality().equals("ENFJ")||Tutor_Type.getPersonality().equals("INFJ")||Tutor_Type.getPersonality().equals("ENFP")||Tutor_Type.getPersonality().equals("INFP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ISTJ, ISTP, ENTJ, INTJ, INTP
                if (Tutor_Type.getPersonality().equals(("ISTJ")) || Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("INTJ")) || Tutor_Type.getPersonality().equals(("INTP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ISTP")) {
                //Best types for a relationship: ESTJ, ISTJ, ENTJ, ESTP
                if (Tutor_Type.getPersonality().equals("ESTJ") || Tutor_Type.getPersonality().equals("ISTJ") || Tutor_Type.getPersonality().equals("ENTJ") || Tutor_Type.getPersonality().equals("ESTP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESFJ, ISFP, INTJ, ISFJ
                if (Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ISFP")) || Tutor_Type.getPersonality().equals(("INTJ")) || Tutor_Type.getPersonality().equals(("ISFJ"))) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ISTP, ESFP, ENTP, INTP, ENFJ, INFJ, ENFP, INFP
                if (Tutor_Type.getPersonality().equals(("ISTP")) || Tutor_Type.getPersonality().equals(("ESFP")) || Tutor_Type.getPersonality().equals(("ENTP")) || Tutor_Type.getPersonality().equals(("ENFJ")) || Tutor_Type.getPersonality().equals(("INFJ"))||Tutor_Type.getPersonality().equals("ENFP")||Tutor_Type.getPersonality().equals("INFP")) {
                    bad[i] = Tutor_Type.getId();
                }
            } else if (Student_Type.equals("ISFP")) {
                //Best types for a relationship: ESFP, ISFP
                if (Tutor_Type.getPersonality().equals("ESFP") || Tutor_Type.getPersonality().equals("ISFP")) {
                    great[i] = Tutor_Type.getId();
                }
                //Possible types for a relationship: ESTP, ESTJ, ESFJ, ISTP, ENFJ, INFJ, INFP, ISFJ, ISTJ, ENFP
                if (Tutor_Type.getPersonality().equals(("ESTP")) || Tutor_Type.getPersonality().equals(("ESTJ")) || Tutor_Type.getPersonality().equals(("ESFJ")) || Tutor_Type.getPersonality().equals(("ISTP"))|| Tutor_Type.getPersonality().equals("ENFJ")|| Tutor_Type.getPersonality().equals("INFJ")||Tutor_Type.getPersonality().equals("INFP")|| Tutor_Type.getPersonality().equals("ISFJ")|| Tutor_Type.getPersonality().equals("ISTJ")||Tutor_Type.getPersonality().equals("ENFP")) {
                    good[i] = Tutor_Type.getId();
                }
                //Least likely types for a relationship: ENTJ, INTJ, ENTP, INTP
                if (Tutor_Type.getPersonality().equals(("ENTJ")) || Tutor_Type.getPersonality().equals(("INTJ")) || Tutor_Type.getPersonality().equals(("ENTP")) || Tutor_Type.getPersonality().equals(("INTP"))) {
                    bad[i] = Tutor_Type.getId();
                }
            }
        }


        return new Long[][]{great, good, bad};
    }

    public User[] subjectCompare() throws IOException {

        User[] Student = jsonAttemptStu();
        User[] Tutor = jsonAttemptTut();

        User[] GoodMatches = new User [50];

        int j = 0;
        for (User user : Tutor) {
            if (Student[0].getSubject().equals(user.getSubject())) {
                GoodMatches[j] = user;
                j++;

            }
        }

        return GoodMatches;

    }



}