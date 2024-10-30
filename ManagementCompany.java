/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Deals with instances of properties contained in arrays, representing a company's listings
 * Due: 10/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Owen Sorge
*/
public class ManagementCompany {
	private String name;
	private String taxID;
	private double mgmFeePer;
	private Plot plot;
	private Property[] properties;
	private int propertyCount;
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_WIDTH = 10;
	public static final int MGMT_DEPTH = 10;
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0.0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		this.propertyCount = 0;
	}
	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		this.propertyCount = 0;
	}
	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
		this.propertyCount = 0;
	}
	public ManagementCompany(ManagementCompany otherCompany) {
		this(otherCompany.name, otherCompany.taxID, otherCompany.mgmFeePer, otherCompany.plot.getX(), otherCompany.plot.getY(), otherCompany.plot.getWidth(), otherCompany.plot.getDepth());
		this.properties = new Property[MAX_PROPERTY];
		System.arraycopy(otherCompany.properties, 0, this.properties, 0, MAX_PROPERTY);
		this.propertyCount = otherCompany.propertyCount;
	}
	public int addProperty(String name, String city, double rent, String owner) {
		return addProperty(new Property(name, city, rent, owner));
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}
	public int addProperty(Property property) {
		if(propertyCount >= MAX_PROPERTY) {
			return -1;
		}
		if(property == null) {
			return -2;
		}
		if(!plot.encompasses(property.getPlot())) {
			return -3;
		}
		for(int i = 0; i < propertyCount; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		properties[propertyCount++] = new Property(property);
		return propertyCount - 1;
	}
	public void removeLastProperty() {
		if(propertyCount > 0) {
			properties[--propertyCount] = null;
		}
	}
	public boolean isPropertiesFull() {
		return propertyCount >= MAX_PROPERTY;
	}
	public int getPropertiesCount() {
		return propertyCount;
	}
	public double getTotalRent() {
		double totalRent = 0;
		for(int i = 0; i < propertyCount; i++) {
			totalRent += properties[i].getRentAmount();
		}
		return totalRent;
	}
	public Property getHighestRentPropperty() {
		if(propertyCount == 0) {
			return null;
		}
		Property highestRentProperty = properties[0];
		for(int i = 1; i < propertyCount; i++) {
			if(properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
				highestRentProperty = properties[i];
			}
		}
		return highestRentProperty;
	}
	public boolean isManagementFeeValid() {
		if(mgmFeePer >= 0 && mgmFeePer <= 100) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public String getTaxId() {
		return taxID;
	}
	public double getMgmFeePer() {
		return mgmFeePer;
	}
	public Plot getPlot() {
		return plot;
	}
	public Property[] getProperties() {
		return properties;
	}
	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		returnString.append("Management company: ").append(name).append(", Tax ID: ").append(taxID).append(", Management Fee: ").append(mgmFeePer).append("%\n");
		for(int i = 0; i < propertyCount; i++) {
			returnString.append(properties[i].toString()).append("\n");
		}
		return returnString.toString();
	}
}
