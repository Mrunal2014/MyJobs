import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class TestMetadataDemo {

	public static void main(String[] args) throws Exception {

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
			String qry = "select * from viemp";
			ResultSet rs = st.executeQuery(qry);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("No of Columns := " + rsmd.getColumnCount());
			System.out.println(" 1 Column Label: " + rsmd.getColumnLabel(1));
			
			System.out.println("  1 Column name " + rsmd.getColumnName(1));
			System.out.println(" 1 col type name " + rsmd.getColumnTypeName(1));
			System.out.println(" 2 Column Label: " + rsmd.getColumnLabel(2));
			
			System.out.println("  2 Column name " + rsmd.getColumnName(2));
			System.out.println(" 2 col type name " + rsmd.getColumnTypeName(2));
			System.out.println(" 3 Column Label: " + rsmd.getColumnLabel(3));
			
			System.out.println("  3 Column name " + rsmd.getColumnName(3));
			System.out.println(" 3 col type name " + rsmd.getColumnTypeName(3));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
