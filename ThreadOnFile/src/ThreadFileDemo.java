
public class ThreadFileDemo {

	public static void main(String[] args) {
			final String file, s1, s2, s3, s4;
			
			file="demo.txt";
			s1=args[0];
			s2=args[1];
			s3=args[2];
			s4=args[3];
						
			ThredCheck t1 = new ThredCheck(file,s1);
			ThredCheck t2 = new ThredCheck(file,s2);
			ThredCheck t3 = new ThredCheck(file,s3);
			ThredCheck t4 = new ThredCheck(file,s4);
			
			
			
	}

}
