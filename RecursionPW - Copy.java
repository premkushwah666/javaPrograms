import java.util.Scanner;

class RecursionPW
{
	//number from 1 to n
	static void counting1toN(int n)
	{
		if(n<1)
		return;

	    counting1toN(n-1);
	    System.out.println(n);
	}

	static void counting1toNWithoutBacktracking(int x,int n)
	{
		if(x>n)
			return;
		System.out.println(x);
		counting1toNWithoutBacktracking(x+1,n);
	}
	
	static void countingNto1(int n)
	{
		if(n<1)
	    return;
	    System.out.println(n);
	    countingNto1(n-1);
	}

	static void countingNto1WithBacktracking(int x,int n)
	{
		if(x>n)
	    return;
	    countingNto1WithBacktracking(x+1,n);
	    System.out.println(x);
	}



	static void countingNtoN(int n1,int n2)
	{
		if(n1>n2)
		return;
		
		System.out.println(n1);
		countingNtoN(n1+1,n2);	
	}


	static int factorial(int n)
	{
		if(n<1)
			return 1;
		return n*factorial(n-1);
	}

	static int fibonachi(int n)
	{
		if(n<=0)
			return 0;
		else if(n==1)
			return 1;

		return fibonachi(n-1)+fibonachi(n-2);
	}

	static boolean isPrime(int n,int i)
	{
		if(i>n/2)
			return true;
		if (n%i==0)
			return false;
		else
			isPrime(n,i+1);
		return true;
	}

	static int pow(int p,int q)
	{
		if(q==0)
			return 1;

		return p*pow(p,q-1);
	}

	static int countDigit(int num,int count)
	{
		if(num==0)
		{
			return count;
		}

		return countDigit(num/10,count+1);
	}

   public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in);

   	    //counting1toN(10);
   		//countingNto1(10);
   	    //countingNtoN(11,22);//by me
   		//counting1toNWithoutBacktracking(1,10);//not recomended by me
   		//countingNto1WithBacktracking(1,10);//not recomended by me
   		// System.out.println(factorial(5));

		//fib by term or index   	
   	  	//System.out.println(fibonachi(7)); 
   		//by no of terms
   		// int terms = 7;
   		// for(int i =0; i<terms; i++)
   	    // System.out.println(fibonachi(i)); 

   		//boolean b = isPrime(13,2);//by me
   		//System.out.println();

   		int num = sc.nextInt();
   	    System.out.println(countDigit(num,0));	

   		// System.out.println("enter base");
   		// int p = sc.nextInt();
   		// System.out.println("enter power");
   		// int q = sc.nextInt();
   		// System.out.println(pow(p,q)); 

   }
}