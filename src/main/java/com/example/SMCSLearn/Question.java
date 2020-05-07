package com.example.SMCSLearn;

public class Question {

    //varibale
    private String question;

    //Pre: Variable (question) from front end
    //Post: Returns variable (question) for backend use
    //Function: Takes information regarding the personality test and adds it to the backend
    public Question(String question){
        this.question  = question;
    }

    //Pre: Questions
    //Post: Returns questions
    //Function: To make question results callable throughout backend
    public String getQuestion(){
        return this.question;
    }
}
