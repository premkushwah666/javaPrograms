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
/*public class Pattern{
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

}
*/
//G

/*public class Pattern{
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
}*/


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
}
*/

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

//Q


/*public class Pattern{
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


}
}
*/

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





// ***** *****
// ****   ****
// ***     ***
// **       **
// *         *
/*class Pattern
{
	public static void main(String[] args) {
		int n=5;
		for (int i=n; i>=1; i--) {

			for(int j=1; j<=i; j++)System.out.print("*");
			for(int j=1; j<=2*(n-i)+1; j++)System.out.print(" ");
			for(int j=1; j<=i; j++)System.out.print("*");
			System.out.println();
		}
		

	}
}*/

// ***** *****
// ****   ****
// ***     ***
// **       **
// *         *
// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****

/*class Pattern
{
	public static void main(String[] args) {
		int n=5;
		for (int i=1; i<=n; i++) {

			for(int j=1; j<=n-i+1; j++)System.out.print("*");
			for(int j=1; j<=2*i-1; j++)System.out.print(" ");
			for(int j=1; j<=n-i+1; j++)System.out.print("*");
			System.out.println();
		}
		for (int i=n; i>=1; i--) {

			for(int j=1; j<=n-i+1; j++)System.out.print("*");
			for(int j=1; j<=2*i-1; j++)System.out.print(" ");
			for(int j=1; j<=n-i+1; j++)System.out.print("*");
			System.out.println();
		}

	}
}*/


//     *
//    * *
//   *   *
//  *     *
// * * * * *
/*class Pattern
{
	public static void main(String[] args) {
		int n=5;
		for (int i=1; i<=n; i++) {

			for(int j=1; j<=n-i; j++)System.out.print(" ");
			for(int k=1; k<=i; k++)
			{	
				if(k==1||k==i||i==n)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
    }
}*/

class Pattern
{
	static int x=1;
	public static void main(String[] args) {
		int n=4;
		int p=n*2;

		for (int i=1; i<=n*2; i++) {

			int l=1;
			for(int j=1; i<=n?j<=i:j<=p; j++)
			{	
				
				if(i<=n)
				{
					if(i<=n){
					System.out.print(x++);
				    if(j!=i)
					System.out.print("*");
					}
					
				}	
				else
				{		
					System.out.print(x-i+l);
					if(j!=p)
					System.out.print("*"); 
					l++;
				}
				
			}
			p--;	
			System.out.println();
		}
    }
}		
// else if(j==n+1)
				// {
				//     int p = n--;
				//  	System.out.print(x++-p);
				//  	System.out.print("*");
				// }