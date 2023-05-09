package com.NGO.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "address_number")
	private int addressNumber;
	
	@Column(name = "street_name")
	private String streetName;
	
	@Column(name = "secondary_address")
	private int secondaryAddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zipcode")
	private int zipcode;
	
	@ManyToOne
	private User user;

	public Address() {
		
	}
	
	public Address(int addressNumber, String streetName, int secondaryAddress, String city, String state, int zipcode) {
		super();
		this.addressNumber = addressNumber;
		this.streetName = streetName;
		this.secondaryAddress = secondaryAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
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
	 * @return the addressNumber
	 */
	public int getAddressNumber() {
		return addressNumber;
	}

	/**
	 * @param addressNumber the addressNumber to set
	 */
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the secondaryAddress
	 */
	public int getSecondaryAddress() {
		return secondaryAddress;
	}

	/**
	 * @param secondaryAddress the secondaryAddress to set
	 */
	public void setSecondaryAddress(int secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public int getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


}
