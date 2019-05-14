package com.loan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.loan.bean.EmiCalculator;
import com.loan.beans.Cache;

public class MyEmi {

	public static void main(String[] args) {

			ApplicationContext ctx= new ClassPathXmlApplicationContext("com/loan/cfg/loan.xml");
			
				EmiCalculator em= ctx.getBean("emi",EmiCalculator.class);
				
				em.compute(600000.00, 3, "MS");
		
	}

}
