package com.example.SMCSLearn;

public class User {
    private long id;
    private String email;
    private String fname;
    private String lname;

    private String Personality;

    public User(int id, String fname , String lname, String email){

    private int gradyear;
    private String Personality;
    private int tutor_link;

    public User(Long id, String fname , String lname, String gradyear, String email, int crit_score, int eager_score, int agree_score, int extro_score){

        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;


=======
        this.gradyear = gradyear;

    }

    public long getId(){
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

    public int getGradyear() { return gradyear; }

    public int getCrit_score() { return crit_score; }

    public int getEager_score() { return eager_score; }

    public int getAgree_score() { return agree_score; }

    public int getExtro_score() { return extro_score; }
}
