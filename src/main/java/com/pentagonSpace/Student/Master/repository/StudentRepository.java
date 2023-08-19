package com.pentagonSpace.Student.Master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pentagonSpace.Student.Master.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	
	
	

}
