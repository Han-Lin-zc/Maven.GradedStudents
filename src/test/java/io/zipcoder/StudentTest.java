package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void constructorTest() {
        String expectedFirstName = "Leon";
        String expectedLastName = "Hunter";
        Double[]  expectedExamScores = { 100.0 , 95.0, 123.0, 96.0 };

        //String actualFirstName = Student.getFirstName();

    }

    @Test
    public void getFirstName() {
        Student s = new Student();
        String expected = "Leon";
        String actual = s.getFirstName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastName() {
        Student s = new Student();
        String expected = "Hunter";
        String actual = s.getLastName();
        Assert.assertEquals(expected,actual);
    }
}