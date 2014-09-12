package User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DBUtil.dbUtil;

public class systemUser
{
	public enum UTYPE { ADMIN, NORMAL };
	
	protected String userID;
	protected String userPwd;
	protected byte userType;

	//Constructor
	public systemUser() { }
	
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserType(byte userType) {
		this.userType = userType;
	}

	public boolean validateUser(String userID, String userPwd, byte userType)
	{
		boolean foundUser = false;
		
		try
		{
			//get connection and check for users
			dbUtil dbObj = dbUtil.getInstance();
			Connection dbCon = dbObj.getDbcon();
			
			//get statement
			Statement dbSt;
			dbSt = dbCon.createStatement();
			ResultSet dbRs = dbSt.executeQuery("select * from sys_users");
			
			while(dbRs.next())
			{
				String uid = dbRs.getString(1);
				String upwd = dbRs.getString(2);
				byte utype = (byte) dbRs.getInt(3);
				if ( uid.equals(userID) &&
					 upwd.equals(userPwd) &&
					 userType == utype )
				{
					foundUser = true;
					return foundUser;
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return foundUser;
	}
}
