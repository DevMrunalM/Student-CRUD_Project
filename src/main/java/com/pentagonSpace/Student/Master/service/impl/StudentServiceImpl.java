package com.pentagonSpace.Student.Master.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pentagonSpace.Student.Master.model.Student;
import com.pentagonSpace.Student.Master.repository.StudentRepository;
import com.pentagonSpace.Student.Master.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentrepo;
	

	public StudentServiceImpl(StudentRepository studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}


	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

}
