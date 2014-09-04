
public class SalesManager extends WageEmp{
	int comm;
	int sale;
	public SalesManager(){}
	public SalesManager(int empId, String empName, float empSal,
			int noOfHrs, int ratePHr, int comm, int sale)
	{
		super(empId, empName, empSal, noOfHrs, ratePHr);
		this.comm = comm;
		this.sale = sale;
	}

	@Override
	public float calcEmpSal() {
		return super.calcEmpSal()+(float)((float)comm/100*sale);
	}
}
