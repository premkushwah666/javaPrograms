import java.util.*;


interface class Abs
{
	abstract void m1();
	// void m2(){
	// 	System.out.println("non abs m2");
	// }
}

class O extends Abs{

	void m1()
	{
		System.out.println("Overriding m1");
	}

	public static void main(String[] args) {
	   Abs a = new O();
		a.m1();
		a.m2();
	}
}



class P
{
	public static void m1()
	{
		System.out.println("method m1");
	}
	public static void m2()
	{
		System.out.println("method m2");
	}
}

class C extends P
{
	public static void m2()
	{
		System.out.println("method m2");
	}
	public static void m3()
	{
		System.out.println("method m3");
	}
}

class Test1
{

   public static void main(String[] args)
   {
   	
   	P p = new C();
   	p.m1();
   	p.m2();
   	// esko bata de ki ye jo method h jo ki tu dhund ra h vo child me h
   	// or jab tu chalayega to teko mil jayegi
   	((C)p).m3();	

   }


}

class Test{
	/*String s="hello";
	String s1="hellojj";*/
	int a=10;
	public boolean equals(Object ob){
		return a==a;
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		System.out.println(t1.equals(t2));
		//System.out.println(t1.toString());

		
	}
}


class Love 
{
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true)
		{   
		System.out.println("do you love me");
		System.out.println("YEY");
		System.out.println("NO");
		System.out.println("press 1 for yes and 2 for no : ");
			if(sc.nextLine().equals("1"))
			   break;
			else
			{
				System.out.println("\n\n\ntry again");	
			}
		}

	    int i=0;
		while(true)
		{   
			Thread.sleep(10);
			System.out.print(i+++" love you \t");
		}

	}
}

class X
{
	private int x;

	public X(){
		x =10;
	}
	private X(int a){}
	protected X(float a){}
	private X(double x){}

	void setX(int x)
	{
		this.x = x;
	}
	int getX(){
		return x;
	}

	
	public static void main(String[] args) {
		System.out.println("hii");
	}
}


