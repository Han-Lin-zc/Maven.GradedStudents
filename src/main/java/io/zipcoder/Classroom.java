package io.zipcoder;

import java.util.*;

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

    public void removeStudent (Student student){
        this.students.remove(student);
    }

    public Collection<Student> getStudentByScore() {
        Map<Double, Student> treeMap = new TreeMap<Double, Student>(Collections.reverseOrder());
       // treeMap.put(getAverageExamScore(),getStudentByScore());
        return treeMap.values();
    }

}
