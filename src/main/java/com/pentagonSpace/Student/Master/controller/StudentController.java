package com.pentagonSpace.Student.Master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentagonSpace.Student.Master.model.Student;
import com.pentagonSpace.Student.Master.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	@GetMapping("/students")
	public String liststudent(Model model)
	{
		model.addAttribute("students",studentservice.getAllStudent());
		return "students";
	}
	@GetMapping("/students/new")
	public String createstudentForm(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	@PostMapping("/students")
public String saveStudent(@ModelAttribute("student") Student student)
{
	studentservice.saveStudent(student);
	return "redirect:/students";
}
}
