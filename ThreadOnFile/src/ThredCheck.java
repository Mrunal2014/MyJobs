import java.io.BufferedReader;
import java.io.FileReader;


public class ThredCheck extends Thread
{
	public ThredCheck(String file, String str) {
		this.file = file;
		this.str = str;
	}

	String file, str;
	
	@Override
	public void run()
	{
		FileReader fr;
		try
		{
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String text = br.readLine();
			boolean flag = false;
			while(( text = br.readLine()) != null)
			{
				if(text.contains(str))
				{
					flag = true;
					break;
				}
				else
				{
					flag = false;;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	

}
