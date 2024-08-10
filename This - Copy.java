
//2 we can methods
class This2
{
	private String name;

	void setName(String name)
	{
		this.name=name;
	}

	String getName()
	{
		return this.name;
	}

	void m2()
	{
		System.out.println("m2");
	}

	void m1()
	{
		System.out.println("m1");
		this.m2();//m2(); ase bhi call ho javyegi  //default hota h
	}

}

class Test
{
	public static void main(String[] args) {
		This2 t = new This2();
	    String s = "prem";
    	t.setName(s);
	    System.out.println(t.getName()); 
	}

	
}
