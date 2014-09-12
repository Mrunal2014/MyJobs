
public class Producer implements Runnable
{
	Storage storage;
	
	public Producer(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run()
	{
		for( int i = 1; i <= 10; i++)
		{
			storage.setData(i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}