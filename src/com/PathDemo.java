package com;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.domain.Student;
import com.domain.StudentDetail;

public class PathDemo {

	public static void main(String[] args) {
		
		List<String> pathStringList = new ArrayList<>();
		
		pathStringList.add("c:\\abc\\abc.txt");
		pathStringList.add("c:\\abc\\bcd.txt");
		pathStringList.add("c:\\abc\\efg.txt");
		pathStringList.add("c:\\abc\\hij.txt");
		
		

		Stream<Path> map =  pathStringList.stream().map(uri->Paths.get(uri));
		
		map.forEach(System.out::println);
		
		List<Student> juniorStudentList = new ArrayList<>();
		
		juniorStudentList.add(new Student("Gaurav",20));
		juniorStudentList.add(new Student("Garima",18));
		juniorStudentList.add(new Student("Gauransh",15));
		juniorStudentList.add(new Student("Ganesh",18));
		juniorStudentList.add(new Student("Gayatri",19));
		
		
		
		List<Student> seniorStudentList = new ArrayList<>();
		
		seniorStudentList.add(new Student("PremLata",25));
		seniorStudentList.add(new Student("Ramesh",28));
		seniorStudentList.add(new Student("Dinesh",29));
		seniorStudentList.add(new Student("Vinayak",48));

		
		StudentDetail juniorStudentListDetails = new StudentDetail(1001,juniorStudentList);
		StudentDetail seniorStudentListDetails = new StudentDetail(1002,seniorStudentList);
		
		
		
 		List<StudentDetail> mergeList = new ArrayList<>();
 		
 		mergeList.add(juniorStudentListDetails);
 		mergeList.add(seniorStudentListDetails);
 		
 		Stream<Student> result =  mergeList.stream().flatMap(studentDetail-> studentDetail.getStudentList().stream());
 		
 		result.forEach(System.out::println);
 		
 		
		
	}

}
