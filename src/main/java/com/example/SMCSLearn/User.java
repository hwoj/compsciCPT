package com.example.SMCSLearn;

public class User {
    private Long id;

    private String fName;
    private String lName;
    private String password;
    private String email;
    private String key;

    public User(long id, String fname , String lname, String email){

    private int gradYear;

    private String personality;

    private String Personality;

    private int tutor_link;

    public User(long id, String fname , String lname, String gradyear, String email, int crit_score, int eager_score, int agree_score, int extro_score){

        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.gradyear = gradyear;
        this.crit_score = crit_score;
        this.eager_score = eager_score;
        this.agree_score = agree_score;
        this.extro_score = extro_score;

    protected User() {}

    public User(String fName, String lName, String email, String password, String key, int gradYear){
        this.fName = fName;
        this.lName = lName;


        this.email = email;
        this.password = password;
        this.gradYear = gradYear;
        this.key = key;

    }

    public int getGradYear() {
        return gradYear;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail(){
        return email;
    }

    public String getKey() {
        return key;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getPersonality() { return personality; }

    public Long getId() {
        if (id != null) {
            return id;
        }
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
