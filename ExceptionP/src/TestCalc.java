
public class TestCalc {

	public static void main(String[] args) {
		
		int num1 = 50, num2 = 0;
		int result=0;
		int markA[] = {45, 67};
		
		try
		{
			System.out.println(" Marks[0] " + markA[2]);
			result = num1 / num2;
			System.out.println(" Division is : " + result);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			System.out.println("Please check divider " + ae.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception");
		}
		finally
		{
			System.out.println("finally is always executed " + 
					" where exception occur ");
		}
		System.out.println(" Division is: " + result);
	}
}
