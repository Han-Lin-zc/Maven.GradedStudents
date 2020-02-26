package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {


    Classroom classroom = new Classroom();
    Student student1 = new Student("Han", "Lin", new Double[]{100.0, 90.0, 80.0});
    Student student2 = new Student("Adam", "Bennett", new Double[]{40.0, 50.0, 90.0});
    Student student3 = new Student("Moe", "Ay", new Double[] { 80.0, 50.0, 70.0});



    @Test
    public void getStudents() {
    }

    @Test
    public void getAverageExamScore() {
        Double expected = (student1.getAverageExamScore() + student2.getAverageExamScore()
                         + student3.getAverageExamScore()) / 3.0;
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        Assert.assertEquals(expected, classroom.getAverageExamScore());
    }

    @Test
    public void addStudent() {

    }

    @Test
    public void removeStudent() {
    }
}
