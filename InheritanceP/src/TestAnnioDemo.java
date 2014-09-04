
public class TestAnnioDemo {

	public static void main(String[] args) {
			
		   new Emp(33, "gaurav", 5000.0f)
		{
			public void calcConSal()
			{
				System.out.println(this);
				System.out.println(super.calcEmpSal()+(2000));
			}
		}.calcConSal();
	}
}
