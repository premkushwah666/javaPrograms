
//Write a function that takes in age as input and returns 
//if that person is eligible to vote or not. A person of age > 18 is eligible to vote
import java.util.Scanner;

class Cprogram{
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // System.out.println("enter a number");
       // int printInt = sc.nextInt();
       // sc.nextLine();//***it hold last enter and it is usually in int and float like and it is to remove it.
       System.out.println("enter a String");
       String st = sc.nextLine();

       // System.out.println("enter a word");
       // String str = sc.next(); 

       

       // System.out.println("number "+printInt);
       // System.out.println("word "+str);
       // System.out.println("string : " +st);
  
       // System.out.println("raja  is my friend");
        System.out.println(st.substring(0,5));

      }      

}



//**************************************
//Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.Scanner;

// class Cprogram
// {
 
// public static int oddSum(int n){

// int sum = 0;
//    for(int i=1; i<=n; i=i+2){
//    sum=sum+i;   
//    }
//   return sum;
// }

// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in); 
// int n = sc.nextInt();
// System.out.println( oddSum(n) );
// }

// }


//**************************************
//program for average of two numbers
// import java.util.Scanner;

// class Cprogram
// {
// // c program for Uppercase and lowercase
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);



// int a = sc.nextInt();


// int b = sc.nextInt();

// int c = sc.nextInt();

// int average = (a+b+c)/3;

// System.out.println("average is "+average);
// }

// }

//************************************






//********************************************
/*public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  String s = "hello this is test";
  //int a = ;
  System.out.println(s.substring(0,s.length()) );//  **<--there aree three )))** 

}*/

 //******************************************** 
//Addition with scan and cocatination
/*public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
 System.out.println(a+"+"+b+"="+(a+b));
}*/
//**********************************************
  //java program for prime number
	/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     
   boolean f=true;  
   System.out.println("enter number");	
   int n = sc.nextInt(); 

     for (int i=2; i<=n/2; i++) {
      if(n%i==0){
        f=false;
        System.out.println("not prime");
        break;
      }
     }
      
     	if(f==true)
      {
     		System.out.println(n+"is a prime number");		
     	}
      else
      {
        System.out.println(n+"is not prime number");
      }

	}*/
//}