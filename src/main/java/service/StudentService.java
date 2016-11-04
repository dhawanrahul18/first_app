package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import Model.Student;

@Service
public class StudentService {
	
	Hashtable<String, Student> students = new Hashtable<String, Student>();
	
	public StudentService() {
		Student s = new Student();
		s.setStudentId("s001");
		s.setName("Rahul");
		s.setClassStd("FIRST STD");
		s.setPercentage(60);
		students.put("s001", s);
		
		s = new Student();
		s.setStudentId("s002");
		s.setName("XYZ");
		s.setClassStd("THIRD STD");
		s.setPercentage(80);
		students.put("s002", s);
		
		s = new Student();
		s.setStudentId("s003");
		s.setName("ABC");
		s.setClassStd("SECOND STD");
		s.setPercentage(90);
		students.put("s003", s);
		
	}
	
	public Student getStudent(String id) {
		System.out.println(id);
		if(students.containsKey(id)){
			System.out.println("if");
			return students.get(id);
		}else{
			System.out.println("else");
			return null;
		}
	}
	
	public Hashtable<String, Student> getAll() {
		return students;
	}

}
