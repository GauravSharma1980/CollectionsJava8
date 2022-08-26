package deepak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {


    //static BiFunction<String,String, Map<String,Integer>> biFunctionInstance = (name, surname) -> name.concat(surname);
    static Predicate<Student> studentPredicate = (student) -> {
        if(student.getAge() > 9){
            return true;
        }
               return false;
    };


    static BiFunction<List<Student>, Predicate<Student>,Map<String,Integer>> anotherBiFunction = ((studentList,studentPredicate) ->{
        Map<String,Integer> studentMap = new HashMap<>();
        studentList.forEach( student -> {
            if(studentPredicate.test(student)){
                studentMap.put(student.getName(),student.getAge());
            }
        });
        return studentMap;
    });



    public static void main(String[] args) {

        List<Student> studentList = Student.getStudentList();
        Map<String,Integer> mapoutput = anotherBiFunction.apply(studentList,studentPredicate);
        System.out.println(mapoutput);
    }
}
