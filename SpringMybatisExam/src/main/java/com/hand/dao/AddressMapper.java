package com.hand.dao;

import com.hand.pojos.Address;

public interface AddressMapper {
	public Address findByAddressId(int address_id);
	public String getAddress(Integer address_id);
}
