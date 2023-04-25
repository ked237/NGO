package com.NGO.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.NGO.demo.entity.Address;

@CrossOrigin("http://localhost:4200")
public interface AddressRepository  extends JpaRepository<Address, Long>{

}
