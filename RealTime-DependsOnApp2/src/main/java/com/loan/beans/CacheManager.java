package com.loan.beans;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class CacheManager {
	
	private Cache ch;
	
	public CacheManager(Cache ch) throws Exception {
		this.ch=ch;
		
		loadData();
	}
	public void loadData() throws Exception {

		try {
			
			FileInputStream f= new FileInputStream("intrest.properties");
			
				Properties p=new Properties();
				
					p.load(f);
					
					System.out.println("loading the file..."+p);
			
				Set<Object> keys= p.keySet();
				
				System.out.println("getting the keys"+keys);
						
				for(Object key: keys) {
					
					String value=(String)p.get(key);
					ch.put((String)key, Double.parseDouble(value));
			
				}
					
		}		catch(Exception e) {e.printStackTrace();}
					
				
		}
	@Override
	public String toString() {
		return "CacheManager [ch=" + ch + "]";
	}
	}
