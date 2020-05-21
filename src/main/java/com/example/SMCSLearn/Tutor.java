package com.example.SMCSLearn;


import javax.validation.constraints.Null;

public class Tutor {

    //Create variables for tutor
    private Long id;
    private String fName;
    private String lName;
    private String subject1;
    private String subject2;
    private String subject3;
    private String password;
    private String email;
    private String key;
    private int gradYear;
    private String personality;
    private int tutor_link;

    protected Tutor() {};

    //Pre: Variables (fname, lname, emal, password, key, gradyear) from front end
    //Post: Returns variables (fname, lname, emal, password, key, gradyear) for backend use
    //Function: Takes information regarding the tutors and adds it to the backend
    public Tutor(String fName, String lName, String email, String password, String key, int gradYear){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.gradYear = gradYear;
        this.key = key;
    }

    //Pre: Tutor's graduation year
    //Post: Returns tutor's graduation year
    //Function: To make tutor's graduation year callable throughout backend
    public int getGradYear() {
        return gradYear;
    }

    //Pre: Tutor's password
    //Post: Returns tutor's password
    //Function: To make tutor's password callable throughout backend
    public String getPassword() {
        return password;
    }

    //Pre: Tutor's email
    //Post: Returns tutor's email
    //Function: To make tutor's email callable throughout backend
    public String getEmail(){
        return email;
    }

    //Pre: Tutor's auth key
    //Post: Returns tutor's auth key
    //Function: To make tutor's aut key callable throughout backend
    public String getKey() {
        return key;
    }

    //Pre: Tutor's first name (fname)
    //Post: Returns tutor's first name (fname)
    //Function: To make tutor's first name (fname) callable throughout backend
    public String getfName() {
        return fName;
    }

    //Pre: Tutor's personalty score
    //Post: Returns tutor's personality score
    //Function: To make tutor's personality score callable throughout backend
    public String getPersonality(){
        if (! personality.equals(null)) {
            return personality;
        }
        return null;
    }

    //Pre: Tutor's last name (lname)
    //Post: Returns tutor's last name (lname)
    //Function: To make tutor's last name (lname) callable throughout backend
    public String getlName() {
        return lName;
    }

    //Pre: Tutor's id
    //Post: Returns tutor's id
    //Function: To make tutor's id callable throughout backend
   public Long getId() {
       if (id != null) {
           return id;
       }
       return null;
   }

    //Pre: Tutor's id
    //Post: Returns tutor's id
    //Function: Sets the tutor's id
    public void setId(Long id) {
        this.id = id;
    }

    //Pre: Tutor's personaliy score
    //Post: Returns tutor's personality score
    //Function: Sets the tutor's personality score
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    //Pre: Tutor's key
    //Post: Returns tutor's key
    //Function: Sets the tutor's key
    public void setKey(String key) {
        this.key = key;
    }

    //Pre: Tutor's first name (fname)
    //Post: Returns tutor's first name (fname)
    //Function: Sets the tutor's first name (fname)
    public void setfName(String fName){
        this.fName = fName;
    }

    //Pre: Tutor's last name (lname)
    //Post: Returns tutor's laste name (lname)
    //Function: Sets the tutor's last name (lname)
    public void setlName(String lName){
        this.lName = lName;
    }

    //Pre: Tutor's graduation year
    //Post: Returns tutor's graduation year
    //Function: Sets the tutor's graduation year
    public void setGradYear(int gradYear){
        this.gradYear = gradYear;
    }

    //Pre: Tutor's email
    //Post: Returns tutor's email
    //Function: Sets the tutor's email
    public void setEmail(String email){
        this.email = email;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', gradYear='%d']",
                id, fName, lName, gradYear);
    }

    public String getSubject1() {
        return this.subject1;
    }

    public String getSubject2() {
        return this.subject2;
    }

    public String getSubject3() {
        return this.subject3;
    }
}
