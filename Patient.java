
public class Patient {
	//Attributes 
	private String firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactNumber;
	//Constructors
	public Patient() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zipCode = "";
		this.phoneNumber = "";
		this.emergencyContactName = "";
		this.emergencyContactNumber = "";
	}
	public Patient(String fN, String mN, String lN) {
		this.firstName = fN;
		this.middleName = mN;
		this.lastName = lN;
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zipCode = "";
		this.phoneNumber = "";
		this.emergencyContactName = "";
		this.emergencyContactNumber = "";
	}
	public Patient(String fn, String mn, String ln, String sa, String c, String s, String zc, String pn, String ecname, String ecnumber) {
		this.firstName = fn;
		this.middleName = mn;
		this.lastName = ln;
		this.streetAddress = sa;
		this.city = c;
		this.state = s;
		this.zipCode = zc;
		this.phoneNumber = pn;
		this.emergencyContactName = ecname;
		this.emergencyContactNumber = ecnumber;
	}
	//Accessors
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	//Mutators
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	//Build Methods
	public String buildFullName() {
		return this.firstName + " " + this.middleName + " " + this.lastName;
	}
	public String buildAddress() {
		return this.streetAddress + " " + this.city + " " + this.state + " " + this.zipCode;
	}
	public String buildEmergencyContact() {
		return this.emergencyContactName + " " + this.emergencyContactNumber;
	}
	//Override
	public String toString() {
		return "Name: " + buildFullName() + "\n" +
				"Address: " + buildAddress() + "\n" +
				"Emergency Contact: " + buildEmergencyContact();
	}
}
