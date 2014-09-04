
public class Account 
{
	public float balance = 0.0f;

	public Account(float balance)
	{
		this.balance = balance;
	}
	
	public void deposit(float amt)
	{
		try
		{
			float curbalance;
			curbalance = balance;
			System.out.println("Read balance as " + balance + 
					" from " + Thread.currentThread() +
					" now adding  " + amt );
			
			Thread.currentThread().sleep(1000);
			curbalance = curbalance + amt;
			Thread.currentThread().sleep(1000);
			balance = curbalance;
			
			System.out.println("Written balance as " + balance + 
					"from " + Thread.currentThread());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void withdraw(float amt)
	{
		try
		{
			float curbalance;
			Thread.currentThread().sleep(1000);
			curbalance = balance;
			System.out.println("Read balance as " + balance + " from " + 
					Thread.currentThread() + "   Now subtracting" + amt);
			Thread.currentThread().sleep(1000);
			curbalance = curbalance - amt;
			Thread.currentThread().sleep(1000);
			balance = curbalance;
			
			System.out.println("Written balance as " + balance + 
					"from " + Thread.currentThread());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
