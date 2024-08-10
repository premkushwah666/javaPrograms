import java.util.*;
import java.io.*;

class Login
{
	public static void main(String[] args)throws Exception
	{
		while(true)
		{
			System.out.println("*****WELCOME TO MY PROJECT*********");
			System.out.println("1.LOGIN");
			System.out.println("2.EXIT");
			System.out.print("ENTER YOUR CHOICE->");
			int choice=0;
			Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();

			switch(choice)
			{
				case 1:
					getPassword();
					break;

				case 2:
					System.exit(0);
					break;

				default :
					 System.out.println("INVAILED CHOICE");;
					  break;
			}
		}
	}
	
	public static void getPassword()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR ID: ");
		String id = sc.nextLine();
		System.out.println("ENTER YOUR PASSWORD: ");
		Console con = System.console();
		char[] chars=con.readPassword();
		String password = new String(chars);

		if (id.equals("240") && password.equals("jaya@14")) 
		{
			System.out.println("******LOGIN SUCCESSFULLY******");
		}
		else
		{
			System.out.println("INVAILED ID AND PASSWORD.......");
	    }
	}



	public static void adminDashboard()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("*******************adminDashboard*********************");

		System.out.println("1. student master");
		System.out.println("2. course master");
		System.out.println("3. fee master");
		System.out.println("4. book master");
		System.out.println("5. attendence master");
		System.out.println("6. logout");

			int choice=0;
			System.out.println("enter urr choice");
			choice=sc.nextInt();
			if (choice==6)
			{
				break;
			}
			switch(choice)
			{
				case 1:
				studentMaster();
				break;

				default:
				System.out.println("invalid input");
			}
		
	
}
}
}


