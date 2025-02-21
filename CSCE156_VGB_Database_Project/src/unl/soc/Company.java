package unl.soc;

public class Company {
	
	private String uuid;
	private String contactUUID;
	private String name;
	private Address address;
	/**
	 * @param uuid
	 * @param contactUUID
	 * @param name
	 * @param address
	 */
	public Company(String uuid, String contactUUID, String name, Address address) {
		this.uuid = uuid;
		this.contactUUID = contactUUID;
		this.name = name;
		this.address = address;
	}
	/**
	 * @return the uuid
	 */
	public String getUUID() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUUID(String uuid) {
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
}