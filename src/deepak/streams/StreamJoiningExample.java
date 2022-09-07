package deepak.streams;

import deepak.Student;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static void main(String[] args) {

        //Collecting all the names of students in a string

        String studentNameList = Student.getStudentList().stream().map(Student::getName).collect(Collectors.joining());

        System.out.println(studentNameList);

        studentNameList = Student.getStudentList().stream().map(Student::getName).collect(Collectors.joining(","));

        System.out.println(studentNameList);

        studentNameList = Student.getStudentList().stream().map(Student::getName).collect(Collectors.joining(",","(",")"));

        System.out.println(studentNameList);
    }
}
