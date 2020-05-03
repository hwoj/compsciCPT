package com.example.SMCSLearn;



public class Tutor {


    private Long id;

    private String fName;
    private String lName;
    private String password;
    private String email;
    private String key;
    private int gradYear;
    private String Personality;
    private int tutor_link;

    protected Tutor() {};

    public Tutor(String fName, String lName, String email, String password, String key, int gradYear){
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

   public Long getId() {
       if (id != null) {
           return id;
       }
       return null;
   }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', gradYear='%d']",
                id, fName, lName, gradYear);
    }

}
