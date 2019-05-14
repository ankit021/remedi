package com.loan.bean;

import com.loan.beans.Cache;

public class EmiCalculator {
	
	private Cache ch;
	
	public Double compute(Double principal, Integer tenur, String company) {
		
		
		Double emiAmt=null;
		
		Double ri=ch.get(company);
		
		 ri = ri / (12 * 100); // one month interest 
		  int  time = tenur * 12; // one month period 
		    Double emi = (principal * ri * Math.pow(1 + ri, time)) / (Math.pow(1 + ri, time) - 1); 
		
		    Double totalAmt= emi*time;
		
		return emiAmt;
		
		
	}
	public void setCh(Cache ch) {
		this.ch = ch;
	}

}
