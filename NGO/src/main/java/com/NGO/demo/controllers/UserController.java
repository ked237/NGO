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

import com.NGO.demo.entity.User;
import com.NGO.demo.service.UserService;




@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/User")
	public List<User> getAll() {
		return userService.listAll();
	}
	
	@GetMapping("/User/{id}")
	public User getOneUser(Long id) {
		return userService.get(id);
	}
	
	
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userService.save(user);
	}
	
	@PutMapping("/updateUser/{id}")
	public void updateUser (@RequestParam Long id, @RequestBody User user) {
		userService.update(id, user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser (@RequestParam Long id) {
		userService.delete(id);
	}
}
