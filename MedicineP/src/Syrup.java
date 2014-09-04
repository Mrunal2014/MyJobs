
public class Syrup extends Medicine{

	public Syrup(String cmpName, String cmpAddrs, String medName) {
		super(cmpName, cmpAddrs, medName);
	}

	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println(" Caution: Shake well before consuming");
	}
}
