package com.vgb;

import java.util.List;

public class Persons {
	
	private String uuid;
	private String firstName;
	private String lastName;
	private List<String> email;
	
	/**
	 * @param uuid
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public Persons(String uuid, String firstName, String lastName, List<String> email) {
		this.uuid = uuid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public List<String> getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	
	
	
	
}
