
class Basic
{
	public static void main(String[] args)
	{
		//Hello();
	   //Add(12,23);
	   //Sub(12,13);
	   //Multi(10,20);
	   //Average(2,2,3,4,5);
		//Nsum(10);
		//Even(2,20);
		//Odd(2,20);
		//greaterOfTwo(10,20);
        //greaterOfThree(10,20,30);
        /*int s=Fact(5);
        System.out.println(s);*/
        //Table(5);
        //Perfect(6);
        /*int rev=revDigit(1234);
     	System.out.println(rev);*/
     	/*int sum=sumOfDigit(1234);
     	System.out.println(sum);*/
     	//Strong(145);
     	//Pollin(1221);
     	/*int[] ar={2,3,4,5,8,6,54};
     	printArray(ar);*/
        /*int a[] = {1,2,5,3,4,5};
     	FirstRep(a);*/
        /*int a[] = {1,2,5,3,4,5,3,3};
     	LastRep(a);*/
     	//UpperClass("hello i am jayuuuu");
     	//LowerClass("HELLO I AM JAYUUU");
     	//addPlusTwoString( "hello"); 
     	// String rev = RevString("HELLOOO I AM JAYUUUUU");
     	// System.out.println(rev);
    }


/*static void Hello()
{
 

     System.out.println("HELLLOOO");
}


static void Add(int a,int b)
{
		int sum=a+b;
		System.out.println(sum);
}
	

 static void Sub(int a,int b)
 {
		int sum=a-b;
		System.out.println(sum);
 }


static void Multi(int a,int b)
 {
		int sum=a*b;
		System.out.println(sum);
 }


static void Average(int a,int b,int c,int d,int e)
 {
		int sum=a+b+c+d+e,avg=sum/5;
		System.out.println(avg);
 }


static void Nsum(int n) 
{
	int sum=0;
		for (int i=0; i<n; i++) {
		 sum=sum+i;
			System.out.println(sum);
		}
}


static void Even(int s,int e)
{
	for (int i=s; i<=e; i++)
	{
		if(i%2==0)
			System.out.println(i+" IS A EVEN NO.");
	}
}


static void Odd(int s,int e)
{
	for (int i=s; i<=e; i++)
	{
		if(i%2!=0)
			System.out.println(i+" IS A ODD NO.");
	}
}


static void greaterOfTwo(int a,int b)
{
	if (a>b) 
		System.out.println(a+" IS GREATER");
	else
		System.out.println(b+" IS GREATER");
}


static void greaterOfThree(int a,int b,int c)
{
	if (a>b && a>c) 
		System.out.println(a+" IS GREATER");
    else if(b>a && b>c)
    	System.out.println(b+" IS GREATER");
    else
    	System.out.println(c+" IS GREATER");
} 


static int Fact(int n)
{
	int s=1;
	for (int i=1; i<=n; i++) {
		s=s*i;	
    } 
    return s;
}


static void Table(int n)
{
	int t=0;
	for (int i=1;i<10 ;i++ ) {
		t=n*i;
		System.out.println(t);
	}
}


static void Perfect(int n)
{
	int  s=0;
	for (int i=1; i<=n/2; i++) {
		if (n%i==0){
			s=s+i;
		}
	}
		if (s==n)
		System.out.println(n+" IS A PERFECT NO.");
        else
        	System.out.println(n+" IS NOT PERFECT NO>");
}


static int revDigit(int n)
{
	int r=0,s=0;
	while(n!=0)
	{
		r = n%10;
		s = s*10+r;
        n = n/10;
	}
	return s;
}
      

static int sumOfDigit(int n)
{
	int r=0,s=0;
	while(n!=0)
	{
		r = n%10;
		s = s+r;
        n = n/10;
	}
	return s;
}


static void Strong(int n)
{
	int r=0,s=0,t=n;
	while(n!=0)
	{
		r = n%10;
		s = s+Fact(r);
        n = n/10;
	}
	if (t==s)
		System.out.println(s+" IS A STRONG NO.");
    else
    	System.out.println(s+" IS NOT STRONG NO.");
}


static void Pollin(int n)
{
	int r=0,rev=0,t=n;
	while(n!=0)
	{
		r = n%10;
		rev = rev*10+r;
        n = n/10;
	}
	if(t==rev)
		System.out.println(rev+" IS A PALLINDROM");
	else 
		System.out.println(rev+" IS NOT PALLINDROM");
}


static void printArray(int ar[])
{
	for (int i=0; i<ar.length;i++ ) {
		System.out.println(ar[i]);
	}
}



static void FirstRep(int a[])
{
	int i;
	L:
	for (i=0; i<a.length; i++)
	{
		for (int j=i+1; j<a.length; j++) 
		{
			if (a[i] == a[j])
			{
				break L;
			}
		}
	}
	if(i<a.length)
		System.out.println(a[i]+" IS A FIRST REPEATED NUMBER");
	else
		System.out.println("NOT REPEATED");
}



static void LastRep(int a[])
{
	int i;
	L:
	for (i=a.length; i>0; i--)
	{
		for (int j=i+1; j<a.length; j++) 
		{
			if (a[i] == a[j])
			{
				break L;
			}
		}
	}
	if(i<a.length)
		System.out.println(a[i]+" IS A LAST REPEATED NUMBER");
	else
		System.out.println("NOT REPEATED");
}




static void UpperClass(String s)
{
	for (int i=0; i<s.length(); i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z' )
			s = s.replace(s.charAt(i),(char)(s.charAt(i)-32));
	}
	System.out.println(s);
}


static void LowerClass(String s)
{
	for (int i=0; i<s.length(); i++) {
		if(s.charAt(i)>=65 && s.charAt(i)<=90 )
			s = s.replace(s.charAt(i),(char)(s.charAt(i)+32));
	}
	System.out.println(s);
}



static void addPlusTwoString(String s)
{
        int i;
        char[] ch=s.toCharArray();
	    int size=s.length();
	    for (i=0; i<size; i++)
	    {
			ch[i]=(char)(ch[i]+2);
        }
      
        for (int a=0; a<size; a++)
        {
    	System.out.println(ch[a]+"");
        }
}
*/


// static String RevString(String s)
// { 
// 	StringBuffer sf = new StringBuffer(s);
// 	sf.reverse();
//         return sf.toString();
//  }


 String reverse(String s)
    {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
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


	














