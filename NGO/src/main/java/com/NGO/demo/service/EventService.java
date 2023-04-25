package com.NGO.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NGO.demo.entity.Event;
import com.NGO.demo.exception.RessourceNotFoundException;
import com.NGO.demo.repository.EventRepository;


@Service
@Transactional
public class EventService {

	@Autowired
	EventRepository eventRepository;
	
	public List<Event> listAll()
	{
		return eventRepository.findAll();
	}
	public void save(Event event)
	{
		eventRepository.save(event);
	}
	public Event get(Long id)
	{
		return eventRepository.findById(id).get();
	}
	public void delete(Long id)
	{
		Optional<Event> optionalEvent = eventRepository.findById(id);
		if (optionalEvent.isPresent()) {
			eventRepository.deleteById(id);
		}
		else {
			throw new RessourceNotFoundException("No such event found");
		}
	}
	public void update(Long id, Event event) {
		Optional<Event> optionalEvent = eventRepository.findById(id);
		if(optionalEvent.isPresent()) {
			Event event2 = optionalEvent.get();
			event2.setCategory(event.getCategory());
			event2.setName(event.getName());
			event2.setLocation(event.getLocation());
			event2.setPrice(event.getPrice());
			event2.setRegistrationAllowed(event.getRegistrationAllowed());
			event2.setEnDate(event.getEnDate());
			event2.setStartDate(event.getStartDate());
			event2.setEventImage(event.getEventImage());
		}
		else {
			throw new RessourceNotFoundException("No such event found");
		}
	}
}
