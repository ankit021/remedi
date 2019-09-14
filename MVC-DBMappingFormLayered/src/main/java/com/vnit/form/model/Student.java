package com.vnit.form.model;

import lombok.Data;

@Data
public class Student {
	
	private int sId;
	private String sName;
	private String email;
	private String[] gender;
	private String[] qualification;
	private String[] courses;
	private String[] timings;
	
}
