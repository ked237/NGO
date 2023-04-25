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

import com.NGO.demo.entity.Event;
import com.NGO.demo.service.EventService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@GetMapping("/Event")
	public List<Event> getAll(){
		return eventService.listAll();
	}
	
	@GetMapping("/Event/{id}")
	public Event getOneEvent(@RequestParam Long id) {
		return eventService.get(id);
	}
	
	@PostMapping("/addEvent")
	public void addAddress(@RequestBody Event event) {
		eventService.save(event);
	}
	
	@PutMapping("/updateEvent")
	public void updateEvent (@RequestParam Long id, @RequestBody Event event) {
		eventService.update(id, event);
	}
	
	@DeleteMapping("/deleteEvent")
	public void deleteEvent (Long id) {
		eventService.delete(id);
	}
	

}
