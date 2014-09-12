package vai.pkg.goa;

public class Advisor {
	String message[];

	public Advisor() {
		message = new String[5];
		message[0] = "Keep safe distance";
		message[1] = "Drive safely";
		message[2] = "Wear Helmet";
		message[3] = "Keep premises clean";
		message[4] = "Do not waste food";
	}

	public String getMessage() {
		int rnd = (int)Math.round(Math.random()*4);
		return "Advice: "+message[rnd];
	}
	
	
	
	
}
