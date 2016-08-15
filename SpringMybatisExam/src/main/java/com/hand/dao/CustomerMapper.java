package com.hand.dao;

import com.hand.pojos.Customer;

public interface CustomerMapper {
	public void insertCustomer(Customer customer);
	public Customer selectLastest(int customer_id);
	public Integer maxCustomerId();
}
