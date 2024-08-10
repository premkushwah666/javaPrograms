 import java.util.Scanner;

//Hello world....
class Hello
{
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}


//two greatestt...
class GreaterOfTwouyr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	    if (n1>n2) {
	    	System.out.println(n1+"is greater");
	    }
	    else
	    {
	    	System.out.println(n2+"is greater");
	    }

	}
}



//three Greaterrr..
class GreaterOfThree
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
	    if (n1>=n2 && n1>=n3) {
	    	System.out.println(n1+"is greater");
	    }
	    else if(n2>=n1 && n2>=n3)
	    {
	    	System.out.println(n2+"is greater");
	    }
	    else
	    {
	    	System.out.println(n3+"is greater");
	    }

	}
}


//print table.......
class TableOfTwo
  {
 	public static void main(String[] args) {
 		int n=5,s=1;
 		for(int i=1;i<=10;i++)
		{
			s=n*i;
			System.out.println(s);
	    }
	}
}


//Ascaiiii codee....
class Asciii
{
	public static void main(String[] args) {
		for (int i=1; i<=122; i++) {
			System.out.printf("%d is %c\n",i,i);
		}
	}
}


//print table in a rangee......
class Table
{
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=20; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
}


//countdigit ..............

class countDigit
{
	public static void main(String[] args) {
		int i,n=153,c=0;
		while(n!=0){
			c++;
			n=n/10;
		}
			System.out.println(c);
	}
}


//printName........
class PrintName
{
	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++){	
		System.out.println("jayaa");
	  }
	}
} 



//even numberrr........
class EvenNumber
{
	public static void main(String[] args) {
		int n=10,i;
		for(i=2;i<=n;i++)
		{
			if(i%2==0)
		System.out.println(i+ "is aeven number");
        }
	}
}



//odd numberrr
class OddNumber
 {
 	public static void main(String[] args) {
		int n=10,i;
 		for(i=2;i<=n;i++)
 		{
			if(i%2!=0)
 		System.out.println(i+ "is a odd number");
         }
 	}
 }


//prime numberr..........
class Prime
{
	public static void main(String[] args) {
            for(int i=1;i<=50;i++)
            {
            	if(isPrime(i))
         System.out.print(i+ " ");
         }
	} 
	static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
		{
     		if(n%i==0)
				return false;
		}
		return true;
	}
}


class OPSIRCLASS
{
	public static void main(String[] args) {
		String s="hello";  //new string object
		System.out.println(s.toString());
		char ch[] = s.toCharArray();  //convert string to charcter array
		ch[1]='a';    //replace e to a
		s=new String(ch);   //convert char to string               //return object made
		System.out.println(s.toString());
	}
}



//pigpogggg
class Pk
{
	public static void main(String[] args) {
		String s="hello this is test";

		char ch[] = s.toCharArray();
		System.out.println(ch.length);

		 System.out.println(s.length());  //to find length of string
		System.out.println(s.substring(6,s.length()));
		System.out.println(s.substring(6));
		s = s.toUpperCase();
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println(s.toLowerCase());

		System.out.println(s.indexOf('t'));
		System.out.println(s.lastIndexOf('t'));
	}
}


class PKK
 {
 	public static void main(String[] args) {
 		String s="jayakushwah@gmail.com";
 		// String sr[]=s.split(" ");
 		String[] a=s.split("@");

 		for (String i : a) {
 			System.out.println(i);
 		}

 		String s1 = "prem kushwah";
 		String[] a1= s1.split(" ");
 		for(int i=0; i<a1.length; i++)
 		{
 			System.out.println(a1[i]);
 		}

    }
}


//*@by pk
class PKKK
{
	public static void main(String[] args) {
		String s = "prem kushwah";
		System.out.println(s.codePointAt(10));//ascii code  of a = 97
		System.out.println(s.codePointBefore(11));//ascii code  of a = 97

		//int codePointCount(int, int);
		//System.out.println(s.codePointCount(2,5));//dont know
		System.out.println(s.replace('e','x'));
		//System.out.println(s.indexOf('p','e'));
	}
}


//Average of numbeerr
class Average
{
	public static void main(String[] args) {
		int a=2,b=3,c=3,d=2,e=2;
		int sum=a+b+c+d+e;
		int avg=sum/5;
		{
			System.out.println(avg);
		}
	}
}


//sum of n number
class Nnum
{
	public static void main(String[] args) {
		int s=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println(s);
	}
}



//print Factorial
class Factor
{
	public static void main(String[] args) {
		int n=5,s=1;
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.println(s);
	}
}


//Strong number
class Strong
{
	public static void main(String[] args) {
		int n=145,r=0,s=0,t;
		t=n;
		while(n!=0)
		{
			r=n%10;
			s=s+fact(r);
			n=n/10;
		}
		if(t==s)
			System.out.println(s+"is a strong number");
		else
			System.out.println(s+"is not strong number");
	}
	static int fact(int n)
	 {
	 	int s=1;
	 	for(int i=1;i<=n;i++)
	 	{
	 		s=s*i;
	 	}
	 	return s;
	 }
}


//reverse a number....
class ReverseNumber
{
	public static void main(String[] args) {
		int n=1234,rev;
		rev=rev(n);
		System.out.println(rev);
	}
	static int rev(int n)
	 {
	    int s=0,r=0;
	    while(n!=0)
	    {
	    r=n%10;
        s=s*10+r;
        n=n/10;
        }
        return s;
	 }
}


//pollindrammm...........
class pollin
{
	public static void main(String[] args) {
		int n=1221,rev;
		pollin p = new pollin();

		rev=p.rev(n);
		System.out.println(rev);
		if(rev==n)
		System.out.println(rev+"is a pallindram");	
        else
        System.out.println(rev+"is not a pallindram");		
	}
	 int rev(int n)
	 {
	    int s=0,r=0;
	    while(n!=0)
	    {
	    r=n%10;
        s=s*10+r;
        n=n/10;
        }
        return s;
	 }
}


//perfect numberrr....
class Perfect
{
	public static void main(String[] args) {
		int n=2,s=0;
		if(isPerfect(n))
			System.out.println(n+"is a Perfect Number");	
		else
			System.out.println(n+"is not a Perfect Number");
	}

	static boolean isPerfect(int n)
	{    
	     int s=0;
		for (int i=1; i<=n/2; i++) {
			if (n%i==0) {
				s=s+i;	
			}
		}
		if (s==n) {
			return true;
		}
	return false;       
	}		

}


//Fibonsi series in termsss....
class Fibonsi
{
	public static void main(String[] args) {
		febonsi(20);
	}

	static void febonsi(int n){	
	int n1=0,n2=1,next;	
	while(n--!=0)
	{
		System.out.println(n1);
	    next = n1+n2;
		n1 = n2;
		n2 =next;
    }
}
}


//sum of digit of number.....
class sumOfNum
{
	public static void main(String[] args) {
		int n=1234,r=0,s=0;
		while(n!=0)
		{
			r=n%10;	
			s=s+r;
			n=n/10;
		}
		System.out.println(s);
	}
}


//Generic root..
class Generic
{
	public static void main(String[] args) {
		int n=1235,s=0,r=0;
		s=Generic(n);
		System.out.println(s);
	}
	static int Generic(int n){
	    int s=0,r=0;
	 while(true)
	{
       // while(n!=0)
       {
       	r=n%10;
       	s=s+r;
       	n=n/10;
       } 
       if(s<=9)
       	return s;
      else {
       	n=s;
       	s=0;
       	//s=Generic(n);
       }
      // return s;
	}
 }
 }


//Maximum number.....
class Maximum
{
   public static void main(String[] args) {
   	int a[]={3,4,2,7,9,2,1,5,6};
    int max=a[0];
    for (int i=0; i<a.length; i++) {
       		if (a[i]>max)
       		max=a[i];
       	}   	
System.out.println(max);

   }
}


//Minimum numberr....
class Minimum
{
   public static void main(String[] args) {
   	int a[]={3,4,2,7,9,2,1,5,6};
    int mini=a[0];
    for (int i=0; i<a.length; i++) {
       		if (a[i]<mini)
       		mini=a[i];
       	}   	
System.out.println(mini);

   }
}



//Second Maimum Number....
class Smax
{
	public static void main(String[] args) {
		int a[]={2,4,6,79,9,912,56};
		int max=a[0],smax=a[1];
		//a[0]>a[1]?(max=a[0],smax=a[1]):(max=a[1],smax=a[0]);
		if(a[0]>a[1]){
			max=a[0];
			smax=a[1];	
		}	
		else{
			max=a[1];
			smax=a[0];
		}
		for (int i=2; i<a.length;i++ ) {
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else if(a[i]<max && a[i]>smax){
				smax=a[i];
			}
		}
		System.out.println(max+" "+smax);
	}
}



//Second MINIII.......
class Smini
{
	public static void main(String[] args) {
		int a[]={2,4,6,79,9,912,56};
		int mini=a[0],smini=a[1];
		//a[0]>a[1]?(mini=a[0],smini=a[1]):(mini=a[1],smini=a[0]);
		if(a[0]>a[1]){
			mini=a[0];
			smini=a[1];	
		}	
		else{
			mini=a[1];
			smini=a[0];
		}
		for (int i=2; i<a.length;i++ ) {
			if(a[i]<mini){
				smini=mini;
				mini=a[i];
			}
			else if(a[i]>mini && a[i]<smini){
				smini=a[i];
			}
		}
		System.out.println(mini+" "+smini);
	}
}


//print arrayy.........
class printArray
{
	public static void main(String[] args) {
		int a[]={2,4,35,54,32,23};
		for (int i=0; i<=a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}


//DeleteArray of number.....
class deletArray
{
	public static void main(String[] args) {
		int a[]={1,34,7,87,43,76,98};
		int size=a.length;
		int del=2;
		    for (int i=del; i<size-1; i++) 
			{
				a[i]=a[i+1];
			}

			size--;
			for (int i=0; i<size; i++)
			{
				System.out.println(a[i]);			
	     	} 
	}
}
//closing of deletete array class



//Find position of Arrsyy...
class FindArray
{
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int c = 45 ,i;
		for (i=0; i<a.length; i++) {
			if (a[i]==c) {
				System.out.println(a[i]+" is found at " + i +"th index");
				break;
			}
		}
		if (i==a.length) {
			System.out.println("not found ");
		}
	}
}


//Replace a digit in arrayy.....
class Replace
{
	public static void main(String[] args) {
		int[]a={23,3,55,234,2324,252,255};
		int c=55,r=33,i;
		for (i=0; i<a.length; i++) {
			if (a[i]==c) {
				a[i]=r;
			}
			System.out.print(a[i]+" ");
		}
	}
}





//If & ELSE..........
class Task
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your age:");
		if(sc.nextInt()>=18)
		System.out.println("uhh are eligible to take ATM card");
		else
		System.out.println("Sorry uhh are not eligible to take ATM card");
	}
}


//Test .jaavvava..
class Test
{
	public static void main(String[] args) {
		String s="jayaaaa";
		System.out.println(s.charAt(5));
	}
}


//String Smalll to Uppercaseee........
class Uppercase
{
	public static void main(String[] args) 
	{
		String s=" hyy this is jaya kushwah";
		char[] temp=s.toCharArray();
		
		for (int i=0; i<temp.length; i++)
		 {
			if (temp[i]>=97 && temp[i]<=122)
			 temp[i]=(char)(temp[i] - 32);
			else if (temp[i]>=65 && temp[i]<=90) 
			{
			temp[i]=(char)(temp[i] + 32);
		    }
		 }
		s = String.valueOf(temp);
		// s = new String(temp);
		System.out.println(s);
	}
}


//print name by string........
class Print
{
	public static void main(String[] args) {
		String s = "jaya kushwah";
         //char ch[] = s.toCharArray();
        for (int i=0; i<s.length(); i++) {
        	System.out.print(s.charAt(i));
        }
	}
}


//String reverseee.......
class Strrev
{
	public static void main(String[] args) {
		String s = "jaya kushwah";
	System.out.println(rev(s));	
	}


	static String rev(String s){
        char[] ch = s.toCharArray();
        char temp;
        int f=0,l=ch.length-1;
        while(f<l)
        {
        	temp=ch[f];
        	ch[f]=ch[l];
        	ch[l]=temp;
        	f++;
        	l--;
        }
        return new String(ch);
	}
}


//REverse string 
class deletString
{
	public static void main(String[] args) {
		 String s="jaya kushwah";
		char[] ch=s.toCharArray();
		int size=s.length();
		int del=3;
		    for (int i=del; i<size-1; i++) 
			{
				ch[i]=ch[i+1];
			}

			size--;
			for (int i=0; i<size; i++)
			{
				System.out.print(ch[i]);			
	     	} 
	     System.out.print(s);
	}
}


//Armstrong numberrr....
class Armstrong
{
    static int countDigit(int n)
    {
    	int c = 0;
    	while(n!=0)
    	{
    		n/=10;
    		c++;
    	}
    	return c;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int t = n;
		int s = 0;
		int c = countDigit(n);
		while(n!=0)
		{
			s = s+(int)Math.pow(n%10,c);
			n/=10;
		}
		if(t==s)
			System.out.println(t+" is Armstrong number");
		else
			System.out.println(t+ " is not Armstrong number");
	}
}


//Right Angle TRIngleee............
class RightAngle
{
	public static void main(String[] args)
	 {
	    System.out.println("enter a number:");	
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    for (int i=1; i<=n; i++)
	     {
	    	for (int j=1;j<=i;j++ )
	    	 {
             System.out.print("*" + " ");
	    	 }
	    	System.out.println();
	    }
	}
}

//Alphabateee
class Alphabate
{
	public static void main(String[] args)
	 {
	    System.out.println("enter a number:");	
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    for (int i=1; i<=n; i++)
	     {
	    	for (int j=1;j<=i;j++ )
	    	 {
             System.out.printf("%c",i+64);
	    	 }
	    	System.out.println();
	    }
	}
}


//Reverse First and Last Digit Of Number.......
class FirAndLasDig
{    

	public static void main(String[] args) {
		int n=1234,rev,s=0,r=0;
	 System.out.println(n);
		rev=revint(n);
     System.out.println(rev);
       while(n!=0)
       {
       	if(s==0 || n<10)
       		r=n%10;
       	else
       		r=rev%10;

       	    n=n/10;
            rev=rev/10;

            s=s*10+r;
       }
       System.out.println(s);
	}
	static int revint(int n)
	{
	int r=0,s=0;
	{
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		return s;
	}
}  
}


//Discount shopping.........
class Discount
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int cart = sc.nextInt();

		if (cart<=500) 
		cart=cart-(cart*5/100);
		else if (cart>=500 || cart<=1000)
		cart=cart-(cart*10/100);
		else 
		cart=cart-(cart*15/100);
		{
		System.out.println("your  TOtal amount is :"+cart);	
		}	
	}
}



//Errrorrr
class Vowel
{
	public static void main(String[] args) {
		String s= "abcdefghijklmnopqrstuvwxyz";
		String v = "aeiouAEIOU";
		//char[] j = s.toCharArray();
	
		for (int i=0; i<s.length(); i++) {
			if((v.indexOf( s.charAt(i)))!=-1)
				System.out.print(s.charAt(i)+" ");
		}
		System.out.println("are vowels in string "+ s);

	//	System.out.println(j);
	}

	static boolean checkVowel(char ch)
	{
		String s = "aeiouAEIOU";
		//if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	if(s.indexOf(ch)!=-1)
	return true;
	else
	return false;
	}

}


class Code
{
	public static void main(String[] args) {
		String s = "hello";
        char[] ch=s.toCharArray();
	    int size=s.length;
	    for ( int i=0; i<size; i++){
		ch[i]=(char)(ch[i]+2);
    }
    for (int a=0; a<size; a++) {
    	System.out.println(ch[a]+" ");
    }
    }
}


