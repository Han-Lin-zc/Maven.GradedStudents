package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    Student student = new Student("Han", "Lin", new Double[]{100.0, 90.0, 80.0});

    @Test
    public void getFirstNameTest() {
        String expected = "Han";
        String actual = student.getFirstName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastNameTest() {
        String expected = "Lin";
        String actual = student.getLastName();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setFirstName() {
        String expected = "Han";
        student.setFirstName(expected);
        Assert.assertEquals(expected, student.getFirstName());
    }


    @Test
    public void setLastName() {
        String expected = "Lin";
        student.setLastName(expected);
        Assert.assertEquals(expected, student.getLastName());
    }

    @Test
    public void getNumberOfExamsTaken() {
        Integer expected = 3;
        Assert.assertEquals(expected, student.getNumberOfExamsTaken());
    }

    @Test
    public void getExamScoresTest() {
        String expected = "Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 90.0\nExam 3 -> 80.0";
        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void addExamScoreTest() {
        String expected = "Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 90.0\nExam 3 -> 80.0\nExam 4 -> 100.0";
        student.addExamScore(100.0);
        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void setExamScoreTest() {
        student.setExamScores(0, 80.0);
        String expected = "Exam Scores:\nExam 1 -> 80.0\nExam 2 -> 90.0\nExam 3 -> 80.0";
        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void getAverageExamScoreTest() {
        Double expected = 90.0;
        Assert.assertEquals(expected, student.getAverageExamScore());
    }

    @Test
    public void toStringTest() {
        String expected = "\nStudent Name: " + student.getFirstName() + " " + student.getLastName()
                            + "\n> Average Score: " + student.getAverageExamScore()
                            + "\n> Exam Scores:" + "\nExam 1 -> 100.0\nExam 2 -> 90.0\nExam 3 -> 80.0";
        Assert.assertEquals(expected, student.toString());
    }
}