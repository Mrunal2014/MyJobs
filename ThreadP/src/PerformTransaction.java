
public class PerformTransaction {

	public static void main(String[] args)
	{
		try
		{
			final boolean withdraw = true, deposit = false;
			Account account1 = new Account(10000.00f);
			AccountUser task1 = new AccountUser(account1, deposit, 3000.0f);
			AccountUser task2 = new AccountUser(account1, withdraw, 2000.0f);
			
			task1.start();
			task2.start();
			task1.join();
			task2.join();
			
			System.out.println("Final balance is ....." 
					+ account1.balance);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
