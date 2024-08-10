import java.util.*;
import java.lang.*;
import java.io.*;
class Systum//***************************our systum class
{
  static PrintStream out = new PrintStream(System.out);
}


class T
{
  public static void main(String[] args) {
    String s = "prem ka System";
    Systum.out.println(s);//************************************************
    // System.out.println("Prem");
    // short s = 256;
    // System.out.println(String.valueOf(4392.243)+45);
    // Integer x = 33;
    // System.out.println(Integer.toString(42));
  }
}

class Test
{
	int jaya;
	int prem;
	int raja;

	Test(int p,int j,int r)
	{
		jaya=j;
		prem=p;
		raja=r;
	}

	Test()
	{
		jaya=0;
		prem=0;
		raja=0;
	}



	public static void main(String[] args) {

		Test ob1 = new Test(10,9,9);
		Test ob2 = new Test();


		System.out.println(ob2.jaya);
		System.out.println(ob2.prem);
		System.out.println(ob2.raja);

		System.out.println(ob1.jaya);
		System.out.println(ob1.prem);
		System.out.println(ob1.raja);

	}
}




/*class Test{

public static void main(String[] args) {
	int arr1[] = {0,1,2,3,4,5,6,7,8,9};
	int arr2[] = Arrays.copyOf(arr1,arr1.length);         //0 1 2 3 4 5 6 7 8 9
	int arr3[] = Arrays.copyOfRange(arr1,0,arr1.length);  //0 1 2 3 4 5 6 7 8 9
	int arr4[] = Arrays.copyOfRange(arr1,0,1);            //0

	for (int i : arr2) {
		System.out.print(i+" ");
	}
	System.out.println();
	for (int i : arr3) {
		System.out.print(i+" ");
	}
	System.out.println();
	for (int i : arr4) {
		System.out.print(i+" ");
	}


}
}*/


/*class StaticInitializationBlock{
   static{
      System.out.println("class without a main method");
     // System.exit(0);
   }
}*/

// import java.util.ArrayList;

// class Test extends T
// {
// 	public static void main(String[] args) {
// 		T t = new T();
// 		// ArrayList/*<String>*/ al = new ArrayList<String>();
// 		// al.add("prem");
// 		// al.add(20);

// 	}
// }

// class T<X>
// {

// //////




//int int constructor will run because 4 time promeotion vs 6 time promotion
/*public class Test   
{  
    Test(int a, int b)  
    {  
        System.out.println(" int  a = "+a+" b = "+b);  
    }  
    Test(int a, float b)  
    {  
        System.out.println(" float a = "+a+" b = "+b);  
    }  

    public static void main (String args[])  
    {  
        byte a = 10;   
        byte b = 15;  
        Test test = new Test(a,b);  
    }  
} */

/*import java.util.*;
import java.io.*;
import java.util.Scanner;

class Test{

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

   fileInputStream fos = new fileInputStream("std.obj");
   ObjectImputStream is = new ObjectImputStream(fos);

   


}
}*/

//1 june 23

/*import java.util.Scanner;
class Test{

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.format("%-15s", s1);
            if(x<10){
             System.out.print("00"+x + "\n");
        } 
        else if(x>=10 && x<=99){
        System.out.print("0"+x + "\n");
        }
        else{
            System.out.print(x + "\n");
        }

}       

System.out.println("================================");


}
}*/


//**********************************************************************************************************

// 26 may 23
/*import java.util.Scanner;

class p
{
	private int prem =10;

    public void setter(int n){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter");
    	int x=sc.nextInt();
    	if(x==2003)
    	this.prem=n;
        else
        return;
    }

    public int getter(){
    	return this.prem;
    }
}

class Test
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		p ob = new p();
		ob.setter(50);
		System.out.println(ob.getter());
		// ob.prem =20;
		// System.out.println(ob.prem);
	}	

}*/






//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//18 may 23;
//OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

//**********************************************************************************************************


// COMPILATION AND EXECUTION BASED ON REFERNCE VARIABLE AND OBJECT

/**** compiler compiles code on the basis of reference variabe
*** jvm reuns code on the basis of object
*** in the case of variable COMPILATION and EXECUTION base on reference variable*/

//left hand side should be parent class
   			/*Test t = new P();
Test.java:28: error: incompatible types: P cannot be converted to Test
                        Test t = new P();
                                 ^  */


   	    // refernce variable is of p class and object is of Test class
   	    /*P t = new Test();
   		t.m1();
   		t.m2();
   		((Test)t).m3();*/
        // (test)t.m3(); <-- error: not a statement 
        // m3 ko call gai usne void return kiya then usko object me typecast aasa kuch ni hota

   		//t.m3();
   /*Test.java:32: error: cannot find symbol
                t.m3();
                 ^
  symbol:   method m3()
  location: variable t of type P*/




        // reference variable and object both of P class
        // Test t = new P();
   		// t.m1();
   		// t.m2();
   		// t.m3();
   		/*error: incompatible types: P cannot be converted to Test
            Test t = new P();
                     ^*/


        // reference variable and object both of Test class
   		// Test t = new Test();
   		// t.m1();
   		// t.m2();
   		// t.m3()
		//output   	   
   	    // Test : m1
        //    P : m2
        // Test : m3


/*class P{
	public int var =10;
	public void m1(){
		System.out.println("P : m1");
	}
	public void m2(){
		System.out.println("P : m2");
	}
}

public class Test extends P{

    public int var =20;  

	public void m1()
   	{
   		System.out.println("Test : m1");
   	}
   	public void m3()
   	{
   		System.out.println("Test : m3");
   	}

   public static void main(String[] args) {

   		P t = new Test();
   		System.out.println(t.var);

   }
}
*/








//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//13 may 23
//OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

//**********************************************************************************************************


/*public class Test{
	public static void main(String[] args) {
	  //int a[] = new int[5];
      int x=5;
      int a[] = new int[x];


 	 // a[0] = 12;
 	 // a[1] = 13;
 	 // a[2] = 14;
 	 // a[3] = 123;
 	 // a[4] = 1221;
		//int []a = {1,343,4,3};
    // System.out.println(a);  // it will [I@2c7b84de] as not override toSting method

    for (int i=0; i<a.length; i++) {
    	System.out.println(a[i]);
    }
 	
 }
}*/

/*public class Test{
	public static void main(String[] args) {
	 
      int a[][] = new int[2][3];
       a[0] = new int [5];
       a[1] = new int [3];


    for (int i=0; i<a[0].length; i++) {
    	System.out.println(a[0][i]);
    }
    for (int i=0; i<a[1].length; i++) {
    	System.out.println(a[1][i]);
    }
 	
 }
}
*/

/*public class Test{
	public static void main(String[] args) {
	 
 	Integer a = 155;
 	Integer b = 155;



 	int i = 150;
 	int j = 150;

 	int x= 127;
 	int y= 127;

 	System.out.println(a.equals(b));//true
 	System.out.println(a==b);//false

 	//System.out.println(i.equals(j));
 	System.out.println(i==j);//true primitive to value compere hoti h
 	
 	System.out.println("");
 	System.out.println(x==y);//true
 	//System.out.println(x.equals(y));//true premitive h
 

 }
}
*/

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//12 may 23
//OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

//**********************************************************************************************************

/*public class Test{
	public static void main(String[] args) {
		int a[][] = new int[2][3];

		for(int []i:a)
		{
			for(int j:i)
			{
				System.out.println(j);
			}
		}
	}
}
*/








//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//11 may 23
//OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

//**********************************************************************************************************


// how to make parent class
/*class P{
	 System.out.println("is pallindrom");
}

class C extends P{
	System.out.println("it is child class");
}


//import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
   
    P ob = new C();
    //ob.P();
   // ob.C();


}

}*/




//toString methlod overiding 

/*public class Test{
	int i=10;

	public String toString()
	{
		return i+"";
	}

	public static void main(String[] args) {
		Test ob;
		ob = new Test();
		System.out.println(ob);
	}
}*/



//to input charcter;
/*
import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char c = sc.next().charAt(0);
    System.out.println(c);
}


}*/











//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//10 may 23
//OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

//**********************************************************************************************************

/*
public class Test{
	public static void main(String[] args) {
		String s = "hello";
		char a[] = s.toCharArray();
		//for(int i=0; i<5; i++)
		//System.out.print(a[i]);
		
	System.out.println(S.charAt(1));	
	System.out.println();

	}
}

*/



//*************************************************************************************************************
//static variable can be refrence from static context
//non-static variable cannot be referenced from a static context***error 
//static and non-static varible both can be refrenced from non static context;

//CONCLUSION : STATIC SE NON STATIC KO ACCESS NAHI KAR SAKTE


/*
public class Test{
   int x=10;
   static int y=20;

   //this is not static area
   void fun(){
   System.out.println(x);
   System.out.println(y);
   }
   static void staticfun(){
   //System.out.println(x);//error	
   System.out.println(y);
   }

   // this is satic area
   public static void main(String[] args) {
   
   	Test ob = new Test();

   	ob.fun();
    staticfun();
  //System.out.println(x);
  // 	System.out.println(ob.x);
//System.out.println(y);
   }
}*/


//**********************************************************************************************************
//paindrom
/*import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();//sc.next is for word and sc.nextLine is for string

		boolean f = true;
		int i=0;
        int j = s1.length()-1;

		while(i<j){
         
         	if(s1.charAt(i)!=s1.charAt(j))
         	{
         		f=false;
         		break;
         	}
 		
		i++;j--;
		}

	    if(f)
	    System.out.println(s1+" is pallindrom");
	    else
	    System.out.println(s1+" is not pallindrom");


   	}
}
*/
//************************************************************************************************************
//palindrom string 
/*public class Test{
	public static void main(String[] args) {
		String s1 = "kanar";
		String s2 = "";
        boolean f = true;

		for(int i=s1.length()-1; i>=0; i--)
		s2 = s2 + s1.charAt(i);
   	
   	    for(int i=0; i<s1.length(); i++)
   	    {
  			if(s1.charAt(i)!=s2.charAt(i))
     		{
     			f=false;
     			break;
     		}
	    }
	    if(f)
	    System.out.println(s1+" is pallindrom");
	    else
	    System.out.println(s1+" is not pallindrom");


   	}
}*/


/*public class Test{

	public static void main(String[] args) {
       
		String s1 = "prem";
		String s2="";
		
		//for(int i=s1.length()-1;i>=0; i--)
		//s2 = s2 + s1.charAt(i);
    

		//int n=s1.length();  length of string 
        //s2 = s1.chatAt(1);error:char cannot be converted to String
		//s2 = s2 + s1.charAt(66);//runtime error : string index out of bound Exception
		System.out.println(s2);

	}
}*/



// public class Test{


// 	int fun(){
    
//  	 final  boolean b=true;

// 		while(b)
// 		System.out.println("pk");

// 		if(b)
// 		System.out.println("jk");	

// 		System.out.println("pk");

// 	return 0;	
// 	}

// 	public static void main(String[] args) {
//        Test obj = new Test();
//        obj.fun();
// 	}


// }


		//9 may 23

		// final boolean t;
		// t=true;
		// if(t)
		// System.out.println("prme");	