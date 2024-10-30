/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Deals with the characteristics of an area of land in terms of more specific info
 * Due: 10/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Owen Sorge
*/
public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0.0;
		this.owner = "";
		this.plot = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		this.plot = new Plot(otherProperty.plot);
	}
	public String getPropertyName() {
		return propertyName;
	}
	public String getCity() {
		return city;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public String getOwner() {
		return owner;
	}
	public Plot getPlot() {
		return plot;
	}
	@Override
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
}
