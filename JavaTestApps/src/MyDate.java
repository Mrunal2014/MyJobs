
public class MyDate {
	int day;
	int mon;
	int year;
	
	public void initDate()
	{
		day=0;
		mon=0;
		year=0;
	}
	
	public MyDate(int day, int mon, int year)
	{
		this.day=day;
		this.mon=mon;
		this.year=year;
	}
	
	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public String dispDate()
	{
		return day+"/"+mon+"/"+year;
	}
}
