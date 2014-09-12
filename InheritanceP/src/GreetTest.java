import vai.pkg.goa.Advisor;
import vai.pkg.goa.Greeter;

public class GreetTest {
	public static void main(String[] args) {
		Greeter gobj[] = new Greeter[args.length];
		
		for ( int i = 0; i < args.length; ++i)
		{
			gobj[i] = new Greeter(args[i]);
			gobj[i].sayHello();
		}
		
		Advisor aObj = new Advisor();
		System.out.println(aObj.getMessage());
		
		for ( int i = args.length-1; i >= 0; --i)
			gobj[i].sayGoodbye();
	}
}
