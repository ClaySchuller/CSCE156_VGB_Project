package com.vgb;

public class Company {
	
	private String uuid;
	private String contactUUID;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	/**
	 * @param uuid
	 * @param contactUUID
	 * @param name
	 * @param street
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Company(String uuid, String contactUUID, String name, String street, String city, String state,
			String zipcode) {
		this.uuid = uuid;
		this.contactUUID = contactUUID;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the contactUUID
	 */
	public String getContactUUID() {
		return contactUUID;
	}
	/**
	 * @param contactUUID the contactUUID to set
	 */
	public void setContactUUID(String contactUUID) {
		this.contactUUID = contactUUID;
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
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
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
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}