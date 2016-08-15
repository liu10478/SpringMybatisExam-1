package com.hand.Servce;

import com.hand.pojos.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Integer lastestId();
	public Customer lastestCustomer(Integer customer_id); 
}	
