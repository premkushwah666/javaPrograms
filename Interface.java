interface I
{
  public void m1();
  public void m2();
  public void m3();
}

abstract class A
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	 public void m3()
	{
		System.out.println("m3 by A");
	}
	
} 

class C extends A
{
	 public void m3()
	 {
	 	System.out.println("m3 by C");
	 }

	public static void main(String[] args) {
	A a = new C();
	a.m1();
	a.m2();
	a.m3();
	}

}