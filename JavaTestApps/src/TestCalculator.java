
public class TestCalculator {

	public void add(int a, int b, int c)
	{
		int result=a+b+c;
		System.out.println(" int addition " +(a+b+c));
	}
	
	public void add(byte a, byte b, byte c)
	{
		byte result=(byte)(a+b+c);
		System.out.println(" byte addition " +(a+b+c));
	}
	
	public void add(float a, float b)
	{
		float result=(float)(a+b);
		System.out.println(" float addition " +(a+b));
	}
	
	public void add(String a, String b)
	{
		String fullname=a+b;
		System.out.println(" string addition " +(fullname));
	}
	
	public void add(long a, long b, long c)
	{
		long result=a+b+c;
		System.out.println(" long addition " +(result));
	}
	
	public static void main(String[] args) 
	{
		TestCalculator t1 = new TestCalculator();
		t1.add(10, 20, 30);
		t1.add(10.00f, 20.00f);
		t1.add("Vaishali", "Samant");
		t1.add(10L,20L,30L);
		t1.add((byte)1,(byte)2,(byte)3);
	}

}
