package com.NGO.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")

public class Event {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private String category;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date enDate;
	
	@Column(name="location")
	private String location;
	
	@Column(name="image_url")
	private String eventImage;
	
	@Column(name="price")
	private int price;
	
	@Column(name="registration_allowed")
	private Boolean registrationAllowed;
	
	public Event() {
	}
	
	public Event(String name, String category, Date startDate, Date enDate, String location, String eventImage,
			int price, Boolean registrationAllowed) {
		super();
		this.name = name;
		this.category = category;
		this.startDate = startDate;
		this.enDate = enDate;
		this.location = location;
		this.eventImage = eventImage;
		this.price = price;
		this.registrationAllowed = registrationAllowed;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the enDate
	 */
	public Date getEnDate() {
		return enDate;
	}

	/**
	 * @param enDate the enDate to set
	 */
	public void setEnDate(Date enDate) {
		this.enDate = enDate;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the eventImage
	 */
	public String getEventImage() {
		return eventImage;
	}

	/**
	 * @param eventImage the eventImage to set
	 */
	public void setEventImage(String eventImage) {
		this.eventImage = eventImage;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the registrationAllowed
	 */
	public Boolean getRegistrationAllowed() {
		return registrationAllowed;
	}

	/**
	 * @param registrationAllowed the registrationAllowed to set
	 */
	public void setRegistrationAllowed(Boolean registrationAllowed) {
		this.registrationAllowed = registrationAllowed;
	}


	
	
	
}
