import java.util.Scanner;


//A
/*public class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if(i==1 || j==1 || j==n || i==n/2+1) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}*/


//B
/*class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if((i==1 || j==1 || i==n || j==n || i==n/2+1)&& !(i==n&&j==n) && !(i==1&&j==n) && !(i==n/2+1&&j==n)) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}

}*/
//G

 class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if((i==1 || j==1 || i==n  || (j==n&&j-i<n/2) || (j-i>=0&&i==n/2+1) || (i==n/2+2&&j==n/2+1))&& !(i==1&&j==1) && !(i==n&&j==1) && !(i==n&&j==n) ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}


//J

/*public class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if(i==1 || j==n/2+1 || (i==n&&j<=n/2+1)  || (j==1&&i>=n/2+2)) 
       	System.out.print("* ");  
       	else
       	System.out.print("  ");  
	}
	System.out.print("\n");
}


}
}*/

//k

/*class Pattern{
public static void main(String[] args) {
int n=15;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if(j==1 || i+j==n/2+2 || i-j==n/2) 
       	System.out.print("* ");  
       	else
       	System.out.print("  ");  
	}
	System.out.print("\n");
}


}
}*/



//M
/*public class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if(j==1 || j==n || (i==j&&i<=n/2+1) || (i+j==n+1&&i<=n/2+1) ) 
       	System.out.print("* ");  
       	else
       	System.out.print("  ");  
	}
	System.out.print("\n");
}


}
}
*/

//N
/*class Pattern{
public static void main(String[] args) {
int n=15;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if(j==1 || j==n || i==j) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}*/



//Q

/*class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( (i==1 || j==1 || i==n || j==n || i==j&&i>n/2+3) && !(i==1&&j==1) && !(j==n&&i==1) && !(j==1&&i==n) ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}

for (int i=1; i<=11; i++) {
	System.out.print(" ");
	
}
System.out.print("*");


}
}
*/

//R

/*class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( (j==1 || (i==1&&j<n/2+1) || (i==n/2+1&&j<n/2+1) || (j==n/2+1&&i<n/2+1) || i-j==n/2) && !(i==1&&j==n/2+1)) 
       	System.out.print("* ");  
       	else
       	System.out.print("  ");  
	}
	System.out.print("\n");
}


}
}*/


//S

/*class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( (i==1 || i==n || i==n/2+1 || (j==1&&i<n/2+1) || (j==n&&i>n/2+1)) && !(i==1&&j==1) && !(j==1&&i==n/2+1) && !(j==n&&i==n/2+1) && !(i==n&&j==n) ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}

}
}*/

//v
/*class Pattern{
public static void main(String[] args) {
int n=19;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n*2; j++)
	{
       	if( i==j || i+j==n+n) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}

}
}*/

/*public class Pattern{
public static void main(String[] args) {
int n=11;
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
       	if( (i+j>n/2 && j-i<n/2+1 && (i+j<(n*3)/2+2) && i-j<n/2+1 ) || i==j&&i>n/2 ) 
       	System.out.print("*");  
       	else
       	System.out.print(" ");  
	}
	System.out.print("\n");
}


}
}*/

//swastik

//import java.util.Scanner

/*class Swastik
{

public static void main(String[] args)
 {
	//Scanner sc = new Scanner();
	int n = 11;
	for (int i=1; i<=n;i++ )
	{
		for (int j=1; j<=n; j++)
		{
			if(j==n/2+1 || i==n/2+1 || (i==1&&j>n/2+1) ||  (i==n&&j<n/2+1)  || (j==1&&i<n/2+1) || (j==n&&i>n/2+1) )
		    System.out.print(" *");
		    else 
		    System.out.print("  ");			
		}
	  System.out.print("\n"); 
		
	}
}*/



/*class Swastik
{

public static void main(String[] args)
 {
	//Scanner sc = new Scanner();
	int n = 7;
	for (int i=1; i<=n;i++ )
	{
		for (int j=1; j<=n; j++)
		{
			if(i+j==n+1)
		    System.out.print(" *");
		    else 
		    System.out.print("  ");			
		}
	  System.out.print("\n"); 
		
	}
}

}*/

/*
class PascalTriangle
{

public static void main(String[] args)
 {
	//Scanner sc = new Scanner();
	int n = 5;
	
	for (int i=1; i<=n;i++ )
	{
		int p=1;
		for (int j=1; j<=n; j++)
		{

		if(i-j==0)
		System.out.print("1");		
		else if(i-j>0)	
		System.out.print(p++);	

		else
		System.out.print(" ");
		}
	  System.out.print("\n"); 
		
	}
}

}*/