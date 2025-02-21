package unl.soc;

public class Contract extends Item{
	
	private String companyUUID;

	public Contract(String uuid, String type, String name, String companyUUID) {
		super(uuid, type, name);
		this.companyUUID = companyUUID;
	}

	/**
	 * @return the companyUUID
	 */
	public String getCompanyUUID() {
		return companyUUID;
	}

	/**
	 * @param companyUUID the companyUUID to set
	 */
	public void setCompanyUUID(String companyUUID) {
		this.companyUUID = companyUUID;
	}
	
}