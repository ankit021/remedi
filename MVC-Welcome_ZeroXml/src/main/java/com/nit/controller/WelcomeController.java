package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nit.service.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired(required=true)
	public WelcomeService service;

	@RequestMapping("/welcome.ds")
	public String loadData() {
		
		return service.getMsg();
	}
	
	@RequestMapping(value="display.ds" , method=RequestMethod.POST)
	public String getData(Model model) {
		
		model.addAttribute("show", service.getMsg());
		
		return "display";
	}
	
	
}
