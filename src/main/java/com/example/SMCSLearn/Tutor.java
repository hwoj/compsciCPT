package com.example.SMCSLearn;



public class Tutor {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
=======

    private Long id;
>>>>>>> 6dde4b8b23be7f70c82caacfeda8e1a3f6badf09
    private String fName;
    private String lName;
    private int gradYear;
    private int crit_score;
    private int eager_score;
    private int agree_score;
    private int extro_score;
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
