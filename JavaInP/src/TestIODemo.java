import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIODemo {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try
		{
			System.out.println("  Enter UR Name: ");
			String name = br.readLine();
			System.out.println("Enter UR ID: ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter UR Salary: ");
			float sal = Float.parseFloat(br.readLine());
			System.out.println("U entered :" + id + " " + name + " " + sal);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
