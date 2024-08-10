class Test
{
	{
		System.out.println("first non static block");
	}

	{
		System.out.println("Second non static block");
	}

	static 
	{
		System.out.println("First static block");
	}

	static
	{
		System.out.println("Second static block");
	}

	Test()
	{
		System.out.println("First constructor");
	}

	Test(int a)
	{
		System.out.println("Second constructor");
	}


}

class Control extends Test
{
	public static void main(String[] args) 
	{


		Test test = new Test();

	//	Test test1 = new Test(10);

		int a =10;
		 System.out.println(a);

	   {
		System.out.println("child first  block");
	   }

       {
		System.out.println("child second  block");
	   }

	}

	   static 
	          {
		        System.out.println("child static block");
	           }


}




//4 non static block ko chalane ke liye class ke andar object banana padta hai

/*class Test
{
	{
		System.out.println("first non static block");
	}

	{
		System.out.println("Second non static block");
	}

	static 
	{
		System.out.println("First static block");
	}

	static
	{
		System.out.println("Second static block");
	}



}


class Control extends Test
{
	public static void main(String[] args) {

		Test test = new Test();
	}
}

*/


//3  without making object in main class, what will the output?

// ans only static block will class

/*class Test
{
	{
		System.out.println("first non static block");
	}

	{
		System.out.println("Second non static block");
	}

	static 
	{
		System.out.println("First static block");
	}

	static
	{
		System.out.println("Second static block");
	}



}


class Control extends Test
{
	public static void main(String[] args) {

		
	}
}*/




//1,2
/*class Control
{

	{
		System.out.println("1 non static block");
	}

	static
	{
		System.out.println("1 static block");
	}


	{
		System.out.println("2 non static block");
	}

	static
	{
		System.out.println("2 static block");
	}
	Control()
	{
		System.out.println("constructor");
	}

}

class Test extends Control
{
	public static void main(String[] args) 
	{
		Control control = new Control();
	}
}*/