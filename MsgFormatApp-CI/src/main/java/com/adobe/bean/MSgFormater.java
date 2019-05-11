package com.adobe.bean;

public class MSgFormater {

	private IMsgFormatter mFormate=null;
	
	
	public MSgFormater(IMsgFormatter mFormate) {
	this.mFormate=mFormate;
		
	}
	
	public void message(String s) {
		
		System.out.println(s);
		
		String st=mFormate.formate(s);
		
		System.out.println(st);
		
		
	}

}
