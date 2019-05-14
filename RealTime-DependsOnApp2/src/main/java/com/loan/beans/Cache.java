package com.loan.beans;

import java.util.HashMap;
import java.util.Map;

public class Cache {

	Map <String,Double> m= new HashMap<String,Double>();
	
		public void put(String key, Double value) {
			
			m.put(key, value);
			
		}
		
		public Double get(String key) {
			
			return m.get(key);
			
		}

		@Override
		public String toString() {
			return "Cache [m=" + m + "]";
		}
	
}
