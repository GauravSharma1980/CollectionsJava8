package deepak.streams;

import com.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("gaurav",10));
        studentList.add(new Student("saurav",9));
        studentList.add(new Student("haurav",7));
        studentList.add(new Student("laurav",11));

        Function<String,String> studentFunction = (str) -> str.toUpperCase();
        studentList.stream()
                .filter(student -> student.getAge()>7)
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(student -> student.getName().startsWith("g"))
                .peek(student -> {
                    System.out.println("Second Peek"+student);
                })
                .collect(Collectors.toMap(Student::getAge,Student::getName));
                /*.forEach((age,name) -> {
                    System.out.println(age+"**"+name);
                });*/




    }
}
