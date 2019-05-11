package com.adobe.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.adobe.bean.MSgFormater;

public class MyApp {

	public static void main(String[] args) {

		Resource res=new ClassPathResource("com/adobe/cfg/msg.xml");
		
		BeanFactory fact=new XmlBeanFactory(res);
		
			MSgFormater m=fact.getBean("msg",MSgFormater.class);
			
			m.message("hello every one, Construter injection executed..!");
	}

}
