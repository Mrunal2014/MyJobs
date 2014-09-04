import java.io.BufferedReader;
import java.io.InputStreamReader;
import User.systemUser;

public class VenusDVDRentalApp
{
	public static systemUser sys = new systemUser();
	
	public static void main(String[] args)
	{
			//Venus-DVD Menu Driven System
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	
			try
			{
				while(true)
				{
					System.out.println("\n");
					System.out.println("Please enter the user details: ");
					System.out.println("Enter User ID: ");
					String userID = bufferRead.readLine();
					System.out.println("Enter User Password: ");
					String userPwd = bufferRead.readLine();
					System.out.println("Enter User Type ( 0 for Admin/ 1 for Normal: ");
					String userType = bufferRead.readLine();
					byte utype = Byte.parseByte(userType);
					
					boolean result = sys.validateUser(userID, userPwd, utype);
					if ( result )
					{
						//store user information
						sys.equals(userID); sys.setUserPwd(userPwd); sys.setUserType(utype);
						
						if ( utype == 0 )
							performAdminUserOp();
						else
							performNormalUserOp();
					}
					else
					{
						System.out.println("Invalid user/password/type....");
					}
					System.out.println("Try again(Y/N)?");
					String ask = bufferRead.readLine();
					if(ask.toUpperCase().equals("N"))
						break;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	public static void performAdminUserOp()
	{
		System.out.println();
	}

	public static void performNormalUserOp()
	{
		
	}
	

}

