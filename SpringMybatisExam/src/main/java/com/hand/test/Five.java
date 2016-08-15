package com.hand.test;

import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.Servce.AddressService;
import com.hand.Servce.CustomerService;
import com.hand.pojos.Customer;

public class Five {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		AddressService addressService = (AddressService) context.getBean("addressService");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Integer t = customerService.lastestId();
		Customer customer = customerService.lastestCustomer(t);
		System.out.println("first_name = "+customer.getFirst_name());
		System.out.println("last_name = "+customer.getLast_name());
		System.out.println("email = "+customer.getEmail());
		System.out.println("address="+addressService.getAddress(customer.getAddress_id()));
		System.out.println("create_date="+sdf.format(customer.getCreate_date()));
	}

}
