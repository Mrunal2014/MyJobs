
public class AccountUser extends Thread
{
	boolean operation;
	Account ac;
	float amt;
	public AccountUser(Account ac, boolean operation, float amt)
	{
		this.operation = operation;
		this.ac = ac;
		this.amt = amt;
	}
	
	public void run()
	{
		if ( operation == true )
			ac.withdraw(amt);
		else
			ac.deposit(amt);
	}
}
