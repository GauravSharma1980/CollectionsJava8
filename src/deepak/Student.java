package deepak;

import java.util.ArrayList;
import java.util.List;

public class Student {

    Student(String name,int age){
        this.age = age;
        this.name = name;
    }

    public static List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("gaurav",10));
        studentList.add(new Student("saurav",11));
        studentList.add(new Student("aryan",12));
        studentList.add(new Student("bhoomi",8));
        return studentList;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;




}
