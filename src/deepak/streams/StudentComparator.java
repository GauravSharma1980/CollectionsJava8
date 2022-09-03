package deepak.streams;


import deepak.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class StudentComparator {

    public static void main(String[] args) {

        Comparator<Student> compareStudent = Comparator.comparingInt(Student::getAge);

        List<deepak.Student> studentList = deepak.Student.getStudentList();

        Optional<Student> youngestStudent = studentList.stream().min(compareStudent);

        youngestStudent.ifPresent(student->{
            System.out.println(student.getName()+"::::"+student.getAge());
        });

        List<Student>studentAgeGreaterThen10 = studentList
                .stream()
                .peek(student -> System.out.println("before==>"+student.getAge()+"**"+student.getName()))
                .filter(student -> student.getAge()>10)
                .peek(student -> System.out.println("after==>"+student.getAge()+"**"+student.getName()))
                .collect(toList());

        studentAgeGreaterThen10.forEach(System.out::println);

    }
}
