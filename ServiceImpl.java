package com.datamanager.student.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.datamanager.student.model.StudentDetailsModel;
import com.datamanager.student.repository.StudentDetailsRepo;
import com.datamanager.student.service.Service;

@Component
public class ServiceImpl implements Service {
	
	@Autowired
	StudentDetailsRepo studentsRepo;
	


	@Override
	public Object getDetails(String name, Integer age) {
		List<StudentDetailsModel> obj = studentsRepo.findStudentDetailsByName(name);
		Map<String, Object> res = new HashMap<String,Object>();
		Map<Integer, StudentDetailsModel> stD = new HashMap<Integer,StudentDetailsModel>();
		if(obj != null) {
			for(StudentDetailsModel st : obj) {
				stD.put(st.studentId, st);
			}
		}
	res.put("Student Details", stD);
		return res;
	}

	
	@Override
	public List<StudentDetailsModel> getAllDetails() {
		
		return studentsRepo.findAll();
	}
	
	
	@Override
	public StudentDetailsModel saveDetails(StudentDetailsModel obj) {
		return studentsRepo.save(obj);
	}
	@Override
	public StudentDetailsModel updateDetails(StudentDetailsModel obj) {
		return studentsRepo.save(obj);
		
	}

	@Override
	public StudentDetailsModel deleteDetails(StudentDetailsModel obj) {
		StudentDetailsModel sD = null;
		if(obj != null) {
			sD = studentsRepo.findById(obj.id).orElse(null);
			if(sD != null && sD != null) {
				studentsRepo.deleteById(sD.id);
			}
		}
		return sD;
	}








	
}
