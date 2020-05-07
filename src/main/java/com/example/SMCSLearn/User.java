package com.example.SMCSLearn;

public class User {

    //create variables for user
    private Long id;
    private String fName;
    private String lName;
    private String password;
    private String email;
    private String key;
    private int gradYear;
    private String Personality;
    private int tutor_link;

    protected User() {}

    //Pre: Variables (fname, lname, emal, password, key, gradyear) from front end
    //Post: Returns variables (fname, lname, emal, password, key, gradyear) for backend use
    //Function: Takes information regarding the users and adds it to the backend
    public User(String fName, String lName, String email, String password, String key, int gradYear){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.gradYear = gradYear;
        this.key = key;
    }

    //Pre: User's graduation year
    //Post: Returns user's graduation year
    //Function: To make user's graduation year callable throughout backend
    public int getGradYear() {
        return gradYear;
    }

    //Pre: User's password
    //Post: Returns user's password
    //Function: To make user's password callable throughout backend
    public String getPassword() {
        return password;
    }

    //Pre: User's email
    //Post: Returns user's email
    //Function: To make user's email callable throughout backend
    public String getEmail(){
        return email;
    }

    //Pre: User's auth key
    //Post: Returns user's auth key
    //Function: To make user's auth key callable throughout backend
    public String getKey() {
        return key;
    }

    //Pre: User's first name (fname)
    //Post: Returns user's first name (fname)
    //Function: To make user's first name (fname) callable throughout backend
    public String getfName() {
        return fName;
    }

    //Pre: User's last name (lname)
    //Post: Returns user's last name (lname)
    //Function: To make user's passlast name (lname) word callable throughout backend
    public String getlName() {
        return lName;
    }

    //Pre: User's perosnality score
    //Post: Returns user's personality score
    //Function: To make user's personality score callable throughout backend
    public String getPersonality() { return personality; }

    //Pre: User's id
    //Post: Returns user's id
    //Function: To make user's id callable throughout backend
    public Long getId() {
        if (id != null) {
            return id;
        }
        return null;
    }

    //Pre: User's personality score
    //Post: Returns user's personality score
    //Function: Sets the user's personality score
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    //Pre: User's id
    //Post: Returns user's id
    //Function: Sets the user's id
    public void setId(Long id) {
        this.id = id;
    }

    //Pre: User's first name (fname)
    //Post: Returns user's first name (fname)
    //Function: Sets the user's first name (fname)
    public void setfName(String fName){
        this.fName = fName;
    }

    //Pre: User's last name (lname)
    //Post: Returns user's last name (lname)
    //Function: Sets the user's last name (lname)
    public void setlName(String lName){
        this.lName = lName;
    }

    //Pre: User's email
    //Post: Returns user's email
    //Function: Sets the user's email
    public void setEmail(String email){
        this.email = email;
    }

    //Pre: User's password
    //Post: Returns user's passord
    //Function: Sets the user's password
    public void setPassword(String password){
        this.password = password;
    }

    //Pre: User's graduation year
    //Post: Returns user's graduation year
    //Function: Sets the user's graduation year
    public void setGradYear(int gradYear){
        this.gradYear = gradYear;
    }
}
