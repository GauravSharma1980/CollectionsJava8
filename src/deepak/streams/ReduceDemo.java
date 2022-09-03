package deepak.streams;

import deepak.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,3,4,5,6,7);

        int multipliedValue = intList.stream().reduce(1,(firstNumber,secondNumber) -> firstNumber*secondNumber );

        System.out.println(multipliedValue);

        reduceWithoutIdentity(intList);
    }
    private static void reduceWithoutIdentity(List<Integer> intList){

        Optional<Integer> multipliedValue = intList.stream().reduce((firstNumber, secondNumber)->firstNumber*secondNumber);

        System.out.println(multipliedValue.isPresent()?multipliedValue.get():null);

        reduceOperationOnStudent();

        totalAgeOfAllStudent();

    }

    private static void reduceOperationOnStudent()
    {
        List<Student> student = Student.getStudentList();
        Optional<Student> studOptional = student.stream().reduce(
                (student1, student2) ->{
                if(student1.getAge() > student2.getAge())
                    {
                        return student2;
                    }
                else
                {
                    return student1;
                }
        });
        if(studOptional.isPresent()){
            studOptional.stream().forEach(student1 -> System.out.println(student1.getAge()+"***"+student1.getName()));

        }
    }

    private static void totalAgeOfAllStudent(){
        List<Student> studentList = Student.getStudentList();
        int sum = studentList.stream().map(Student::getAge).reduce(0,Integer::sum);
        System.out.println("the total age of all student is "+ sum);
    }


}
