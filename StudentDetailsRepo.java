package com.datamanager.student.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.datamanager.student.model.StudentDetailsModel;
@Repository
public interface StudentDetailsRepo extends MongoRepository<StudentDetailsModel, String>{
	
	List<StudentDetailsModel> findStudentDetailsByName(String name);
	
	StudentDetailsModel findStudentDetailsByNameAndAge(String name, int age);
	
	List<StudentDetailsModel> findStudentDetailsByAge(int age);
	
	List<StudentDetailsModel> findStudentDetailsByGrade(int grade);
	


}