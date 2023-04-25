package com.NGO.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.NGO.demo.entity.Address;
import com.NGO.demo.exception.RessourceNotFoundException;
import com.NGO.demo.repository.AddressRepository;


@Service
@Transactional
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public List<Address> listAll()
	{
		return addressRepository.findAll();
	}
	public void save(Address address)
	{
		addressRepository.save(address);
	}
	public Address get(Long id)
	{
		return addressRepository.findById(id).get();
	}
	public void delete(Long id)
	{
		Optional<Address> optionalAddress = addressRepository.findById(id);
		if(optionalAddress.isPresent()) {
			addressRepository.deleteById(id);
		}
		else {
			throw new RessourceNotFoundException("No such address found");
		}
	}
	
	public void update (Long id, Address address) {
		Optional<Address> optionalAddress = addressRepository.findById(id);
		if (optionalAddress.isPresent()) {
			Address address2 = optionalAddress.get();
			address2.setAddressNumber(address.getAddressNumber()); 
			address2.setCity(address.getCity());
			address2.setSecondaryAddress(address.getSecondaryAddress());
			address2.setStreetName(address.getStreetName());
			address2.setState(address.getState());
			address2.setZipcode(address.getZipcode());
			//using transactional will automatically save 
			//addressRepository.save(address2);
		}
		else {
			throw new RessourceNotFoundException ("No such address found");
		}
	}
	

		

}
