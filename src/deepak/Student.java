package deepak;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Student {

    Student(String name,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    Student(String name,int age){
        this.age = age;
        this.name = name;
    }

    public static List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("gaurav",10,"male"));
        studentList.add(new Student("saurav",11,"male"));
        studentList.add(new Student("aryan",12,"male"));
        studentList.add(new Student("bhoomi",8,"female"));
        studentList.add(new Student("gauransh",9,"male"));
        return studentList;
    }

    public static Supplier<Student> studentSupplier = () -> {
        return new Student("gauransh",9,"male");
    };

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


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
