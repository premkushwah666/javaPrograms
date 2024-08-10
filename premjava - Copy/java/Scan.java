import java.util.Scanner;

public class Scan{

public static void main(String[] args) {
	System.out.println("taking input from the user");
	Scanner sc = new Scanner(System.in);         //making object of Scanner class

//use of nextInt();
/*	System.out.println("enter 1 number");
	int a = sc.nextInt();
	System.out.println("enter 2 number");
	int b = sc.nextInt();

	 b=a+b;
	System.out.println("the sum is "+b);
*/

// Use of nextFloat();
/*	
	System.out.println("enter a float number");
	float f1,f2;
	f1=sc.nextFloat();
    f2=sc.nextFloat();
    System.out.println("sum of f1 and f2 is "+(f1+f2) );
*/

// to Check the number is even or odd

/*   System.out.println("enter a num is This number");
   boolean b1=sc.hasNextInt();
   if(b1)
   System.out.println("it is a number");
   else
   System.out.println("it is not a number");
*/

// sc.next(); -->takes word as input
// sc.nextLine(); --> takes a sentense or sting as input;


/*System.out.println("enter a string");
String str1=sc.nextLine();
System.out.println(str1);

System.out.println("enter a string");
String str= sc.next();
System.out.println(str);//remaing string will be buffer here
*/

//here string buffer will occur thats why pring blank




}

} 

