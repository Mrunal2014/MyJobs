
public class WelcomeThread extends Thread
{
	String msg;
	
	
	public WelcomeThread(String msg) {
		this.msg = msg;
	}

	public void run()
	{
		Thread childT = Thread.currentThread();
		System.out.println("   Inside run method ");
		
		if(childT == TestThreadDemo.t1)
		{
			try {
				TestThreadDemo.t0.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				TestThreadDemo.t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i = 1; i < 5; i++)
		{
			System.out.println(msg  + 
					"  Child  Thread Name: " + childT.getName() +
					  "Child Thread Priority " +
					  childT.getPriority());
			
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
