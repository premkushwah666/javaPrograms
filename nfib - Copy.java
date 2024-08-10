import java.util.Scanner;

class Main
{
    public static int fib(int n)
    {
        int i=0,j=1,t=0;
        if(n==0)return i;
        else if(n==1)return j;
        
        while(n-- > 1)
        {
            t = i+j;
            i = j;s
            j = t;
            
        }
        return t;
    }
    public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
   System.out.print( fib(sc.nextInt()) );
        
    }
}
