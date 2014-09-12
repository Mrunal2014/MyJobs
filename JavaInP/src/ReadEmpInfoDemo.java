import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;


public class ReadEmpInfoDemo {

	public static void main(String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = null;
		//DataOutputStream dos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream("Emp.txt");
			//dos = new DataOutputStream(fos);
			oos = new ObjectOutputStream(fos);

			for(int i = 0; i < 3; ++i)
			{
				System.out.println("  Enter UR Name: ");
				String name = br.readLine();
				System.out.println("Enter UR ID: ");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter UR Salary: ");
				float sal = Float.parseFloat(br.readLine());
				System.out.println("U entered :" + id + " " + name + " " + sal);
			
				System.out.println("*******Create Employee object************");
				
				Emp ee = new Emp(id,name,sal);
				oos.writeObject(ee);
				
				//dos.writeInt(id);
				//dos.writeUTF(name);
				//dos.writeFloat(sal);
			}
			
			System.out.println("Well All data is written");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
