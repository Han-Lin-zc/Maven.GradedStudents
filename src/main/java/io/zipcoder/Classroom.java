package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    private String firstName;
    private String lastName;
    private ArrayList<Student> students = new ArrayList<>();


    public Classroom (int maxNumberOfStudents) {
        this.students = new ArrayList<>();
    }

    public Classroom (Student[] students) {
        this.students = new ArrayList<>();
    }

    public Classroom () {
        Student[] students = new Student[30];
    }

    public ArrayList<Student> getStudents () {
        return students;
    }

    public Double getAverageExamScore() {
        Double result = 0.0;
        for (Student student : students) {
            result += student.getAverageExamScore();
        }
        return result / students.size();
    }

    public void addStudent (Student student) {
        this.students.add(student);
    }

    public void removeStudent (String firstName, String lastName){

    }



}
