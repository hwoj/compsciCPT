package com.example.SMCSLearn;



public class Tutor {


    private Long id;

    private String fName;
    private String lName;
    private int gradYear;
    private String Personality;
    private int tutor_link;

    protected Tutor() {};

    public Tutor(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', gradYear='%d']",
                id, fName, lName, gradYear);
    }

}
