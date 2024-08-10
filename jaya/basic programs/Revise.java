class Control {

	
	public static void main(String[] args) {

		  int a=10;                                          
		System.out.println(a);                                  
		System.out.println("ram ram");                            
		Test t = new Test();
		Test t1=new Test(10);
		Test t2=new Test(20);
	    {
			System.out.println("1. child class ");
		}
	}                                                                    
}


class Test{
      
       static{
       	System.out.println("2.static block");
       }

       {
       	System.out.println("2.non static block");
       }

       Test(){
       	System.out.println("1 constructure");
       }

       Test(int n){
       	System.out.println("2 constructure");
       }

}



// without inherit of test class, how is it possible of calling of static block ?


class P{
	public static void main(String[] args) {
		
	}
   int a,b,c;
   static int x,y;

   P()
   {
   	 
   }

   P(int x)
   {
   	this.x = x;
   	y =50;
   }

   {
   	a =10;
   	 b= 20;
   	 c =30;
   }

   static{
   	x = 40;
   	y=50;
   }


}