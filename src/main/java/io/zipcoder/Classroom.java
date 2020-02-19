package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    private String firstName;
    private String lastName;
    private ArrayList<Student> students = new ArrayList<>();


    public Classroom (int maxNumberOfStudents) { }

    public Classroom (Student[] students) {}

    public Classroom () {
        Student[] students = new Student[30];
    }

    public Integer getStudents () {
        return null;
    }

    public Double getAverageExamScore() {
        return null;
    }

    public void addStudent (Student student) {
        this.students.add(student);
    }

    public void removeStudent (String firstName, String lastName){

    }



}
