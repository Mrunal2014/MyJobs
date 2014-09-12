
public class Consumer implements Runnable
{
Storage storage;
	
	public Consumer(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run()
	{
		for(int i = 1; i <= 10; ++i)
		{
			storage.getData();
			try
			{
					Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
					e.printStackTrace();
			}
		}
	}
}
