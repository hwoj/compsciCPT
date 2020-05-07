package com.example.SMCSLearn;

public class User {
    private Long id;

    private String fName;
    private String lName;
    private String password;
    private String email;
    private String key;



    private int gradYear;

    private String personality;

    private String Personality;

    private int tutor_link;



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

    public void setfName(String fName){
        this.fName = fName;
    }

    public void setlName(String lName){
        this.lName = lName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setGradYear(int gradYear){
        this.gradYear = gradYear;
    }
}
