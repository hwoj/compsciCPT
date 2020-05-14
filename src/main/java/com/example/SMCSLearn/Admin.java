package com.example.SMCSLearn;

public class Admin {
    //create variables for Admin
    private long id;
    private String fName;
    private String lName;
    private String email;
    private String password;




    public Admin(String fName, String lName, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;




    }

    protected Admin() {

    protected Admin() {};


>>>>>>> 1d4d0fd466c4aa3cb3c774aa4a0191c7723801e1
    }
    //Pre: Variables (id, fname, and last name) from front end
    //Post: Returns variables (id, fname, and last name) for backend use
    //Function: Takes information regarding the admin and adds it to the backend



    public Admin(String fName, String lName, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
    }


    //Pre: Admin's id
    //Post: Returns admin's id
    //Function: To make admin's id callable throughout backend
    public long getId() {
        return id;
    }

    //Pre: Admin's email
    //Post: Returns admin's email
    //Function: To make admin's email callable throughout backend
    public String getEmail() { return email; }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    //Pre: Admin's password
    //Post: Returns admin's password
    //Function: To make admin's password callable throughout backend
    public String getPassword() { return password; }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}