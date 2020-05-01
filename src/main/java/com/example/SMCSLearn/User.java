package com.example.SMCSLearn;

public class User {
    private long id;
    private String email;
    private String fname;
    private String lname;
    private String key;
    private String Personality;
    private String gradyear;
    private String password;

    private int tutor_link;

    public User(String fname, String lname, String gradyear, String email, String password, String key, String Personaily){
        this.fname = fname;
        this.lname = lname;
        this.gradyear = gradyear;
        this.email = email;
        this.password = password;
        this.key = key;
        this.Personality = Personality;
    }
   /* public User(Long id, String fname , String lname, int gradyear, String email, int crit_score, int eager_score, int agree_score, int extro_score){

        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;



        this.gradyear = gradyear;

    }*/

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

    public String getGradyear() { return gradyear; }

}
