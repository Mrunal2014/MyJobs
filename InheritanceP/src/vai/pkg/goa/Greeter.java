package vai.pkg.goa;

public class Greeter {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Greeter(String name) {
		super();
		this.name = name;
	}
	
	public void sayHello(){ 
		System.out.println("Hello " + name);
	}
	
	public void sayGoodbye(){
		System.out.println("GoodBye " + name);
	}
}
