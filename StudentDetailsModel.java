package com.datamanager.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document("StudentDetails")
public class StudentDetailsModel {
 
	@Id
	public String id;

	@Field
	public String name;

	@Field("class")
	public int studentClass;

	public int age;

	@Field("id")
	public int studentId;

	public char grade;

	public StudentDetailsModel(String id, String name, int studentClass, int age, int studentId, char grade) {
		this.name = name;
		this.studentClass = studentClass;
		this.age = age;
		this.studentId = studentId;
		this.grade = grade;
	}
}
