package com.example.SMCSLearn;

import org.springframework.web.bind.annotation.RequestParam;
//import com.example.SMCSLearn.Answer;
import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@PostMapping("/personality")
//@CrossOrigin("http://localhost:4200")
public class PersonalityReciever {
 //   @RequestParam(value = "id")

    String JP;
    String EI;
    String TF;
    String SI;

    int judging_score;
    int extro_score;
    int sensing_score;
    int thinking_score;


   /* for(int i = 0;i<9;i++) {
        if (Answer[i] == 0) {
            judging_score++;
        } else if (Answer[i] == 1) {
            judging_score += 2;
        } else if (Answer[i] == 3) {
            judging_score += 3;
        } else {
            judging_score += 4;
        }
    }
    for (int i = 9;i<17; i++) {
        if (Answer[i] == 0) {
            extro_score++;
        } else if (Answer[i] == 1) {
            extro_score += 2;
        } else if (Answer[i] == 3) {
            extro_score += 3;
        } else {
            extro_score += 4;
        }
    }
    for(
    int i = 17;
    i<25;i++)

    {
        if (Answer[i] == 0) {
            thinking_score++;
        } else if (Answer[i] == 1) {
            thinking_score += 2;
        } else if (Answer[i] == 3) {
            thinking_score += 3;
        } else {
            thinking_score += 4;
        }
    }
    for(
    int i = 25;
    i<33;i++)

    {
        if (Answer[i] == 0) {
            sensing_score++;
        } else if (Answer[i] == 1) {
            sensing_score += 2;
        } else if (Answer[i] == 3) {
            sensing_score += 3;
        } else {
            users[id].sensing_score += 4;
        }

    }

    //Finding if they are 1 vs 2

    if (judging_score >= 17){
        JP ="J";
    }
    else{
        JP = "P";
    }

    if (extro_score >= 17){
        EI ="E";
    }
    else{
        EI = "I";
    }

    if (thinking_score >=17){
        TF ="T";
    }
    else{
        TF = "F";
    }

    if (sensing_score >= 17){
        SI ="S";
    }
    else{
        SI = "I";
    }

    users[id].Personality = JP+EI+TF+SI;
    */

}

