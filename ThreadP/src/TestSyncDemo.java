
public class TestSyncDemo {

	public static void main(String[] args)
	{
		CallMe target = new CallMe();
		
		Caller obj1 = new Caller(target, "Happy");
		Thread t1 = new Thread(obj1);
		t1.start();
		
		Caller obj2 = new Caller(target, "New");
		Thread t2 = new Thread(obj2);
		t2.start();
		
		Caller obj3 = new Caller(target, "Year");
		Thread t3 = new Thread(obj3);
		t3.start();
	}
}
