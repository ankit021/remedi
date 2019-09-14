package com.vnit.form.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnit.form.RepositoryImpl.StudentEnrollRepositoryImpl;
import com.vnit.form.service.StudentEnrollService;

@Service
public class StudentEnrollServiceImpl implements StudentEnrollService {

	@Autowired(required=true)
	StudentEnrollRepositoryImpl std;
	
	public List<String> getGender() {
		return std.listOfGender();
	}

	public List<String> getQualifications() {
		return std.listOfQualifications();
	}

	public List<String> getCourses() {
		return std.listOfCourses();
	}

	public List<String> getTimings() {
		return std.listOfTimings();
	}
}
