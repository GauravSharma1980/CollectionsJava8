package deepak.optional;

import deepak.Student;

import java.util.Optional;

//flatMap
//map
//filter
public class OptionalMapFilterFlatMapMap {

    public static void main(String[] args) {

        Optional<Student> studentOptional =  Optional.ofNullable(Student.studentSupplier.get());
        studentOptional
                .filter(student -> student.getAge()>10)
                .ifPresentOrElse(student -> {
                    System.out.println(student.getName());
                },()-> System.out.println("runnable"));



        studentOptional
                .filter(student -> student.getAge()>10)
                .ifPresent(student -> System.out.println(student.getName()));

        if(studentOptional.isPresent()){
            Optional<String> studentOptionalOutput = studentOptional.filter(student -> student.getAge()>1).map(student -> student.getName());
            System.out.println(studentOptionalOutput.get());
        }




    }
}
