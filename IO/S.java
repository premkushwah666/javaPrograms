import java.io.*;
import java.util.*;

class Example
{
public static void main(String[] args)
 {
	String s1="Computer";
	String s2="Computer";
	String s3=new String("Computer");
    System.out.println("Result 1:"+(s1==s2));
    System.out.println("Result 2:"+s1.equals(s2));
    System.out.println("Result 3:"+(s1==s3));
    System.out.println("Result 4:"+s1.equals(s3));
 }
}


class Test
{
	public static void main(String[] args) {
		try{
			System.out.println(3/0);
			System.out.println("in try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
		System.out.println("HELLO");
	}
}



class Hashmap
{
	public static void main(String[] args)
	{
    	HashMap h=new HashMap();
    	h.put("1","apple");
    	h.put("6","mango");
    	h.put("3","banaana");
    	h.put("3","banaanaaaaa");
    	h.put("NULL","bnana");
    	System.out.println(h);	       
	}
}




class Hashcode
{
	public static void main(String[] args)
	{
		System.out.println(new Std("abc","100","434745").hashCode());
		System.out.println(new Std("abc","100","434745").hashCode());
	}
}

class Std
{
	String name,id,mob;
	Std(String n,String id,String m)
	{
		name=n;
		this.id=id;
		mob=m;
	}

	public int hashCode()
	{
		return((name+","+id+","+mob).hashCode());
	}
}



class Bank
{
	public static void main(String[] args) {
		int bal=5000;
		int wd=4000;
        try
        {
		   if(bal<wd)
			throw new ArithmeticException("incufficient balance");
		    bal=bal-wd;
		    System.out.println("complete");
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("Exception :"+e.getMessage());
	    }
	}
}























