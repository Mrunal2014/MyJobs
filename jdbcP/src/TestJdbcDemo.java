import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestJdbcDemo {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		try
		{
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", 
					"root", "root");
			//get statement
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from viemp");
			System.out.println("Emp Id\t\tNAME\t\tSALARY");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
