
public class AssertDemo
{
	static int val = 13;
	
	static int getNum()
	{
		return val;
	}

	public static void main(String[] args)
	{
		int n;
		
		for( int i = 0;  i < 10; i++)
		{
			n = getNum();
			assert n > 0 : "Negative Value";
			System.out.println("N is   "+n);
		}
	}
}


