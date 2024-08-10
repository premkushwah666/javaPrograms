//IT IS DAD IT WILL NOT PROVID DEFINATION YOU HAVE TO MADE IT 
abstract class Dad
{
	public void marriage()
	{
	}
}

class Son extends Dad
{
public void marriage()
{
	System.out.println("love marriage");
}


	public static void main(String[] args) {
	Son s = new Son();
	s.marriage();

	}
}

//YOU CAN OVERRIDE BHAGYVATI
//BETA YOU CAN OVERRIDE BHAGMATI
abstract class Papa
{
	public void marriage()
	{
    	System.out.println("love + Arrange marriage");
	}
}

class Beta extends Papa
{  
	public void marriage()
	{
		System.out.println("Love + Arrange marriage");
	}

	public static void main(String[] args)
	{
		Beta b = new Beta();
    b.marriage();
	}
}





//YOU CAN'T OVERRIDE BHAGYATI
abstract class Bapuji
{
	final public void marriage()
	{
		System.out.println("Arrange marriage");
	}
}

class Putra extends Bapuji
{

// public void marriage()
// {
// 	System.out.println("rupa");
// }


public static void main(String[] args) {
      
 Putra m = new Putra();
 m.marriage();
	}	


}