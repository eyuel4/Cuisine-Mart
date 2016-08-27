package com.cuisine_mart.user.service.IServiceContract;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cuisine_mart.user.domain.Address;

@Service
public interface IAddressService {
	void saveAddress(Address address);
	List<Address> getAllAddress();
}