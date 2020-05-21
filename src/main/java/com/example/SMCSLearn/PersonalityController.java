package com.example.SMCSLearn;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


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


    public User[] jsonAttemptStu() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(getClass().getResource("/json/students.json").getFile());

        User[] arr = mapper.readValue(file, User[].class);
        return arr;
    }

    public Tutor[] jsonAttemptTut() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(getClass().getResource("/json/tutors.json").getFile());

        Tutor[] arr = mapper.readValue(file, Tutor[].class);
        return arr;
    }

    @GetMapping("/matches/{stuID}")
    @CrossOrigin("http://localhost:4200")

    public String[][] personalitycompare(@PathVariable(value = "stuID") int stuID) throws IOException {

        User[] students = jsonAttemptStu();
        Tutor[] tutors;

        User student = students[stuID];
        tutors = subjectCompare(student);


        //User[] Tutor_Type = Tutor;
        String[] great = new String[0];
        String[] good = new String[0];
        String[] bad = new String[0];

        int greatTracker = 0;
        int goodTracker = 0;
        int badTracker = 0;


        for (Tutor tutor_Type : tutors) {


            if (student.getPersonality().equals("ENTJ")) {
                //Best types for a relationship: ESTJ, ISTP, ENTJ, ENFJ, INTJ
                if (tutor_Type.getPersonality().equals("ESTJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                if (tutor_Type.getPersonality().equals("ISTP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                if (tutor_Type.getPersonality().equals("ENTJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                if (tutor_Type.getPersonality().equals("INTJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ISTJ, ESTP, ENTP, INTP, INFJ, ENFP
                if (tutor_Type.getPersonality().equals("ISTJ")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                if (tutor_Type.getPersonality().equals("ESTP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                if (tutor_Type.getPersonality().equals("ENTP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                if (tutor_Type.getPersonality().equals("INTP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                if (tutor_Type.getPersonality().equals("INFJ")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                if (tutor_Type.getPersonality().equals("ENFP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ESFP, ISFP, INFP
                if (tutor_Type.equals("ESFJ")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
                if (tutor_Type.equals("ISFJ")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
                if (tutor_Type.equals("ESFP")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
                if (tutor_Type.equals("ISFP")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
                if (tutor_Type.equals("INFP")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ENTP")) {

                //Best types for a relationship: ENTP, INTP, INFJ
                if (tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("INTP") || tutor_Type.getPersonality().equals("INFJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESTJ, ISTJ, ESTP, ESFP, ENTJ, ENFP, INFP, ENFJ
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ISTJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("ENFP")) || tutor_Type.getPersonality().equals(("INFP")) || tutor_Type.getPersonality().equals(("ENFJ"))) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ISTP, ISFP, INTJ
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals(("INTJ"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("INTJ")) {
                //Best types for a relationship: ESTJ, INTJ, ISTP, ENTJ
                if (tutor_Type.getPersonality().equals("ESTJ") || tutor_Type.getPersonality().equals("INTJ") || tutor_Type.getPersonality().equals("ISTP") || tutor_Type.getPersonality().equals("ENTJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: INTP, INFJ, INFP, ENFP
                if (tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals(("INFP")) || tutor_Type.getPersonality().equals(("ENFP"))) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ESTP, ESFP, ISFP, ENTP, INFP, ENFJ
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("INFP") || tutor_Type.getPersonality().equals("ENFJ")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("INTP")) {
                //Best types for a relationship: ENTP, INTP, INTJ
                if (tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("INTP") || tutor_Type.getPersonality().equals("INTJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESTJ, ISTJ, ESTP, ENTJ, ENFJ, INFJ, ENFP, INFP
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ISTJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("INFP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESFJ, ISFJ, ISTP, ESFP, ISFP
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ISFP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ESTJ")) {

                //Best types for a relationship: ISTJ, ESFJ, ISFJ, ENTJ, INTJ, ISTP
                if (tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("ESFJ") || tutor_Type.getPersonality().equals("ISFJ") || tutor_Type.getPersonality().equals("ENTJ") || tutor_Type.getPersonality().equals("INTJ") || tutor_Type.getPersonality().equals("ISTP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ENTP, INTP, ESTP, ESFP, ISFP
                if (tutor_Type.getPersonality().equals(("ENFP")) || tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ESFP"))) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESTJ, ENFJ, INFJ, INFP, ENFP
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ENFJ")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals(("INFP")) || tutor_Type.getPersonality().equals(("ENFP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ESFJ")) {
                //Best types for a relationship: ESTJ, ENFP
                if (tutor_Type.getPersonality().equals("ESTJ") || tutor_Type.getPersonality().equals("ENFP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ISFJ, ESFJ, ENFJ, INFP, ISFP, ISTP, ESFP
                if (tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ENFJ")) || tutor_Type.getPersonality().equals(("INFP")) || tutor_Type.getPersonality().equals("ISFP") || tutor_Type.getPersonality().equals("ISTP") || tutor_Type.getPersonality().equals("ESFP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESTP, ENTJ, INTJ, ENTP, INTP, INFJ, ISTJ
                if (tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ENFJ")) || tutor_Type.getPersonality().equals(("INTJ")) || tutor_Type.getPersonality().equals(("ENTP")) || tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("ISTJ")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ISTJ")) {
                //Best types for a relationship: ESTJ, ISTJ, INTJ, ISTP, ESTP
                if (tutor_Type.getPersonality().equals("ESTJ") || tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("INTJ") || tutor_Type.getPersonality().equals("ISTP") || tutor_Type.getPersonality().equals("ESTP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ENTJ, INTP, ENFJ, INFJ, ISFJ,                                                                                                  ISFP, ENTP
                if (tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals(("ENFJ")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals("ISFP") || tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("ISFJ")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESFJ, ESFP, ENFP, INFP
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ENFP")) || tutor_Type.getPersonality().equals(("INFP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ISFJ")) {
                //Best types for a relationship: ISFJ, ENFJ, ESTJ
                if (tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("ESTJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESFJ, ESTP, ISFP, INFJ, INFP, ESFP, ISTJ, ISFP
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals("INFP") || tutor_Type.getPersonality().equals("ESFP") || tutor_Type.getPersonality().equals("ISTJ")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ENTJ, INTJ, ENTP, INTP, ENFP
                if (tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("INTJ")) || tutor_Type.getPersonality().equals(("ENTP")) || tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals(("ENFP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ENFJ")) {
                //Best types for a relationship: ISFJ, ENFJ, ENTJ, INFJ, ENFP, INFP
                if (tutor_Type.getPersonality().equals("ISFJ") || tutor_Type.getPersonality().equals("ENTJ") || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("INFP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESFJ, ESFP, ISFP, INTP, ISTJ, ENTP
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("ENTP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESTJ, ESTP, ISTP, INTJ
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("INTJ"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ENFP")) {
                //Best types for a relationship: INFJ, INFP, ENFJ, ENFP, ESFJ
                if (tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("INFP") || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("ESFJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ENTJ, ENTP, INTJ, INTP,ESFP, ISFP
                if (tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("ENTP")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals(("INTP")) || tutor_Type.getPersonality().equals("ESFP") || tutor_Type.getPersonality().equals("ISFP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ISTJ, ESTJ, ISTP, ESTP, ISFJ
                if (tutor_Type.getPersonality().equals(("ISTJ")) || tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ISFJ"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("INFJ")) {
                //Best types for a relationship: ENTP, ENFP, INFJ, INFP, ENFJ
                if (tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("INFP") || tutor_Type.getPersonality().equals("ENFJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ISFJ, ESFP, ISFP, ENTJ, INTJ, INTP, ISTJ
                if (tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals("INTJ") || tutor_Type.getPersonality().equals("INTP") || tutor_Type.getPersonality().equals("ISTJ")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESTJ, ESFJ, ESTP, ISTP
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ISTP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("INFP")) {
                //Best types for a relationship: ENFP, INFP, ENFJ, INFJ
                if (tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("INFP") || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("INFJ")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ISFJ, ESFJ, ESFP, ISFP, ENTP, INTP
                if (tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("INTP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESTJ, ISTJ, ESTP, ISTP, ENTJ, INTJ
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ISTJ")) || tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals("INTJ")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ESTP")) {
                //Best types for a relationship: ISTJ, ESTP, ISTP, ESFP
                if (tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("ESTP") || tutor_Type.getPersonality().equals("ISTP") || tutor_Type.getPersonality().equals("ESFP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESTJ, ISFP, ENTJ, ENTP, INTP, ISFJ
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("ENTP")) || tutor_Type.getPersonality().equals("INTP") || tutor_Type.getPersonality().equals("ISFJ")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ESFJ, INTJ, ENFJ, INFJ, ENFP, INFP
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("INTJ")) || tutor_Type.getPersonality().equals(("ENFJ")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals(("ENFP")) || tutor_Type.getPersonality().equals("INFP")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ESFP")) {
                //Best types for a relationship: ESTP, ISFP
                if (tutor_Type.getPersonality().equals("ESTP") || tutor_Type.getPersonality().equals("ISFP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESTJ, ESFJ, ISFJ, ESFP, ENTP, ENFJ, INFJ, ENFP, INFP
                if (tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ISFJ")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals("ENTP") || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("INFP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ISTJ, ISTP, ENTJ, INTJ, INTP
                if (tutor_Type.getPersonality().equals(("ISTJ")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("INTJ")) || tutor_Type.getPersonality().equals(("INTP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ISTP")) {
                //Best types for a relationship: ESTJ, ISTJ, ENTJ, ESTP
                if (tutor_Type.getPersonality().equals("ESTJ") || tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("ENTJ") || tutor_Type.getPersonality().equals("ESTP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESFJ, ISFP, INTJ, ISFJ
                if (tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ISFP")) || tutor_Type.getPersonality().equals(("INTJ")) || tutor_Type.getPersonality().equals(("ISFJ"))) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ISTP, ESFP, ENTP, INTP, ENFJ, INFJ, ENFP, INFP
                if (tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals(("ESFP")) || tutor_Type.getPersonality().equals(("ENTP")) || tutor_Type.getPersonality().equals(("ENFJ")) || tutor_Type.getPersonality().equals(("INFJ")) || tutor_Type.getPersonality().equals("ENFP") || tutor_Type.getPersonality().equals("INFP")) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            } else if (student.equals("ISFP")) {
                //Best types for a relationship: ESFP, ISFP
                if (tutor_Type.getPersonality().equals("ESFP") || tutor_Type.getPersonality().equals("ISFP")) {
                    great[greatTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(great, greatTracker + 1);
                    greatTracker++;
                }
                //Possible types for a relationship: ESTP, ESTJ, ESFJ, ISTP, ENFJ, INFJ, INFP, ISFJ, ISTJ, ENFP
                if (tutor_Type.getPersonality().equals(("ESTP")) || tutor_Type.getPersonality().equals(("ESTJ")) || tutor_Type.getPersonality().equals(("ESFJ")) || tutor_Type.getPersonality().equals(("ISTP")) || tutor_Type.getPersonality().equals("ENFJ") || tutor_Type.getPersonality().equals("INFJ") || tutor_Type.getPersonality().equals("INFP") || tutor_Type.getPersonality().equals("ISFJ") || tutor_Type.getPersonality().equals("ISTJ") || tutor_Type.getPersonality().equals("ENFP")) {
                    good[goodTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(good, goodTracker + 1);
                    goodTracker++;
                }
                //Least likely types for a relationship: ENTJ, INTJ, ENTP, INTP
                if (tutor_Type.getPersonality().equals(("ENTJ")) || tutor_Type.getPersonality().equals(("INTJ")) || tutor_Type.getPersonality().equals(("ENTP")) || tutor_Type.getPersonality().equals(("INTP"))) {
                    bad[badTracker] = tutor_Type.getfName() + tutor_Type.getlName();
                    Arrays.copyOf(bad, badTracker + 1);
                    badTracker++;
                }
            }
        }

        Arrays.copyOf(bad, badTracker - 1);
        Arrays.copyOf(good, goodTracker - 1);
        Arrays.copyOf(great, greatTracker - 1);

        return new String[][]{great, good, bad};
    }


    public Tutor[] subjectCompare(User student) throws IOException {

        Tutor[] tutors = jsonAttemptTut();

        Tutor[] goodMatches = new Tutor[0];
        int j = 0;
        for (Tutor user : tutors) {
            if (student.getSubjects().equals(user.getSubjects())) {
                goodMatches[j] = user;
                j++;
                Arrays.copyOf(goodMatches, j);
            }
        }
        return goodMatches;
    }
}