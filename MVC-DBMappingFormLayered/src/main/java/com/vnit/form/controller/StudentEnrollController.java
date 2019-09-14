package com.vnit.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vnit.form.model.Student;
import com.vnit.form.serviceImpl.StudentEnrollServiceImpl;

@Controller
public class StudentEnrollController {
	
	
	public StudentEnrollController() {
			System.out.println("controller class::Constructor()");
	}

	@Autowired(required=true)
	StudentEnrollServiceImpl stdService;
	
	@RequestMapping(value="/regForm.ds")
	public String loadModel(Model model){
	
		System.out.println("load method executing..!!");
		formData(model);
		
		return "studentRegForm";
	}
	
	@RequestMapping(value="/displayForm.ds" , method=RequestMethod.POST)
	public String  viewData(@ModelAttribute("student") Student s,Model model) {
		
		System.out.println("view method executing..!!");
		System.out.println(s);
		model.addAttribute("review",s);
		model.addAttribute("msg","Student registered succesfully..!!");
		formData(model);
		
		return "redirect:/regForm.ds";
	}
	
	private void formData(Model model) {
		
		model.addAttribute("student",new Student());
		model.addAttribute("gender",stdService.getGender());
		model.addAttribute("qualification",stdService.getQualifications());
		model.addAttribute("courses",stdService.getCourses());
		model.addAttribute("timings",stdService.getTimings());

	}
}
