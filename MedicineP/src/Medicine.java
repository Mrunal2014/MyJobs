
public class Medicine {
	String cmpName;
	String cmpAddrs;
	String medName;
	
	public Medicine(String cmpName, String cmpAddrs, String medName) {
		this.cmpName = cmpName;
		this.cmpAddrs = cmpAddrs;
		this.medName = medName;
	}

	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public String getCmpAddrs() {
		return cmpAddrs;
	}

	public void setCmpAddrs(String cmpAddrs) {
		this.cmpAddrs = cmpAddrs;
	}
	
	public void displayLabel(){
		System.out.println(" Comany Name: " + cmpName + "\n" 
				+ " Company Address: " + cmpAddrs + "\n"
				+ " Medicine Name: " + medName);
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

}
