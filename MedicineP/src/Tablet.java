
public class Tablet extends Medicine{

	public Tablet(String cmpName, String cmpAddrs, String medName) {
		super(cmpName, cmpAddrs, medName);
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println(" Caution: Please store in a cool and dry place");
	}
}
