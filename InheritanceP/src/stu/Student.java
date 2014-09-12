package stu;
import bat.Batch;

public class Student {
	int rollNo;
	String stuName;
	Batch stuBatchInfo;
	public Student(int rollNo, String stuName, Batch stuBatchInfo) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.stuBatchInfo = stuBatchInfo;
	}
	
	public String dispStuInfo() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName
				+ ", stuBatchInfo=" + stuBatchInfo + "]";
	}
	
	
}
