import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TestFileLineReadDemo {

	public static void main(String[] args) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		
		try
		{
			file = new File("C:\\Bash Shell Scripting\\Java\\JavaTestApps\\src\\MyDate.java");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			line = br.readLine();
			
			while(line != null)
			{
				System.out.println(line);
				line=br.readLine();
			}
		}
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
