 package com.datamanager.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datamanager.student.model.StudentDetailsModel;
import com.datamanager.student.service.Service;

@RestController
@RequestMapping("/student/details")
public class StudentDetailsController {
	
	@Autowired
	Service service;
	
	@GetMapping("/all")
	public Object getAllDetails(){
			return service.getAllDetails();
	}
	
	@GetMapping("/i")
	public Object getDetailsByName(
			@RequestParam(required=false) String name,
			@RequestParam(required = false) Integer age) {
		return service.getDetails(name, age);
	}
	@PostMapping
	public Object createStudentDetails(@RequestBody StudentDetailsModel studentdetails) {
		return service.saveDetails(studentdetails);
	}
	@PutMapping
	public Object updateStudentDetails(@RequestBody StudentDetailsModel studentdetails) {
		return service.updateDetails(studentdetails);
		}
	@DeleteMapping
	public Object deleteStudentDetails(@RequestBody StudentDetailsModel studentdetails) {
		return service.deleteDetails(studentdetails);
		}

	
}
