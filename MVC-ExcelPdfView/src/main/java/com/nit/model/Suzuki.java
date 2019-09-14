package com.nit.model;

import lombok.Data;

@Data
public class Suzuki {

	private String carName;
	private String color;
	private double price;
	
	public Suzuki(String carName, String color, double price) {
		this.carName = carName;
		this.color = color;
		this.price = price;
	}
	
	
}
