package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nit.model.Suzuki;

@Service
public class SuzukiServiceImpl implements SuzukiService{
	
	public SuzukiServiceImpl() {

		System.out.println("serviceClass loaded..!!");
	}
	
	public List<Suzuki> getCarData() {

		System.out.println("GetCar method() load..!!");
		
		List<Suzuki> slist= new ArrayList<Suzuki>();
		
			slist.add(new Suzuki("Swift", "red", 740000.10));
			slist.add(new Suzuki("SwiftDesier", "white", 950000.0));
			slist.add(new Suzuki("S-Cross", "brown", 1200000.25));
		
		return slist;
	}
}
