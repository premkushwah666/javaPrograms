public class Matrix
{
    
    static void m1(int n)
    { 
    	if(n%2==0)n++;

       for (int i=1; i<=n; i++)
       {

       	  for (int j=1; j<=n*2; j++)
       	  {
       	  	if(i-j<=0 && i+j<=n*2)
       	  		System.out.print("*");
       	  	else
       	  		System.out.print(" ");
       	  }
      	  System.out.println();
       }	
    }

	public static void main(String[] args) {
		
	    int n=11;
        m1(n);
	}
}