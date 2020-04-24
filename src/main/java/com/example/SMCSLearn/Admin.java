package com.example.SMCSLearn;

public class Admin{
    private long id;
    private String fname;
    private String lname;

    public Admin(long id, String fname, String lname){
        this.id = id;
        this.fname = fname;
        this.lname;
    }

    public long getId() { return id; }

    public String getFname() { return fname; }

    public String getLname() { return lname; }
}