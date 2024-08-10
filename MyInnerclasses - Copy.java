//how to access inner class

/*class MyInnerclasses
{
	public static void main(String[] args) {

		Outer ob = new Outer();
        Outer.Inner i = ob.new Inner();

        new Outer().new Inner().method1();
        ob.new Inner().method1();


        i.method1();    
	}
}

class Outer
{
	class Inner
	{
		void method1(){
			System.out.println("outer m1");
		}
	}
}*/


//access thruugth fun

/*class MyInnerclasses
{
	class Inner
	{
		void m(){
			System.out.println("outer m1");
		}
	}

	void fun()
	{
		Inner i = new Inner();
		i.m();	
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.fun();
        
	}
}*/



class ChinesePoint
{
     void noodles()
    {
    	System.out.println("normal tast noodles");
    }
}

class pk
{
    public static void main(String[] args) {
         // ChinesePoint cp= new ChinesePoint();
         // cp.noodles();


    	//ek baar spicy krane pr vapas se masale ko nahi nikal sakte OK	
    	// ChinesePoint cp= new ChinesePoint()
    	// {
    	// 	 void noodles()
   		// 	 {
    	// 	     System.out.println("Spicy taste");
    	// 	 }
    	// };

    	// cp.noodles();

    	ChinesePoint cp= new ChinesePoint()
    	{
    		 void noodles()
   			 {
    		     System.out.println("Spicy taste");
    		 }
    	};

    	cp.noodles();
    	

    }
}