
public class Ointment extends Medicine{

	public Ointment(String cmpName, String cmpAddrs, String medName) {
		super(cmpName, cmpAddrs, medName);
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println(" Caution: For external use only");
	}
	
	
}
