class Test
{
	int a;
	int b;
	int c;

	Test(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;

	}
	 Test(){
	   this(-1,-2,-3);
	 }   //default constructor made by compiler
}

class ConstructorDemo{
	public static void main(String[] args) {
		Test t1 = new Test(5,2,2);
		Test t2 = new Test();
		System.out.println(t1.a+" "+);
		System.out.println(t2.a);
	}
}






class 