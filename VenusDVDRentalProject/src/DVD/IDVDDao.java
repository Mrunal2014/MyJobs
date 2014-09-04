package DVD;

import java.util.ArrayList;

public interface IDVDDao 
{
	public void addDVD(dvdInfo dvdObj);
	public dvdInfo getDVD(int iUPC);
	public boolean modifyDVD(dvdInfo dvdObj);
	public ArrayList<dvdInfo> getDVDs();
	public void findDVD(dvdInfo dvdObj);
	public void releaseDVD(dvdInfo dvdObj);
	public void reserveDVD(dvdInfo dvdObj);
	public void removeDVD(dvdInfo dvdObj);
}
