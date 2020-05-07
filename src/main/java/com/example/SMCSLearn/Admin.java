package com.example.SMCSLearn;

public class Admin{
    //create variables for Admin
    private long id;
    private String fname;
    private String lname;

    //Pre: Variables (id, fname, and last name) from front end
    //Post: Returns variables (id, fname, and last name) for backend use
    //Function: Takes information regarding the admin and adds it to the backend
    public Admin(long id, String fname, String lname){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    //Pre: Admin's id
    //Post: Returns admin's id
    //Function: To make admin's id callable throughout backend
    public long getId() { return id; }

    //Pre: Admin's first name (fname)
    //Post: Returns admin's first name (fname)
    //Function: To make admin's first name (fname) callable throughout backend
    public String getFname() { return fname; }

    //Pre: Admin's last name (lname)
    //Post: Returns admin's last name (lname)
    //Function: To make admin's last name (lname) callable throughout backend
    public String getLname() { return lname; }

}