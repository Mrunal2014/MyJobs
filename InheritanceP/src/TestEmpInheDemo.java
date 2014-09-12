
public class TestEmpInheDemo {
	public static void main(String[] args) {
			
			Employee eArr[];
			eArr = new Employee[4];
			
			eArr[0] = new Employee(444, "Mrunali", 30000.0f);
			eArr[1] = new WageEmp(555, "vikram", 50000.0f, 4, 200);
			eArr[2] = new SalesManager(444, "Rupesh", 30000.0f, 4, 200, 2, 20000);
			eArr[3] = new WageEmp(444, "Lata", 70000.0f, 4, 200);
			
			/*Employee e1 = new Employee(444, "Mrunali", 30000.0f);
			
			WageEmp we1 = new WageEmp(555, "vikram", 5000.0f, 4, 200);
			
			System.out.println(" Permanent Emp: " + e1.toString()+ " Gross Salary: " + e1.calcEmpSal());
			
			System.out.println("Wage Emp: " + we1.toString() + " Gross Salary: " + we1.calcEmpSal());
			
			SalesManager sm1 = new SalesManager(666, "Rupesh", 5000.0f, 4, 200, 2, 2000);
			System.out.println("Sales Mgr: " + sm1.toString() + "Gross Salary: " + sm1.calcEmpSal());
			
			e1=(WageEmp)we1;
			e1.calcEmpSal(); // This is called dynamic binding*/
			
			for(int i = 0; i < eArr.length; ++i)
			{
				if(eArr[i] instanceof SalesManager){
				System.out.println(" SalesManager Employee Info: " + eArr[i].dispEmpInfo() + 
						"Gross Salary: " +  eArr[i].calcEmpSal());
				}
				else if(eArr[i] instanceof WageEmp)
				{
					System.out.println(" Wage Employee Info: " + eArr[i].dispEmpInfo() + 
							"Gross Salary: " +  eArr[i].calcEmpSal());
				}
				else if(eArr[i] instanceof Employee)
				{
					System.out.println(" Employee Info: " + eArr[i].dispEmpInfo() + 
							"Gross Salary: " +  eArr[i].calcEmpSal());
				}

			}
	}
}
