
public class Employee {
	int empId;
	String  empName;
	float empSal;
	
	public Employee()
	{
		this.empId = 0;
		this.empName = "Unknown";
		this.empSal = 0.0f;
	}
	
	/*static
	{
		System.out.println("  In Emp Static block");
	}*/
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public static int getCount() {
		return count;
	}

	static int count;
	
	public Employee(int empId,String  empName,float empSal)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		count += 1;
	}
	
	public String dispEmpInfo()
	{
			return "Employee [empId = " + empId + ", emplName = " + empName + ", Basic empSal = " + empSal + "]";
	}
	
	public float calcEmpSal()
	{
		return empSal;
	}
}
