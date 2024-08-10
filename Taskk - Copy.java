//HASHCODE 
class Test
{
	public int hashcode()
	{
		return 10;
	}
public static void main(String[] args) {
	String s="ABCD";
	Test t = new Test();
	Test t1 =new Test();
	System.out.println(t.hashcode());
	System.out.println(t1.hashcode());
	System.out.println(t1);
	System.out.println(t);
}
}


//INTEGER TO BINARY..............
class Task
{
	public static void main(String[] args) {
		int a=10;
		Integer i=10;
		System.out.println(Integer.toBinaryString(i));
	}
}


//WRAPPER TO PRIMITIVE
class Treat
{
	public static void main(String[] args) {
		Integer a=90;
		int i=10;
		System.out.println(Integer.valueOf(i));
		// System.out.println(Integer.intValue(i)); //wrong
		 System.out.println(a.intValue()); 

	}
}

/*class J
{
	public static void main(String[] args) {
		double d =12;
		Double d1=Double.valueOf(d);              //PRIMITIVE TO WRAPPER
		System.out.println(d1);
	}
}*/



/*class K
{
	public static void main(String[] args) {
		double d1=Double.parseDouble("1234");       //STRING TO PRIMITIVE
		System.out.println(d1);
	}
}*/


// class l
// {
// 	public static void main(String[] args) {
// 		int i1=Integer.toString(1234);       //STRING TO PRIMITIVE
// 		System.out.println(i1);
// 	}
// }



class P
{
	public static void main(String[] args) {

		//p->W
		int i = 11;
	Integer i1 = Integer.valueOf(i);
	//System.out.println(i1);

		//S->W
 	    String s="23";
	Integer i2 = Integer.valueOf(s);
	//System.out.println(i2);

		//P->S
	int p1 = 45;
	String s2 = Integer.toString(p1);
	//System.out.println(s2);

		//W->S
	Integer i3 = 77;
	// Integer i3 = Integer.valueOf(77);   internally
	String s3 = i3.toString();
	//System.out.println(s3);


	   //W->P
	Double d4=44d;
	// Double d4 = Double.valueOf(44);
	double d5 = d4.doubleValue();
	//System.out.println(d5);


	  //S->P
	String s4 = "34";
	int i9 = Integer.parseInt(s4);
	//System.out.println(i9);


	//^-------------------------------------------------------

	int a = Integer.parseInt("F",16);
	System.out.println(a);





	}
}











