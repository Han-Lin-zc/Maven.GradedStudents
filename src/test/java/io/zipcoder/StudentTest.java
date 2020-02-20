package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetFirstName() {
        Student s = new Student();
        String expected = "Leon";
        String actual = s.getFirstName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetLastName() {
        Student s = new Student();
        String expected = "Hunter";
        String actual = s.getLastName();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setFirstName() {
        Student student = new Student();

    }


    @Test
    public void setLastName() {
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void getExamScores() {
        Double[] expected = { 100.0 , 95.0, 123.0, 96.0};
       // Double[] actual = Student.get
    }
}