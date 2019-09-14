package com.liberary.model;

import lombok.Data;

@Data
public class Book {
	
	private String bId;
	private String bName;
	private String bAuthor;
	private double bPrice;
	private int bQty;
	/*public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public double getbPrice() {
		return bPrice;
	}
	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	public int getbQty() {
		return bQty;
	}
	public void setbQty(int bQty) {
		this.bQty = bQty;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bAuthor=" + bAuthor + ", bPrice=" + bPrice + ", bQty="
				+ bQty + "]";
	}
	*/
	

}
