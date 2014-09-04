import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestDeSerializationDemo {

	public static void main(String[] args) {

		try 
		{
			FileInputStream fis = new FileInputStream("Emp.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Emp tempE = (Emp)ois.readObject();
			System.out.println(tempE.toString());
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
