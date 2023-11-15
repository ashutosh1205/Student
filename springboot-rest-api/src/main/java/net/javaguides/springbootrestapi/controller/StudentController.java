package net.javaguides.springbootrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootrestapi.bean.Student;


@RestController
public class StudentController {
	@GetMapping("student")
	public Student getStudent(){
	    Student student = new Student(
	      1,
	      "ashutosh",
	      "yadav"
	    );
	    return student;
	}
	
	@GetMapping("students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student (1, "ashutosh", "yadav"));
		students.add(new Student (2, "raj", "yadav"));
		students.add(new Student (3, "bal",  "yadav"));
		students.add(new Student (4, "amrut",  "yadav"));
		return students;
	}
	
	@GetMapping("students/{id}/{first-name}/{last-name}")
	public Student studentPathVariable(@PathVariable("id")int studentId,
			@PathVariable ("first-name")String firstName,
			@PathVariable ("last-name")String lastName){
		return new Student(studentId,  firstName, lastName);
		
	}
	
}
