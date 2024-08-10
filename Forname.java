import java.lang.Class;
import java.lang.reflect.Method;//<-- here reflect is a pacage forName
//new instance is a method of Method class



class Test
{
	public static void main(String[] args)throws Exception {
		
	   // Class c = Class.forName(args[0]);
	    // System.out.println(c.getName());
	    // System.out.println(c.getSimpleName());
	    // System.out.println(c.getModifiers());
	    // System.out.println(c.getSuperclass());
	    // Method[] m = c.getMethods();
	    // for (Method x : m) {
	    // 	System.out.println(x. getReturnType());
	    // }

	    //now making object
	    // Class c = Class.forName(args[0]);
	    // Object ob = c.newInstance();
	   
	    // System.out.println(ob);
	    // ((SBI)ob).getInfo();

	    // Object ob = c.newInstance();
	    // if(args[0].equals("SBI"))
	    // {
	    // 	((SBI)ob).getInfo();
	    // }
	    // else if(args[0].equals("PNB"))
	    // {
	    // 	((PNB)ob).getInfo();
	    // } 
	    // else if(args[0].equals("HDFC"))
	    // {
	    // 	((HDFC)ob).getInfo();
	    // } 

	    // if(ob instanceof SBI)
	    // {
	    // 	SBI s = (SBI)ob;
	    // 	//((SBI)ob).getInfo();
	    // }
	    // else if(ob instanceof PNB)
	    // {
	    // 	((PNB)ob).getInfo();
	    // } 
	    // else if(ob instanceof HDFC)
	    // {
	    // 	((HDFC)ob).getInfo();
	    // }

	   //best way make an Interface and all methods will inherit them
		// and OBject k jagah RBI ke var me hold krege

		Class c = Class.forName(args[0]);
		RBI r = (RBI)c.newInstance();
		r.getInfo();
		
	}
}


interface RBI
{
	void getInfo();
}

class SBI implements RBI
{
	public void getInfo()
	{
		System.out.println("SBI info");
	}
	static
	{
		System.out.println("SBI static");
	}

}


// class RBI
// {
// 	public void getInfo()
// 	{
// 		System.out.println("RBI info");
// 	}
// 	static
// 	{
// 		System.out.println("RBI static");
// 	}
// }



class PNB implements RBI
{
	public void getInfo()
	{
		System.out.println("PNB info");
	}
	static
	{
		System.out.println("PNB static");
	}
}



class HDFC implements RBI
{
	public void getInfo()
	{
		System.out.println("HDFC info");
	}
	static
	{
		System.out.println("HDFC static");
	}
}