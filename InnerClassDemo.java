// _______________________________________________________________________________________

/*1. Normal (or) Regular inner class: If we are declaring any named class inside another class
directly without static modifier such type of inner classes are called normal or regular inner
classes.*/
//

//java Outer
// Error: Main method not found in class Outer, please define the main method as:
//    public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application

//for running
// java Outer$Inner
// same of inner
/*class Outer
{
	class Inner
	{

	}
}*/

// _______________________________________________________________________________________

// outer main method

/*class Outer
{
	class Inner
	{

	}
	public static void main(String[] args) {
	System.out.println("outer main method");
	
	}
}
*/
// _______________________________________________________________________________________

/*error: Illegal static declaration in inner class Outer.Inner
        public static void main(String[] args) {
                           ^
  modifier 'static' is only allowed in constant variable declarations*/

/*class Outer
{
	class Inner
	{

	public static void main(String[] args) {
		System.out.println("outer main method");
	}

	}
}*/

// _______________________________________________________________________________________

// access code of inner class by static area of outer class

/*class Outer
{
	class Inner
	{
	    void m1()
		{
			System.out.println("inner class m1");
		}
	}

	public static void main(String[] args) {
		// 1st way
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();	

		// 2nd way
		Outer.Inner i1 = new Outer().new Inner();
		i1.m1();

		// 3r way
		new Outer().new Inner().m1();

	}
}*/

// _______________________________________________________________________________________

// accessing Inner class from instance area of outer class 

/*class Outer
{
	class Inner
	{
	    void m1()
		{
			System.out.println("inner class m1");
		}
	}

	void m2()
	{
		new Inner().m1();
		System.out.println("method m2 outer");

	}

	public static void main(String[] args) {
	   Outer o = new Outer();
	   o.m2();
	}
}*/


/*class Outer
{
	class Inner
	{
	    void m1()
		{
			System.out.println("inner class m1");
		}
	}

	void m2()
	{
		Inner i = new Inner();
		i.m1();
	}


}

class Test
{
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m2();
	}
}
*/
// _______________________________________________________________________________________

//accessing inner class code from outside outer class

/*class Outer
{
	class Inner
	{
	    void m1()
		{
			System.out.println("inner class m1");
		}
	}
}

class Test
{
	public static void main(String[] args) {
		// 1st way
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();	

		// 2nd way
		Outer.Inner i1 = new Outer().new Inner();
		i1.m1();

		// 3r way
		new Outer().new Inner().m1();

	}
}*/


// _______________________________________________________________________________________

// From inner class we can access all members of outer class (both static and non-static,
// private and non private methods and variables) directly.

/*class Outer
{
 	int i = 10;
 	static int j = 20;

	class Inner
	{
        void m1(){
		System.out.println("i is "+ i);
		System.out.println("j is "+ j);	
        }
	}
	public static void main(String[] args) {
		new Outer().new Inner().m1();	
	}
}*/

// _______________________________________________________________________________________


// Within the inner class "this" always refers current inner class object. To refer current
// outer class object we have to use “outer class name.this .

/*class Outer
{
	int x =10;
	class Inner
	{
 		int x = 100;
 		void m1()
 		{
 			int x = 1000;
 			System.out.println(x);
 			System.out.println(this.x);
 			System.out.println(Outer.this.x);
 		}
	}
	public static void main(String[] args) {
	   new Outer().new Inner().m1();	
	}

}*/

// _______________________________________________________________________________________

// method Local Inner Classess
// _______________________________________________________________________________________

/*class Outer
{

    void m1()
 	{
 		class Inner{
 			void sum(int a,int b)
 			{
 				System.out.println(a+b);
 			}
 		}
 		Inner i = new Inner();
 	    i.sum(2,3);
 		;;;;;;;;
 		i.sum(100,99);
 		;;;;;;;
 		i.sum(2,2);
	}

	public static void main(String[] args) {
	   new Outer().m1();	
	}

}*/

// _______________________________________________________________________________________

// If we are declaring inner class inside instance method then we can access both static
// and non static members of outer class directly.
//  But if we are declaring inner class inside static method then we can access only static
// members of outer class directly and we can’t access instance members directly.

/*class Outer
{
	int x =10;
	static int y =100;

    void m1()
 	{
 		class Inner{
 			void m2()
 			{
 				System.out.println(x);
 				System.out.println(y);
 			}
 		}
 		new Inner().m2();
	}

	public static void main(String[] args) {
	   new Outer().m1();	
	}

}*/

/* error: non-static variable x cannot be referenced from a static context
                                System.out.println(x);
                                                   ^*/
/*class Outer
{
	int x =10;
	static int y =100;

    static void m1()
 	{
 		class Inner{
 			void m2()
 			{
 				System.out.println(x);
 				System.out.println(y);
 			}
 		}
 		new Inner().m2();
	}

	public static void main(String[] args) {
	   new Outer().m1();	
	}

}*/

// _______________________________________________________________________________________
//----------------------------------------------------------------------------------------

//by Experiment its running for both 

// From method local inner class we can’t access local variables of the method in which we
// declared it. But if that local variable is declared as final then we won’t get any compile
// time error.

/*class Outer
{
    static void m1()
 	{
 		int x = 666;
 		class Inner{
 			void m2()
 			{
 				System.out.println(x);  //output 666
 			}
 		}
 		new Inner().m2();
	}

	public static void main(String[] args) {
	   new Outer().m1();	
	}

}*/

/*class Outer
{
    static void m1()
 	{
 		final int x = 666;
 		class Inner{
 			void m2()
 			{
 				System.out.println(x);
 			}
 		}
 		new Inner().m2();
	}

	public static void main(String[] args) {
	   new Outer().m1();	
	}

}*/

// _______________________________________________________________________________________

// Annoynimas inner classess

// types
// 1) We are creating child class for PopCorn without name.
// 2) We are overriding taste() method.
// 3) We are creating object for that child class with parent reference
//________________________________________________________________________________________

// We are creating child class without name for the PopCorn class and for that child class
// we are creating an object with Parent PopCorn reference

// que how many .class file will be generated
// ans = 4;
// Popcorn.class    Test.class    Test$1.class   Test$2.class<--  just like outer.Innter
// 

/*class Popcorn
{
	void taste()
	{
		System.out.println("salty");
	}
}

class Test{
	public static void main(String[] args) {
		
		Popcorn p = new Popcorn();
		p.taste();

		// if we want to change taste for today only for one time
		Popcorn p1 = new Popcorn()//<-- it is annoynimas child of popcorn
		{
			@Override
			void taste()
			{
				System.out.println("spicy + salty");
			}
		};
		p1.taste();

		Popcorn p2 = new Popcorn()//<-- it is annoynimas child of popcorn
		{
			@Override
			void taste()
			{
				System.out.println("sweet");
			}
		};
		p2.taste();
	}
}*/

// _______________________________________________________________________________________

// Inside Anonymous inner classes we can take or declare new methods but outside of
// anonymous inner classes we can’t call these methods

/* error: cannot find symbol
                p1.popcornMethod();
                  ^
  symbol:   method popcornMethod()
  location: variable p1 of type Popcorn*/

/*class Popcorn
{
	void taste()
	{
		System.out.println("salty");
	}
}

class Test{

	public static void main(String[] args) {
		
		Popcorn p1 = new Popcorn()
		{
			@Override
			void taste()
			{
				System.out.println("spicy + salty");
				popcornMethod();
			}
			void popcornMethod()
			{
				System.out.println("i am popcornMethod");
			}
		};

		p1.taste();
		p1.popcornMethod();//<--------------
	}
}*/

// _______________________________________________________________________________________

//annoynims class more example

/*class Test{

	public static void main(String[] args) {
		
		Thread t = new Thread(){
			public void run()
			{
				for(int i=0; i<20; i++)
				System.out.print(i+" ");
			}
		};

		t.start();

		for(int i=20; i<40; i++)
		System.out.print(i+" ");
	}
}*/

// _______________________________________________________________________________________

//annoynims class Interface Example example

/*class Test{

	public static void main(String[] args) {
		
		Runnable r = new Runnable(){
			public void run()
			{
				for(int i=0; i<20; i++)
				System.out.print(i+" ");
			}
		};

		// t.start(); cannot find symbol  t.start();

		Thread t = new Thread(r);//<-- we have to pass r here to call start method for it
		t.start();

		for(int i=20; i<40; i++)
		System.out.print(i+" ");
	}
}*/

// in compact format  ------------------------------------------------

/*class Test{

	public static void main(String[] args) {
		
		//for thinking first 
		//step t.start  => replacing t => new Thred.(___we have to pass a class that implement runnabel___).start();
		//we are passing annonimas class obj

		new Thread(new Runnable(){
			public void run()
			{
				for(int i=0; i<20; i++)
				System.out.print(i+" ");
			}
		}).start();

		for(int i=20; i<40; i++)
		System.out.print(i+" ");
	}
}
*/

// _______________________________________________________________________________________

// 4.  static nested classes
// _______________________________________________________________________________________

// without outer class we can make object of inner class

/*class Outer{
	static class Inner
	{
		static int x =10;
	}
	public static void main(String[] args) {
		int l =Outer.Inner.x; 
		System.out.println(l);
	}
}*/

/*class Outer{
	static class Inner
	{
	   void f()
	   {
	   	System.out.println("static inner class instance method");
	   }
	   static void f1()
	   {
	   	System.out.println("static inner class static method");
	   }
	}
	public static void main(String[] args) {

		// calling instance method 1
		Outer.Inner i = new Outer.Inner();
		i.f();

		// calling instance method 2
		Inner x = new Inner();
		x.f();

		// calling instance method 3
		new Inner().f();

		// we can directly call it
		Inner.f1();


	}
}*/

// _______________________________________________________________________________________
/*class Outer{

	class StaticInner//<--------not static 
	// error: Illegal static declaration in inner class Outer.StaticInner
    //                public static void main(String[] args) {
    //                                   ^
    //  modifier 'static' is only allowed in constant variable declarations
	{
		public static void main(String[] args) {
			System.out.println("inner main method");
		}
	}

	public static void main(String[] args) {
		System.out.println("outer main method");
	}
}*/


/*class Outer{

	static class StaticInner //<----------static 
	{
		public static void main(String[] args) {
			System.out.println("inner main method");
			
			 Outer.main(new String[]{"prem","pk"});//<--- anno
		}
	}

	public static void main(String[] args) {
		System.out.println("outer main method");
	}
}*/

// _______________________________________________________________________________________

// From the normal inner class we can access both static and non static members of outer
// class but from static nested class we can access only static members of outer class.

/*Demo.java
InnerClassDemo.java:587: error: non-static variable x cannot be referenced from a static context
                        System.out.println(x);
                                           ^*/

/*class Outer
{
	int x =10;
	static int y =30;

	static class Inner{
		void m()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		new Inner().m();
	}

}*/






