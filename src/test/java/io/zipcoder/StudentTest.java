package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    Student s = new Student();

    @Test
    public void testGetFirstName() {
        String expected = "Leon";
        String actual = s.getFirstName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetLastName() {
        String expected = "Hunter";
        String actual = s.getLastName();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setFirstName() {
        String expected = "Han";
        s.setFirstName(expected);
        Assert.assertEquals(expected, s.getFirstName());
    }


    @Test
    public void setLastName() {
        String expected = "Lin";
        s.setLastName(expected);
        Assert.assertEquals(expected, s.getLastName());
    }

    @Test
    public void getNumberOfExamsTaken() {
        Integer expected = 30;
        Assert.assertEquals(expected, s.getExamScores());
    }

    @Test
    public void getExamScoresTest() {
        Student student = new Student("Han", "Lin", new Double[]{100.0, 99.0, 90.0});
        String expected = "Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 99.0\nExam 3 -> 90.0";
        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void addExamScoreTest() {
        String expected = "Exam Scores:\nExam 1 -> 100.0";
        s.addExamScore(100.0);
        Assert.assertEquals(expected, s.getExamScores());
    }

    @Test
    public void setExamScoreTest() {
        s.setExamScores(0, 90.0);
        String expected = "Exam Scores:\nExam 1 -> 90.0";
        Assert.assertEquals(expected, s.getExamScores());
    }

    @Test
    public void getAverageExamScoreTest() {
        Student student = new Student("Han", "Lin", new Double[]{100.0, 90.0, 80.0});
        Double expected = 90.0;
        Assert.assertEquals(expected, student.getAverageExamScore());
    }

    @Test
    public void toStringTest() {
        Student student = new Student("Han", "Lin", new Double[]{100.0, 90.0, 80.0});
        String expected = "Student Name: " + student.getFirstName() + " " + student.getLastName()
                            + "\n> Average Score: " + student.getAverageExamScore()
                            + "\n> Exam Scores:" + "\nExam 1 -> 100.0\nExam 2 -> 90.0\nExam 3 -> 80.0";
    }
}