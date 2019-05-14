package com.amazon.beans;

public class AmazoneOrderService {
	
	public void placeOrder(Order order, ShippingAddress shipping) {
	
		System.out.println("OrderPalced...!!");
		
		int s=	shipping.getPincode();
		
	if(s>=500080) {
		blue.deliver();
		}
		else {
			dtdc.deliver();
		}
	}
		private IDelevryServices blue;
		private IDelevryServices dtdc;
			public void setBlue(IDelevryServices blue) {
				this.blue = blue;
			}
			public void setDtdc(IDelevryServices dtdc) {
				this.dtdc = dtdc;
			}
			@Override
			public String toString() {
				return "AmazoneOrderService [blue=" + blue + ", dtdc=" + dtdc + "]";
			}
}
