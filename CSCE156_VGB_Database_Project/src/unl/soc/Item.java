package unl.soc;

public abstract class Item {
	
	private String uuid;
	private String type;
	private String name;
	/**
	 * @param uuid
	 * @param type
	 * @param name
	 */
	public Item(String uuid, String type, String name) {
		this.uuid = uuid;
		this.type = type;
		this.name = name;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	
}
