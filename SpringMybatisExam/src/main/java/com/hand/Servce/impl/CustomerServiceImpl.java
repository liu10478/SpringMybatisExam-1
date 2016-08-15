package com.hand.Servce.impl;

import com.hand.Servce.CustomerService;
import com.hand.dao.CustomerMapper;
import com.hand.pojos.Customer;

public class CustomerServiceImpl implements CustomerService {
	CustomerMapper customerMapper;
	
	public CustomerMapper getCustomerMapper() {
		return customerMapper;
	}

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	public void addCustomer(Customer customer) {
		customerMapper.insertCustomer(customer);
		System.out.println("customer表添加数据成功");
	}

	public Integer lastestId() {
		return customerMapper.maxCustomerId();
	}

	public Customer lastestCustomer(Integer customer_id) {
		
		return customerMapper.selectLastest(customer_id);
	}
}
