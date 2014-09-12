package DVD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import DBUtil.dbUtil;

public class DVDDaoImpl implements IDVDDao, Serializable 
{
	public String dvdInfoFile = "DVDInfo.txt";
	dbUtil dbObj;
	Connection dbCon;
	
	public DVDDaoImpl() 
	{
		dbObj = dbUtil.getInstance();
		dbCon = dbObj.getDbcon();
	}
	
	@Override
	public void addDVD(dvdInfo dvdObj)
	{
		try
		{
			String query = "select UPC from dvd_info where UPC = ?";
			PreparedStatement dbPst = dbCon.prepareStatement(query);
			
			dbPst.setInt(1, dvdObj.getDvdUPC());
			ResultSet dbRs = dbPst.executeQuery();
			if ( dbRs.wasNull())
			{
				//add DVD
				query = "insert into dvd_info values(?,?,?,?,?,?,?,?,?)";
				dbPst = dbCon.prepareStatement(query);
				
				dbPst.setInt(1, dvdObj.getDvdUPC());
				dbPst.setString(2, dvdObj.getDvdTitle());
				dbPst.setString(3, dvdObj.getDvdComposer());
				dbPst.setString(4, dvdObj.getDvdDirector());
				dbPst.setString(5, dvdObj.getDvdLeadActor());
				dbPst.setString(6, dvdObj.getDvdSupportingActor());
				dbPst.setDate(7, (java.sql.Date)(dvdObj.getDvdYear()));
				dbPst.setInt(8, dvdObj.getDvdCopies());
				dbPst.setFloat(9, dvdObj.getDvdPrice());
				
				int ii = dbPst.executeUpdate();
				if ( ii != 0 )
					System.out.println("New DVD added sucessfuly....");
			}
			else if ( dbRs.first() )
			{
				//update DVD count
				query = "update dvd_info set COPIES = COPIES + 1";
				dbPst = dbCon.prepareStatement(query);
				
				int ii = dbPst.executeUpdate();
				if ( ii != 0 )
					System.out.println("New DVD added sucessfuly....");
			}
			else
			{
				throw new Exception("Invalid DVD information");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public dvdInfo getDVD(int iUPC)
	{
		dvdInfo dvdObj = null;
		
		String query = "select UPC from dvd_info where UPC = ?";
		PreparedStatement dbPst;
		try
		{
			dbPst = dbCon.prepareStatement(query);
			dbPst.setInt(1, iUPC);
			ResultSet dbRs = dbPst.executeQuery();
			if ( dbRs.wasNull())
			{
				dvdObj = null;
			}
			else if ( dbRs.first() )
			{
				dvdObj = new dvdInfo(dbRs.getInt(1),
						dbRs.getString(2),
						dbRs.getString(3),
						dbRs.getString(4), 
						dbRs.getString(5),
						dbRs.getString(6),
						dbRs.getDate(7),
						dbRs.getInt(8),
						dbRs.getFloat(9));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return dvdObj;
	}

	@Override
	public boolean modifyDVD(dvdInfo dvdObj)
	{
		String query = "select UPC from dvd_info where UPC = ?";
		PreparedStatement dbPst;
		boolean found = false;
		
		try
		{
			dbPst = dbCon.prepareStatement(query);
			dbPst.setInt(1, dvdObj.getDvdUPC());
			ResultSet dbRs = dbPst.executeQuery();
			if ( dbRs.wasNull())
			{
				found = false;
			}
			else if ( dbRs.first() )
			{
				//update DVD count
				query = "update dvd_info set UPC = ? " + 
										 " TITLE = ? " +
				                      " COMPOSER = ? " +
				                      " DIRECTOR = ? " +
				                      "LEADACTOR = ? " +
				                "SUPPORTINGACTOR = ? " +
				                          " Year = ? " +
				                        " Copies = ? " +
				                         " Price = ? ";
				dbPst = dbCon.prepareStatement(query);
				
				dbPst.setInt(1, dvdObj.getDvdUPC());
				dbPst.setString(2, dvdObj.getDvdTitle());
				dbPst.setString(3, dvdObj.getDvdComposer());
				dbPst.setString(4, dvdObj.getDvdDirector());
				dbPst.setString(5, dvdObj.getDvdLeadActor());
				dbPst.setString(6, dvdObj.getDvdSupportingActor());
				dbPst.setDate(7, (java.sql.Date)(dvdObj.getDvdYear()));
				dbPst.setInt(8, dvdObj.getDvdCopies());
				dbPst.setFloat(9, dvdObj.getDvdPrice());
				
				int ii = dbPst.executeUpdate();
				if ( ii != 0 )
				{
					System.out.println("DVD recotrd updated sucessfuly....");
					found = true;
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return found;
	}

	@Override
	public ArrayList<dvdInfo> getDVDs()
	{
		Statement dbSt = null;
		ArrayList<dvdInfo> dvdInfoObjList = new ArrayList<dvdInfo>();

		try
		{
			dbSt = dbCon.createStatement();
			ResultSet dbRs = dbSt.executeQuery("select * from dvd_info");
			
			while(dbRs.next())
			{
				dvdInfo obj = new dvdInfo(dbRs.getInt(1),
						dbRs.getString(2),
						dbRs.getString(3),
						dbRs.getString(4), 
						dbRs.getString(5),
						dbRs.getString(6),
						dbRs.getDate(7),
						dbRs.getInt(8),
						dbRs.getFloat(9));
				dvdInfoObjList.add(obj);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return dvdInfoObjList;
	}

	@Override
	public void findDVD(dvdInfo dvdObj)
	{
		System.out.println("Please select the serach criteria to search for DVD:");
		System.out.println("Enter value for search criteria 1 for Title/ 2 for " +
				"Year of publishing/3 for Composer/4 for Actors/5 for Subactors/6 for Directors: ");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int iSearch = Integer.parseInt(bufferRead.readLine());
			String strFieldValue = "";
			String query = "";
			PreparedStatement dbPst;
			
			switch(iSearch)
			{
				case 1:
					System.out.println("Enter title to search for: ");
					strFieldValue = bufferRead.readLine();
					
					query = "select * from dvd_info where TITLE = ?";
					dbPst = dbCon.prepareStatement(query);
					dbPst.setString(2, strFieldValue);
					ResultSet dbRs = dbPst.executeQuery();
					
					
					
					break;
				
				case 2:
					System.out.println("Enter Year of publishing to search for: ");
					break;
					
				case 3:
					System.out.println("Enter Composer to search for: ");
					break;
					
				case 4:
					System.out.println("Enter Actors to search for: ");
					break;
					
				case 5:
					System.out.println("Enter Subactors to search for: ");
					break;
					
				case 6:
					System.out.println("Enter Directors to search for: ");
					break;
			}
	
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void releaseDVD(dvdInfo dvdObj)
	{
		
	}

	@Override
	public void reserveDVD(dvdInfo dvdObj)
	{
		
	}

	@Override
	public void removeDVD(dvdInfo dvdObj)
	{

	}
}
