package unl.soc;

public class Persons {
	
	private String uuid;
	private Person person;
	private String email;
	
	/**
	 * @param uuid
	 * @param person
	 * @param email
	 */
	public Persons(String uuid, Person person, String email) {
		this.uuid = uuid;
		this.person = person;
		this.email = email;
	}

	/**
	 * @return the uuid
	 */
	public String getUUID() {
		return uuid;
	}

	/**
	 * @param  uuid the uuid to set
	 */
	public void setUUID(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
