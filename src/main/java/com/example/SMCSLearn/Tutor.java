package com.example.SMCSLearn;



public class Tutor {


    private int id;

    private String fName;
    private String lName;
    private String password;
    private String email;
    private String key;
    private int gradYear;
    private String Personality;
    private int tutor_link;

    protected Tutor() {};

    public Tutor(String fName, String lName, String email, String password, String key, int gradYear, String Personality){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.gradYear = gradYear;
        this.key = key;
        this.Personality = Personality;
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

    public String getPersonality(){
        return Personality;
    }

    public String getlName() {
        return lName;
    }

   public int getId() {
       if (id >= 0) {
           return id;
       }
       return -1;
   }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', gradYear='%d']",
                id, fName, lName, gradYear);
    }

}
