
public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate d1;
		d1=new MyDate(23, 07, 2013);
		
		System.out.println(" DOJ Is : " + d1.dispDate());
		
		MyDate d2 = new MyDate(06,11,1999);
		System.out.println(" DOJ Is : " + d2.dispDate());
		
		MyDate d3 = new MyDate();
		System.out.println(" DOJ Is : " + d3.dispDate());
	}
}
