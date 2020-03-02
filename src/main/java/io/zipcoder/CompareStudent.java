package io.zipcoder;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        if (student1.getAverageExamScore().equals(student2.getAverageExamScore())) {
            if (student1.getLastName().equals(student2.getLastName())) {
                return student1.getFirstName().compareTo(student2.getFirstName());
            } else {
                return student1.getLastName().compareTo(student2.getLastName());
            }

        } else {
            if (student1.getAverageExamScore() > student2.getAverageExamScore()) {
                return -1;
            }
            if (student1.getAverageExamScore() < student2.getAverageExamScore()) {
                return 1;
        }


        }
        return 0;
    }
}
