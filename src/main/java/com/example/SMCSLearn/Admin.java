package com.example.SMCSLearn;

public class Admin{
    private long id;
    private String fName;
    private String lName;
    private String email;
    private String password;

    protected Admin() {};
    public Admin(String fName, String lName, String email, String password){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;

    }

    public long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() { return fName; }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setfName(String fName) {this.fName = fName;}

    public void setlName(String lName) {this.lName = lName;}

    public void setEmail(String email) {this.email = email;}

    public void setPassword(String password) {this.password = password;}

}