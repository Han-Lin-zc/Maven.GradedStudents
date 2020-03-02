package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.logging.Logger;


public class ClassroomTest {

    private static final Logger LOGGER = Logger.getLogger(Classroom.class.getName());

    Classroom classroom = new Classroom();
    Student student1 = new Student("Han", "Lin", new Double[]{100.0, 90.0, 80.0});
    Student student2 = new Student("Adam", "Bennett", new Double[]{40.0, 50.0, 70.0});
    Student student3 = new Student("Moe", "Ay", new Double[] { 80.0, 50.0, 70.0});

    @Before
    public void setUp() {
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
    }

    @Test
    public void getStudentsTest() {
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
        Assert.assertEquals(expected, classroom.getAverageExamScore());
    }

    @Test
    public void addStudentTest() {
        Assert.assertEquals(3, classroom.getStudents().size());

    }

    @Test
    public void removeStudentTest() {
        classroom.removeStudent(student2);
        Assert.assertEquals(2, classroom.getStudents().size());
    }

    @Test
    public void getStudentsByScoreTest() {
        int maxNumberOfStudents = 5;
        Classroom classroom2 = new Classroom(maxNumberOfStudents);
        Double[] examScores0 = { 100.0, 150.0, 250.0, 0.0 };
        Student student0 = new Student("Aeon", "Hunter", examScores0);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        Double[] examScores2 = { 100.0, 150.0, 250.0, 0.0 };
        Student student2 = new Student("Leon", "Bunter", examScores2);
        Double[] examScores3 = { 100.0, 100.0, 100.0, 0.0 };
        Student student3 = new Student("Test", "Are", examScores3);
        Student[] expectedStudent = {student2, student0, student, student3};

        classroom2.addStudent(student);
        classroom2.addStudent(student2);
        classroom2.addStudent(student3);
        classroom2.addStudent(student0);
        Student[] actualStudents = classroom2.getStudentByScore();
        for (int i = 0; i < actualStudents.length; i++) {
            LOGGER.info("Student Name: " + actualStudents[i].getFirstName()
                    + " " + actualStudents[i].getLastName() + "\n"+
                    actualStudents[i].toString());
        }
        Assert.assertEquals(expectedStudent, actualStudents);

    }
}
