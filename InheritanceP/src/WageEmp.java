
public class WageEmp extends Employee {
			
		int noOfHrs;
		int ratePHr;
		
		public WageEmp() { }
		public WageEmp(int empId, String empName, float empSal,int noOfHrs, int ratePHr) 
		{
			super(empId, empName, empSal);
			this.empName = empName;
			this.empId = empId;
			this.empSal = empSal;
			this.ratePHr = ratePHr;
			this.noOfHrs = noOfHrs;
		}
		
		@Override
		public float calcEmpSal() {
			//System.out.println("CalcEmpSal of WageEmp called");
			return super.calcEmpSal() + (noOfHrs * ratePHr * 20);
		}
}
