import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TestFileReadDemo {

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Bash Shell Scripting\\Java\\JavaTestApps\\src\\MyDate.java");
			try
			{
				int data = fis.read();
				
				while ( data != -1 )
				{
					System.out.print(data);
					data = fis.read();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
