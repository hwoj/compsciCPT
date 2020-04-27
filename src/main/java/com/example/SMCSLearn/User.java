package com.example.SMCSLearn;

public class User {
    private int id;
    private String email;
    private String fname;
    private String lname;
    private String Personality;

    public User(int id, String fname , String lname, String email){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;

    }

    public int getId(){
        return id;
    }

    public String getFname(){
        return fname;
    }

    public String getEmail() {
        return email;
    }

    public String getLname() {
        return lname;
    }
}
