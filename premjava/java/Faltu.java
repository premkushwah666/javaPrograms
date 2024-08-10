/*








//static member funtions inherit hote h 
//and if ham same signature ke sath child class me bhi bana dete h to vo funtion hiding kahlati h

//static memeber variable inherit nahi hote h 

/*
class P
{
	static int a;

	static{
		a =30;
	}

	static void m()
	{
		System.out.println("Parent");
	}
}

class C extends P
{
	// int a = 20;              // yha static lagane vali error nahi aati h as static member funtion
	
	//FUNTION HIDING
	// static void m()          // yha cannot override vali error aayegi
	// {
	// 	System.out.println("Child");
	// }
}

class Faltu
{
	public static void main(String[] args) {
		C.m();
		System.out.println(C.a);//  C->P se replace ho jayega
	}

}
*














//java dont have static local variable
//but we can have static inner class
//static funtion instace variable ko access nahi kr sakte
//private static int psv = 33;//we can only access rsv in class raja ** live setter getter

/*class Prem
{
	static int psv =20;
	static void m2()
	{
		System.out.println("prem ki static class");
	}

	void m3() 
	{
		System.out.println("prem ki non static method");
	}

}

class Raja 
{
	int v=11;//we should make constructor
	static int sv=10;
	private static int psv = 33;//we can only access rsv in class raja ** live setter getter

	public static void set(int v)
	{
		psv = v;
		System.out.println(psv);
	}

	static void m1()
	{
		//static int x=12;  java dont have static local variable
		//v=12;  error instatce var ko use ni kr skte
		// sv =122;  ok
		System.out.println("raja ki static class");
	}

	void m4()
	{
		System.out.println("raja ki non static method");
	}

	//we can have staic inner class
	static class Test{ 
		System.out.println("Static inner class");	
	}	

	public static void main(String[] args) {
		//System.out.println(sv);
		//System.out.println(Raja.sv);
		//System.out.println(psv);//no
		//System.out.println(Prem.psv);


		// Raja r = new Raja();
		// System.out.println(r.v);//ok
		// System.out.println(r.sv);//ok

		//m1();//ok
	//	Raja.m1();//ok
		//m2();//no
		//Prem.m2();//ok
 	    // Prem p = new Prem();
 	    // p.m2();

		// Raja r1 = new Raja();
		// r1.m4();
		// Prem p1= new Prem();
		// p1.m3();

		set(44);

		
	}
}*/

/////////////////////////////////////////////////////




















// class Ob
// {
// 	public String toString()
// 	{
// 		return getClass()+"p@"+Integer.toHexString(hashCode());
// 	}

// 	Ob()
// 	{
// 		System.out.println("Ob constructor");
// 	}  
// }

// class Parent extends Ob
// {
// 	// void m()
// 	// {
// 	// 	System.out.println("me Parent ki method hu");
// 	// }
// 	Parent()
// 	{
// 		System.out.println("Parent constructor");
// 	}  


// 	public String toString()
// 	{
// 		return "me Parent ki method hu";
// 	}
// }

// class Child extends Parent
// {
// 	Child()
// 	{
// 		//super();
// 		System.out.println("Child constructor");
// 	}   
// 	// void m()
// 	// {
// 	// 	System.out.println("me Child ki method hu");
// 	// }
// 	public String toString()
// 	{
// 		return "me Child ki method hu";
// 	}
// }

// class Faltu
// {
// 	public static void main(String[] args) {
// 		Child c = new Child();
// 		//Child arr[] = new Child[5];
// 		// for (Object i : arr) {
// 		// 	System.out.println(i);
// 		// }
// 		// System.out.println(c);
// 		// Parent p = new Parent();
// 		// p.m();
// 	}
// }


//CONSTRUCTOR CHAING
// this() -> ye same class ke constructor ko represent krta h
// constructor ki staring me ya to this hoga ya to super(); (by default super()---with no argument)
// constructor cannot containg both super and this
//  this() and super() can be written in only first line
// this(5);// recursive constructor invocation
/*class P
{
	int x;
	P()
	{

		System.out.println("prent constructor");
	}
}

class C extends P
{
	C()
	{
		//this(5);// recursive constructor invocation
		System.out.println("child constructor");
	}

	C(int x)
	{
		this();       //<---------------------------<<<
		System.out.println(x);
	}
}

class Faltu
{
	public static void main(String[] args) {
		new C(11);
	}

}*/





//compiler khudse child class ke constructorse default super() ko call krdeta h 
//proble appears when in parent class you have made only parametersed constructor 
//now you have to call it by yourself


// Faltu.java:18: error: constructor P in class P cannot be applied to given types;
//         {
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length

/*class P
{
	int x;
	P(int i)
	{
		x = i;
		System.out.println("prent constructor");
	}
}

class C extends P
{
	C()
	{
		//super();  //compiler khudse yha default duper ko call krdeta h 
		super(222);  //constructor P in class P cannot be applied to given types ye error aayegi nahi to
		System.out.println("child constructor");
	}
}

class Faltu
{
	public static void main(String[] args) {
		new C();
	}

}*/


/*class Faltu
{
	public static void main(String[] args) {
		//int i=10;
		String s="4";
		Integer i=Integer.parseInt(s);
		System.out.println(i);
	}
}
*/