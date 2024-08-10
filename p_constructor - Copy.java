//18

class Test{
	public static void main(String[] args) {
		
	}
}

interface papa{
	
}



//17 may 23 baiya satsang so i left coatching early
// 16 may 23
//super
// if we have to call the funtion in parent class of same name and all se we have to use super keyword

//according to me ager koi method parent me pahle se define h to use super se call kro
// phir se define krne ki jarurak nhi 
// parent ke fun ko use krne k liye ham duper ka use krte h 

/*class Super
{
	public static void main(String[] args) {
		Child c = new Child();
		c.givemoney();
	}


}

class Parent{
	public void givemoney()
	{
		System.out.println("parent => take money");
	}
}

class Child extends Parent{
	public void givemoney(){
		super.givemoney();     //agar ham dono line chala dege to dono hi print ho jayege
		//System.out.println("child => take money");
	}
}*/









//******************************************************************************************
//*******************************************************************************************

//16 may 23
//this
/*
class Test{
	public static void main(String[] args) {
		System.out.println("main");
		Temp t = new Temp(20);
		System.out.println(t.a);
	}
}

class Temp{
	int a;
	Temp(int am){
		a=am;
	}
}

*/

// 16 may 23
//constructor
//*****************************************************************
//*if we make any other constructor(ex  parametrised constructur) compiler will not make any constructor
// in those class and  we have to make one non parameterised constructor

/*p_constructor.java:31: error: constructor Prem in class Prem cannot be applied to given types;
                 new Prem();
                 ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error*/

/*class Prem{


   Prem(int x)
   {
   	   int var = x;
   	   System.out.println("prem const");
   }

   {
       System.out.println("non static block");
   }

   static
   {
       System.out.println("static block");
   }

}
 
class Test{

	public static void main(String[] args) {
		 new Prem(10);
		 new Prem();//we have not make any non-parameterised constructor 
	}
}*/

//********remove error

/*class Prem{


   Prem(int x)
   {
   	   int var = x;
   	   System.out.println("prem argument const");
   }
   Prem()//it will remove error
   {
   	   System.out.println("prem no argument const");
   }

   {
       System.out.println("non static block");
   }

   static
   {
       System.out.println("static block");
   }

}
 
class Test{

	public static void main(String[] args) {
		 new Prem(10);
		 new Prem();//we have not make any non-parameterised constructor //to remove error
	}
}*/

//**********************************************************************************
// non static block
// constructor
// static block
// non static block
// constructor

/*public class p_constructor{

    p_constructor(){
    	System.out.println("constructor");//4
    }

    {
    	System.out.println("non static block");//3//7
    }

    static {//1
    	new p_constructor();//2
    	System.out.println("static block");//5
    }

	public static void main(String[] args) {
		 new p_constructor();//6
	}
}*/