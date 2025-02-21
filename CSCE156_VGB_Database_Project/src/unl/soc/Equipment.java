package unl.soc;

public class Equipment extends Item{
	
	private String modelNumber;
	private double cost;

	public Equipment(String uuid, String type, String name, String modelNumber, double cost) {
		super(uuid, type, name);
		this.modelNumber = modelNumber;
		this.cost = cost;
	}

	/**
	 * @return the modelNumber
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * @param modelNumber the modelNumber to set
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}