package com.hand.Servce.impl;

import com.hand.Servce.AddressService;
import com.hand.dao.AddressMapper;
import com.hand.pojos.Address;
import com.hand.pojos.Customer;

public class AddressServiceImpl implements AddressService{
	AddressMapper addressMapper;
	
	public AddressMapper getAddressMapper() {
		return addressMapper;
	}

	public void setAddressMapper(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

	public boolean isAddressId(int address_id) {
		Address address = addressMapper.findByAddressId(address_id);
		if(address==null){
			return false;
		}else{
			return true;
		}
	}

	public String getAddress(Integer address_id) {
		return addressMapper.getAddress(address_id);
	}

	
}
