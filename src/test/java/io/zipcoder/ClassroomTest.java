package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class ClassroomTest {

    Classroom classroom = new Classroom();
    Student student1 = new Student("Han", "Lin", new Double[]{100.0, 90.0, 80.0});
    Student student2 = new Student("Adam", "Bennett", new Double[]{40.0, 50.0, 90.0});
    Student student3 = new Student("Moe", "Ay", new Double[] { 80.0, 50.0, 70.0});



    @Test
    public void getStudentsTest() {
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        Assert.assertEquals(expected, classroom.getStudents());
    }

    @Test
    public void getAverageExamScoreTest() {
        Double expected = (student1.getAverageExamScore() + student2.getAverageExamScore()
                         + student3.getAverageExamScore()) / 3.0;
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        Assert.assertEquals(expected, classroom.getAverageExamScore());
    }

    @Test
    public void addStudentTest() {
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        Assert.assertEquals(3, classroom.getStudents().size());

    }

    @Test
    public void removeStudentTest() {
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.removeStudent(student2);
        Assert.assertEquals(2, classroom.getStudents().size());
    }

    @Test
    public void getStudentsByScoreTest() {

    }
}
