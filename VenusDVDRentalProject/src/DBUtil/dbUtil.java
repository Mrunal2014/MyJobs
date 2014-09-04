package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbUtil
{
	private static dbUtil dbUtilObj;
	protected Connection dbcon;
	
	   
	   private dbUtil()
	   {
			try
			{
				//load driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//get connection
				dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/venusdvd", 
						"root", "root");
			}
			catch (ClassNotFoundException e)
			{
				
				e.printStackTrace();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	   }
	   
	   public static dbUtil getInstance( ) {
		   if ( dbUtilObj == null )
		   {
			   dbUtilObj = new dbUtil();
		   }
	      return dbUtilObj;
	   }

	public Connection getDbcon() {
		return dbcon;
	}
}
