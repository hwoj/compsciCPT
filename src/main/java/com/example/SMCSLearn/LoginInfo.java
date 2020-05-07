package com.example.SMCSLearn;

public class LoginInfo {

    //variables needed for log in
    private String email;
    private String password;

    protected LoginInfo() {}

    //Pre: Variables (email and password) from front end
    //Post: Returns variables (email and password) for backend use
    //Function: Makes info entered in the log in fields in the front end available to the back end
    public LoginInfo(String email, String password){
        this.email = email;
        this.password = password;
    }

    //Pre: Entered password
    //Post: Returns entered password
    //Function: Gets the password from front end
    public String getPassword() {
        return password;
    }

    //Pre: Entered email
    //Post: Returns entered email
    //Function: Gets the email from front end
    public String getEmail() {
        return email;
    }

    //Pre: Entered email
    //Post: Returns entered email
    //Function: Sets the email for backend use
    public void setEmail(String email) {
        this.email = email;
    }


    //Pre: Entered password
    //Post: Returns entered password
    //Function: Sets the password for backend use
    public void setPassword(String password) {
        this.password = password;
    }
}
