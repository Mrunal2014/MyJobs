
public class TestThreadDemo {
	static WelcomeThread t0 = new WelcomeThread("Hello Mrunal");
	static WelcomeThread t1 = new WelcomeThread("Good Bye");
	public static void main(String[] args)
	{
		System.out.println("   Main Starts Here...");
		
		t0.start();
		
		
		t1.start();
		
		try {
			t0.join();
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("*************************");
		System.out.println("  Is t0 Alive?  " + t0.isAlive());
		System.out.println("  Is t1 Alive?  " +  t1.isAlive());
		
		
		Thread mainT = Thread.currentThread();
		
		for ( int i = 1; i < 5; i++)
			{
				System.out.println("   Welcome PSPL " + 
						" Name of Thread: " + mainT.getName() + 
						" Priority: " + mainT.getPriority());
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		System.out.println("Main Ends here.....");
	}
}
