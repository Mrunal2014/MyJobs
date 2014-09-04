
public class Caller implements Runnable
{
	String msg;
	CallMe target;
	
	public Caller(CallMe target,String msg ) {
		this.msg = msg;
		this.target = target;
	}

	@Override
	public void run()
	{
		target.call(msg);
	}
}
