package com.pentagonSpace.Student.Master.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="student_name", nullable=false)
	private String name;
	
    private String state;
    
    private String city;
    
    
    private String standard;
    
    private String dob;
    
    private String gender;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", state=" + state + ", city=" + city + ", standard=" + standard
				+ ", dob=" + dob + ", gender=" + gender + ", totalMarks=" + totalMarks + "]";
	}

	public Student( String name, String state, String city, String standard, String dob, String gender,
			double totalMarks) {
		super();
		
		this.name = name;
		this.state = state;
		this.city = city;
		this.standard = standard;
		this.dob = dob;
		this.gender = gender;
		this.totalMarks = totalMarks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double totalMarks;

}
