package com.amazon.beans;

import lombok.Data;

@Data
public class Order {

	private Integer oId;
	private Integer itemCode;
	private Integer itemQty;
	private double price;
	
}
