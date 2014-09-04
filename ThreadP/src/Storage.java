public class Storage
{
	int data;
	boolean flag = false;
	
	public synchronized int getData()
	{
		if ( !flag )
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("  Got: " + data);
		flag = false;
		notify();
		return data;
	}
	
	public synchronized void setData(int data)
	{
		if(flag)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("  Set: " + data);
		flag = false;
		notify();
	}
}
