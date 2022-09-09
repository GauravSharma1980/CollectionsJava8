package deepak.optional;

import deepak.Student;

import java.util.List;
import java.util.Optional;

public class OptionalOrElse {

    //OrElse
    //OrElseGet
    //OrElseThrow
    public static void main(String[] args) {

        List<Student> studentList = Student.getStudentList();
        Optional<Student> optionalStr =  Optional.ofNullable(Student.studentSupplier.get());
        System.out.println(optionalStr.map(Student::getName).orElse("default"));

        optionalStr =  Optional.ofNullable(null);
        System.out.println(optionalStr.map(Student::getName).orElse("default"));

        optionalStr =  Optional.ofNullable(null);
        System.out.println(optionalStr.map(Student::getName).orElseGet(()->"orElseGet"));

        optionalStr =  Optional.ofNullable(null);
        //System.out.println(optionalStr.map(Student::getName).orElseThrow());

        optionalStr =  Optional.ofNullable(null);
        System.out.println(optionalStr.map(Student::getName).orElseThrow(()->new RuntimeException("run time exception....")));

    }
}
