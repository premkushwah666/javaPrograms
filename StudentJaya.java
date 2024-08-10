class Std{
	String name,mob;
	int rollNo;

	Std(String n,String m,int r)
	{
		name = n;
		mob = m;
		rollNo = r;
	}
    
    public String toString()
    {
    	return "name = "+name+" mobile = "+mob+" rollNo = "+rollNo;
    }
}

class CRUD
{
	int capacity;
	int size;
	Std[] value;

	CRUD()
	{
		capacity = 5;
		size = -1;
		value = new Std[capacity];
	}

	void add(String name,String mob,int rollNo)
	{
		Std ob1 = new Std(name,mob,rollNo);
		value[++size] = ob1;
	}

	public String toString()
	{
		String s = "";

		/*for (int i=0; i<=size; i++) {
			s+=value[i]+"\n";
		}*/
		return s;
	}

}

public class StudentJaya                 
{
	public static void main(String[] args) {
		CRUD c1 = new CRUD();
		c1.add("prem","4354235423",1);
		c1.add("jayu","4354235323",2);
		System.out.println(c1);
	}
}