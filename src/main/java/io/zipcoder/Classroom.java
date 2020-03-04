package io.zipcoder;
import java.util.*;

public class Classroom {

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

    public Student[] getStudentByScore() {
        CompareStudent compareStudent = new CompareStudent();
        Collections.sort(students, compareStudent);
        Student[] result = new Student[students.size()];

        for (int i = 0; i < students.size(); i++) {
            result[i] = students.get(i);
        }
        return result;
    }

    public Map<Student, Character> getGradeBook() {
        Map<Student, Character> gradeBook = new LinkedHashMap<>();
        Student[] arr = getStudentByScore();
        double highestScore = arr[0].getAverageExamScore();
        double lowestScore = arr[arr.length - 1].getAverageExamScore();

        for (Student student : arr) {
            if (student.getAverageExamScore() >= highestScore - 10) {
                gradeBook.put(student, 'A');
            } else if (student.getAverageExamScore() >= highestScore - 29) {
                gradeBook.put(student, 'B');
            } else if (student.getAverageExamScore() >= highestScore - 50) {
                gradeBook.put(student, 'C');
            } else if (student.getAverageExamScore() >= highestScore - 89) {
                gradeBook.put(student, 'D');
            } else {
                gradeBook.put(student, 'F');
            }
        }
        return gradeBook;
    }

}
