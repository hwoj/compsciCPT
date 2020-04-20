package com.example.SMCSLearn;

public class User {
    private int id;
    private String email;
    private String fname;
    private String lname;
    private int crit_score;
    private int eager_score;
    private int agree_score;
    private int extro_score;
    public User(int id, String fname , String lname, String email, int crit_score, int eager_score, int agree_score, int extro_score){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.crit_score = crit_score;
        this.eager_score = eager_score;
        this.agree_score = agree_score;
        this.extro_score = extro_score;
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

    public int getCrit_score() { return crit_score; }

    public int getEager_score() { return eager_score; }

    public int getAgree_score() { return agree_score; }

    public int getExtro_score() { return extro_score; }
}
