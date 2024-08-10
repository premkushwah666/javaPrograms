class Test{
	int a=20;
	public static void main(String[] args) {
		Test t = null;
		try
		{
			System.out.println(t.a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class P{
	static {
		System.out.println("P static Block");
	}
}



class Test1{
	public static void main(String[] args) {
		String s = "HELLO";
		int a = 10;
		int b = 0;
		System.out.println(s);
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong");
		}
		System.out.println("END");
	}
}



class Parse{
	public static void main(String[] args) {
		String s = "Strung";
		int i=Integer.parseInt(s);
		System.out.println(s);
	}
}  



