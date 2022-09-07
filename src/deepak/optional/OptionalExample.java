package deepak.optional;

import deepak.Student;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

       Student student =  nameAndLengthOfStudent();
       if(student != null){
           System.out.println("student is not null");
       }else{
           System.out.println("student is null");
       }


        System.out.println("Changed Way by using Optional......");
       Optional<Student> studentOptional= nameAndLengthOfStudentUsingOptional();
        if(studentOptional.isPresent()){
            System.out.println("Student is not null");
            int nameLength =  studentOptional.get().getName().length();
            System.out.println("the name length is "+nameLength);
        }else{
            System.out.println("Student is null");
        }
    }

    private static Student nameAndLengthOfStudent() {

        Student student = Student.studentSupplier.get();
        if(student != null)
        {
            return student;
        }else {
            return null;
        }
    }

    private static Optional<Student> nameAndLengthOfStudentUsingOptional(){
        Optional<Student> student = Optional.ofNullable(Student.studentSupplier.get());
        return  student.isPresent()? student:Optional.empty();
    }
}
