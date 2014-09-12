import java.io.Serializable;

//public class Emp implements Printable, Sortable, Serializable, Comparable{
public class Emp implements Comparable {
	int id;
	String nm;
	float sal;
	public Emp(int id, String nm, float sal) {
		super();
		this.id = id;
		this.nm = nm;
		this.sal = sal;
	}
	
	public void print(){
		System.out.println("Emp [id=" + id +
				", nm = " + nm + ", sal = " + sal + "]");
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", nm=" + nm + ", sal=" + sal + "]";
	}
	
	public float calcEmpSal()
	{
		return sal;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		Emp ee = (Emp)obj;
		
		if ( this.id == ee.id)
		{
			return true;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}

	@Override
	public int compareTo(Object arg0) {
		Emp obj = (Emp)arg0;
		if(obj.id < this.id)
		{
			return -1;
		}
		else if(obj.id > this.id)
		{
			return 1;
		}
		return 0;
	}

	/*@Override
	public int compareTo(Emp obj)
	{
		if(obj.id < this.id)
		{
			return -1;
		}
		else if(obj.id > this.id)
		{
			return 1;
		}
		return 0;
	}*/

	/*@Override
	public void sort(Sortable sArr[]) {
		Emp[] err = new Emp[sArr.length];
		for(int i = 0; i < sArr.length; ++i)
		{
			err[i] = (Emp)sArr[i];
		}
		System.out.println("before sorting");
		for(int i = 0; i < sArr.length; ++i)
		{
			err[i].print();
		}
		for(int i = 0; i < sArr.length; ++i)
		{
			for(int j = 0; j < sArr.length; ++j)
			{
				Emp temp;
				temp=err[i];
				err[i]=err[j];
				err[j]=temp;
			}
		}
	}*/
}

