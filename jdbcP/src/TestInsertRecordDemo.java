import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class TestInsertRecordDemo {

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
			System.out.println("Enter name: ");
			String nm = sc.next();
			System.out.println("Enter sal");
			int sal = sc.nextInt();
			
			String query = "insert into viemp values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, id);
			pst.setString(2, nm);
			pst.setInt(3, sal);
			
			int ii = pst.executeUpdate();
			System.out.println("   Data is inserted in table  " + ii);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
