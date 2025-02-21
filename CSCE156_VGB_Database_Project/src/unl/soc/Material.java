package unl.soc;

public class Material extends Item{
	
	private String unit;
	private double costPerUnit;

	public Material(String uuid, String type, String name, String unit, double costPerUnit) {
		super(uuid, type, name);
		this.unit = unit;
		this.costPerUnit = costPerUnit;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the costPerUnit
	 */
	public double getCostPerUnit() {
		return costPerUnit;
	}

	/**
	 * @param costPerUnit the costPerUnit to set
	 */
	public void setCostPerUnit(double costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	
	
}