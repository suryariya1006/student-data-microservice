package com.datamanager.student.service;

import java.util.List;

import com.datamanager.student.model.StudentDetailsModel;

public interface Service {
	

	
	public Object getDetails(String name, Integer age);
	
	public StudentDetailsModel saveDetails(StudentDetailsModel obj);

	public StudentDetailsModel updateDetails(StudentDetailsModel obj);

	public StudentDetailsModel deleteDetails(StudentDetailsModel obj);

	public List<StudentDetailsModel> getAllDetails();
	
}
