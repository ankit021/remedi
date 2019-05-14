package com.amazon.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.beans.AmazoneOrderService;
import com.amazon.beans.BlueDartService;
import com.amazon.beans.DtdcServices;
import com.amazon.beans.Order;
import com.amazon.beans.ShippingAddress;

public class AmazoneDelivery {

	public static void main(String[] args)  {

		
			ApplicationContext ctx= new ClassPathXmlApplicationContext("com/amazon/cfg/amazon.xml");
		

			Order o= ctx.getBean("o",Order.class);
					System.out.println(o.hashCode());
				
			ShippingAddress sh= ctx.getBean("s",ShippingAddress.class);
					System.out.println(sh);									
					
			AmazoneOrderService am=ctx.getBean("a",AmazoneOrderService.class);
					am.placeOrder(o, sh);
			
	}
}
