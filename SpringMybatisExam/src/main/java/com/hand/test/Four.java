package com.hand.test;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.Servce.AddressService;
import com.hand.Servce.CustomerService;
import com.hand.dao.CustomerMapper;
import com.hand.pojos.Customer;

public class Four {
	static ApplicationContext context = 
			new ClassPathXmlApplicationContext("ApplicationContext.xml");
	public static void main(String[] args) {
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		AddressService addressService = (AddressService) context.getBean("addressService");
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入first_name");
		String first_name=in.next();
		System.out.println("请输入last_name");
		String last_name=in.next();
		System.out.println("请输入email");
		String email=in.next();
		System.out.println("请输入address_id");
		String address_id=in.next();
		
		do{
			System.out.println("address_id不存在,请重新输入:");
			address_id=in.next();
		}while(addressService.isAddressId(Integer.parseInt(address_id))==false);
		
			Customer customer = new Customer();
			customer.setFirst_name(first_name);
			customer.setLast_name(last_name);
			customer.setEmail(email);
			customer.setAddress_id(Integer.parseInt(address_id));
			customer.setCreate_date(new Date(new java.util.Date().getTime()));
			customerService.addCustomer(customer);
		
	}
	
}
