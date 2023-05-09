package com.NGO.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NGO.demo.entity.User;
import com.NGO.demo.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> listAll()
	{
		return userRepository.findAll();
	}
	public void save(User user)
	{
		userRepository.save(user);
	}
	public User get(Long id)
	{
		return userRepository.findById(id).get();
	}
	
	public void delete(Long id) {
			userRepository.deleteById(id);
		
	}
	
	public void update(Long id, User user) {
		Optional<User> optionalUser = userRepository.findById(id);
			User user2 = optionalUser.get();
			user2.setFirstName(user.getFirstName());
			user2.setLastName(user.getLastName());
			user2.setRole(user.getRole());
			user2.setEmail(user.getEmail());
	}

}
