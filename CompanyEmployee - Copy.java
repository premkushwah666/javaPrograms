import java.util.Scanner;
class Emp
{
	private String name,mobile,address,post;
	private int id,salery;

	Emp(int id,String name,String mobile,String address,String post)
	{
		this.id=id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.post = post;
	}

	public void setter(int salery)
	{
		this.salery=salery;
	}
	public int getter()
	{
		return this.salery;
	}

	public String toString()
	{
		return "id = "+id+" name = "+name+" mobile = "+mobile+"  address = "+address+" post = "+post;
	}

}

class Company
{
	Emp emps[];
	int maxEmp;
	int totalEmp;
	int empCount;
	Company()
	{
		maxEmp = 5;
		totalEmp = -1;
		emps = new Emp[maxEmp];		
	}

	public void newEmp()
	{
		if(totalEmp==maxEmp-1)
		{
			System.out.println("full vacancy");
			return;
		}

		
		String name,mob,add,post;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter emp name");
		name = sc.nextLine();
		System.out.println("enter emp mob");
		mob = sc.nextLine();
  		System.out.println("enter emp add");
		add = sc.nextLine();
		System.out.println("enter emp post");
		post = sc.nextLine();

		totalEmp++;
		Emp e = new Emp(totalEmp+1,name,mob,add,post);
		emps[totalEmp] = e;

}

	public void show()
	{
		for(int i=0; i<=totalEmp; i++)
		{
			System.out.println(emps[i]);
		}
	}		





		
		

}


public class CompanyEmployee{
	public static void main(String[] args) {
		Company e1 = new Company();
		e1.newEmp();
		e1.show();
	}

}