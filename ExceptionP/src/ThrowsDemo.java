
public class ThrowsDemo {

	public void method1()
	{
		System.out.println(" In Method 1");
		method2();
	}
	
	public void method2()
	{
		System.out.println(" In Method 2");
			throw new NullPointerException();
	}
}
