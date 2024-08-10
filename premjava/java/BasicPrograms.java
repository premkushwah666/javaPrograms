import java.util.Scanner;

public class BasicPrograms
{

        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    JavaBasicPrograms ob = new JavaBasicPrograms();
 
 		System.out.println("enter choice");
 		System.out.println("1 fibonachi by terms");
 		System.out.println("2 fibonachi by value");
 		System.out.println("3 is a prime number");
 		System.out.println("4 is number palindrome");
        System.out.println("5 factorial");
        System.out.println("6 random number gernator");
        System.out.println("7 print ASCII(american standard code for information exchange) value");
        System.out.println("8 is strong numbr");
        System.out.println("9 reverse string");
        
        int choice = sc.nextInt();

        switch(choice)
        {
        	case 1:
	    	System.out.println("enter no of terms");
	    	int terms = sc.nextInt();
	     	ob.fibonachi(terms);
            break;

            case 2:
            System.out.println("enter number");
	     	ob.fibonachi(sc.nextLong());
	     	break;
           
            case 3: 
            System.out.println("enter a number");
            if(ob.isPrime(sc.nextInt()))
           	System.out.println("prime");
            else
            System.out.println("not prime");         
        	break;

            case 4:
            System.out.println("enter number");
            if(ob.isPalindrome(sc.nextInt()))
            System.out.println("palindrome");
            else
            System.out.println("not palindrome");   
            break; 

            case 5:
            System.out.println("enter number");
            System.out.println(ob.factorial(sc.nextInt()));
            break;

            case 6:
            System.out.println("how many numbers you want to generate");
            for(int i=sc.nextInt();  i>=1; i--)
            {
                System.out.println(ob.generateRandomInt());  
            }
            break;

            case 7:
            ob.getAsciiValue();
            break;

            case 8:
            System.out.println("enter Strong number");

            if(ob.isStrongNumber(sc.nextInt()))
            System.out.println("yes it is strong number");  
            else
            System.out.println("not strong number");
            
            break;

            case 9:
            System.out.println("Enter String");
            sc.nextLine();
            System.out.println(ob.reverse(sc.nextLine()));  


        
	    }

    }
}    