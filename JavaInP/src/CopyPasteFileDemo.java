import java.io.*;


public class CopyPasteFileDemo {

	public static void main(String[] args)
	{
		File sourcefile = null;
		File desifile = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		String line = null;
		
		try
		{
			sourcefile = new File("C:\\Bash Shell Scripting\\Java\\JavaTestApps\\src\\MyDate.java");
			desifile = new File("C:\\Bash Shell Scripting\\Java\\JavaTestApps\\src\\xyz.txt");
			
			fr = new FileReader(sourcefile);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(desifile);
			bw = new BufferedWriter(fw);
			
			line = br.readLine();
			
			while(line != null)
			{
				bw.write(line);
				//System.out.println(line);
				bw.newLine();
				bw.flush();
				line=br.readLine();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
				try
				{
					bw.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
		}
	}
}
