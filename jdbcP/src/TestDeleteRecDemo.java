import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class TestDeleteRecDemo {

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
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			
			String query = "delete from viemp where EID = ?";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, id);
			
			int ii = pst.executeUpdate();
			System.out.println("   Data is deleted from table  " + ii);
			
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
