package com.NGO.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.NGO.demo.entity.Address;
import com.NGO.demo.service.AddressService;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/Address")
	public List<Address> getAll(){
		return addressService.listAll();
	}
	
	@GetMapping("/Address/{id}")
	public Address getOneTalk(@RequestParam Long id) {
		
		return addressService.get(id);
	}
	
	@PostMapping("/addAddress")
	public void addAddress(@RequestBody Address address) {
	
		addressService.save(address);
	}
	
	@PutMapping("/updateAddress")
	public void updateAddress (@RequestParam Long id, @RequestBody Address address) {
		addressService.update(id, address);
	}
	
	@DeleteMapping("/deleteAddress")
	public void deleteAddress(@RequestParam Long id) {
		addressService.delete(id);
	}
	
	
}
