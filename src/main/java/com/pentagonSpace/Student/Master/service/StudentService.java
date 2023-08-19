package com.pentagonSpace.Student.Master.service;

import java.util.List;

import com.pentagonSpace.Student.Master.model.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);

}
