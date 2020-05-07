package com.example.SMCSLearn;

public class Admin{
    //create variables for Admin
    private long id;
    private String fName;
    private String lName;
    private String email;
    private String password;

    protected Admin() {};

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
    public long getId() { return id; }

    //Pre: Admin's email
    //Post: Returns admin's email
    //Function: To make admin's email callable throughout backend
    public String getEmail() { return email; }

    //Pre: Admin's password
    //Post: Returns admin's password
    //Function: To make admin's password callable throughout backend
    public String getPassword() { return password; }

    //Pre: Admin's first name (fname)
    //Post: Returns admin's first name (fname)
    //Function: To make admin's first name (fname) callable throughout backend
    public String getFname() { return fname; }

    //Pre: Admin's last name (lname)
    //Post: Returns admin's last name (lname)
    //Function: To make admin's last name (lname) callable throughout backend
    public String getLname() { return lname; }


}