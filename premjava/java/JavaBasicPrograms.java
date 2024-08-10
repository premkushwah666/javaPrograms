import java.lang.Math;

public class JavaBasicPrograms{


    public void fibonachi(int term)
    {
    	int x=0,y=1,z;
    	for(int i=0; i<term; i++) 
    	{
    		System.out.println((i+1)+" term is = "+x);
    		z=x+y;
    		x=y;
    		y=z;
 	    }

    }

    public void fibonachi(long num)
    {
    	int x=0,y=1,z;
    	while(x<num) 
    	{
    		System.out.println(x + " ");
    		z=x+y;
    		x=y;
    		y=z;
 	    }

    }

    public boolean isPrime(int n)
    {
    	if(n<2)
    	return false;

    	for(int i = 2; i<n/2; i++)
    	{
    		if(n%i==0)
    		return false;
    	}

     return true;
    }

    public boolean isPalindrome(int n)
    {
    	int r,s=0,t=n;
    	while(n!=0)
    	{
    		r = n%10;
    		s=s*10+r;
    		n/=10;
    	}

    	if(t==s)
        return true;
    	
    	else
        return false;
    }

    public long factorial(int n)
    {
    	long fact = 1;
    	while(n>=1)
    	{
    		fact=fact*n--;
    	}
    	return fact;
    }

    int  generateRandomInt()
    {
    	//double l = Math.random()*(10000-1000+1)+1000;
    	//return  (int)l;
    	//without bracket pale math typecase ho gaye or 0 ho jayega is liya alwas +1000;
    	//so 1000 hi aa ra tha 
    	//return (int)(Math.random()*1000); // not satisfied
    return (int)(Math.random()*(10000-1000+1)+1000);
    }


    void getAsciiValue()
    {
    	for(int i=0; i<=255; i++)
    	{
    		System.out.println("the Ascii value of "+(char)i+" is"+i);		
    	}
    }


    static long factForStrong(int n)
    {
       long factorial=1;
        while(n>0)
        {
            factorial=factorial*n;
            n--;
        }
        return factorial;
    }    
    public boolean isStrongNumber(int num)
    {
        double sum=0;
        int n=num;
        while(n>0)
        {
            sum = sum + factForStrong(n%10);
            n/=10;
        }
        if (sum==num) 
            return true;
        else
            return false;

    }	

     String reverse(String s)
    {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
           // arr[i] = (arr[i]+arr[j])-(arr[j]=arr[i]);
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        s = new String(arr);

        return s;
    }

}