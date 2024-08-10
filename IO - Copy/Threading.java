/*class Test 
{
	public static void main(String[] args) 
	{
		DoTask d=new DoTask();
		MyThread t=new MyThread("JAYAAA",d);
		t.start();
		MyThread t1=new MyThread("KUSHWH",d);
		t1.start();
	}
}
    class MyThread extends Thread
    {
    	String name;
    	DoTask d;
    MyThread(String name,DoTask d)
    	{
    		this.name=name;
    		this.d=d;
    	}
    public void run()
       {
    	   d.task(name);
       }
    }
   class DoTask{
   	synchronized public static void task(String name) 
   	{
   		for(int i=1;i<=5;i++)
   		{
   			System.out.println(name+" "+i+" :"+Thread.currentThread().getName());
   		}
   	}
 }*/



 

/* class Outer
 {
 	class Inner{
 		public void innerM()
 		{
 			System.out.println("hello this is innerM");
 		}
 	}
 public static void main(String[] args) 
  {
 	Outer outer = new Outer();
 	Inner inner = outer.new Inner();
    inner.innerM(); 
  }
}


class Sum
{
	public static void main(String[] args) 
	{
		int s=0;
		for (int i=0; i<=args.length; i++) 
		{
			s=s+Integer.parseInt(args[i]);
			System.out.println("SUM IS "+s);
		}
	}
}*/





class Test
{
   public static void main(String[] args) {
   	//Test obj = new Test();
   	//System.out.println(args[0]);
   	PNB p = new PNB();
 	p.getInfo();
 	Class.forname("SBI");
   }
}

class SBI
{
	public void getInfo()
	{
		System.out.println("SBI info");
	}
	static
	{
		System.out.println("SBI static");
	}
}


class RBI
{
	public void getInfo()
	{
		System.out.println("RBI info");
	}
	static
	{
		System.out.println("RBI static");
	}
}



class PNB
{
	public void getInfo()
	{
		System.out.println("PNB info");
	}
	static
	{
		System.out.println("PNB static");
	}
}



class HDFC
{
	public void getInfo()
	{
		System.out.println("HDFC info");
	}
	static
	{
		System.out.println("HDFC static");
	}
}

























   		