package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student (String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        Collections.addAll(examScores, testScores);
    }

    public Student() {
        this.firstName = "Leon";
        this.lastName = "Hunter";
        this.examScores = new ArrayList<>();
    }

    public String getFirstName() { return this.firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; };

    public String getLastName() { return this.lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Integer getNumberOfExamsTaken() { return null;}

    public String getExamScores() {
        String result = "Exam Scores:";
        for (int i = 0; i < examScores.size(); i++) {
            result += "\nExam " + (i + 1) + " -> " + examScores.get(i);
        }
        return result;
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScores (int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore() {
        Double result = 0.0;
        for (Double examScore : examScores) {
            result += examScore;
        }
        return result / examScores.size();
    }

    @Override
    public String toString() {
        String result = "Student Name: " + firstName + " " + lastName + "\n> Average Score: "
                + getAverageExamScore() + "\n> Exam Scores:";
        for (int i = 0; i < examScores.size(); i++) {
            result += "\nExam " + (i + 1) + " -> " + examScores.get(i);
        }
        return result;
    }
}
