package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student (String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
        this.firstName = "Leon";
        this.lastName = "Hunter";
    }

    public String getFirstName() { return this.firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; };

    public String getLastName() { return this.lastName; }

    public void setLastName() { this.lastName = lastName; }

    public Double getNumberOfExamsTaken() { return null;}

    public Double[] getExamScores() {
        return new Double[]{100.0 , 95.0, 123.0, 96.0};
    }
}
