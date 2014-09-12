
public class TestAccountBal {

	public static void main(String[] args) {
		int currBal = 7000;
		int withdrawAmt = 15000;
		
		if(withdrawAmt >= currBal)
		{
			try
			{
				throw new LowBalanceException(" Sorry Less balance");
			}
			catch (LowBalanceException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("  Yes U have enough money " +
					currBal + " U can withdraw ");
		}
	}
}
