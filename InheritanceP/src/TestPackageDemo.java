import bat.Batch;
import stu.Student;


public class TestPackageDemo {

	public static void main(String[] args) {
			Batch morningBatch = new Batch(
					444, "Vaishali", "7:00 A.M");
			
			Student s1 = new Student(555, "Sameer", morningBatch);
			System.out.println(s1.dispStuInfo());
	}
}
