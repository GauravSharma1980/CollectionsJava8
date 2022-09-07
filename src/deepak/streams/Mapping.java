package deepak.streams;

import deepak.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {

        List<Student> studentNamelist = Student.getStudentList();

        List<String> studentNameLst =  studentNamelist.stream().collect(Collectors.mapping(Student::getName,Collectors.toList()));

        System.out.println(studentNameLst);

        Optional student =  studentNamelist.stream().collect(Collectors.minBy(Comparator.comparing(Student::getAge)));

        System.out.println(student.get());

        groupingByTypes(studentNamelist);



    }

    private static void groupingByTypes(List<Student> studentList) {

        Map<String,List<Student>> mapList = studentList.stream().collect(Collectors.groupingBy(Student::getGender));

        System.out.println(mapList);

        mapList= studentList.stream()
                .collect(Collectors.groupingBy(student -> student.getAge()>10?"Senior":"Junior"));

        System.out.println(mapList);

    }
}
