
public class Procedure {
	//Attributes
	private String procedureName, procedureDate, practitioner;
	private double procedureCharge;
	//Constructors
	public Procedure() {
		this.procedureName = "";
		this.procedureDate = "";
		this.practitioner = "";
		this.procedureCharge = 0.0;
	}
	public Procedure(String pN, String pD) {
		this.procedureName = pN;
		this.procedureDate = pD;
		this.practitioner = "";
		this.procedureCharge = 0.0;
	}
	public Procedure(String pn, String pd, String p, Double pc) {
		this.procedureName = pn;
		this.procedureDate = pd;
		this.practitioner = p;
		this.procedureCharge = pc;
	}
	//Accessors
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getPractitioner() {
		return practitioner;
	}
	public Double getProcedureCharge() {
		return procedureCharge;
	}
	//Mutators
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}
	public void setProcedureCharge(double procedureCharge) {
		this.procedureCharge = procedureCharge;
	}
	//Override
	public String toString() {
		return "	Procedure: " + this.procedureName + "\n" +
				"	Procedure Date: " + this.procedureDate + "\n" +
				"	Practitioner: " + this.practitioner + "\n" +
				"	Charge: " + this.procedureCharge;
	}
}
