//ATM 
import java.util.*;

public class ATM{
	public static void main(String[] args) {
		ATMop o = new ATMop();
	}
}

class Data{
	float balance;
}

class ATMop{

	Scanner sc = new Scanner(System.in);
	HashMap<Integer,Data> map = new HashMap<>();

	ATMop()
	{
		System.out.println("welcome to ATM");
		System.out.println("**************");
		op();
	}

	public void op()
	{
		System.out.println("Enter your pin code");
		int pincode = sc.nextInt();

		

		if(map.containsKey(pincode)==true)
		{
			Data obj = map.get(pincode);
			menu(obj);
		}
		else
		{
			System.out.println("please create new Account First");
			System.out.println("Enter new pincode");
			int pin = sc.nextInt();
			Data obj = new Data();
			map.put(pin,obj);
			menu(obj);

		}

	}

	public void menu(Data obj)
	{
		System.out.println("***********************");
		System.out.println("enter a valid number");
		System.out.println("1. Check balance");
		System.out.println("2. Deposite balance");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Check Another Account");
		System.out.println("5. Exit");

		switch(sc.nextInt())
		{
			case 1:
			checkBalance(obj);
			break;
			case 2:
			deposite(obj);
			break;
			case 3:
			withdraw(obj);
			break;
			case 4:
			op();
			break;
		    case 5:
		    System.exit(0);
			break;
			default:
			menu(obj);	
		}
	}

	public void checkBalance(Data obj)
	{
		System.out.println("your balance is : "+obj.balance);
		menu(obj);
	}

	public void deposite(Data obj)
	{
		int amount = sc.nextInt();
		obj.balance += amount;
		checkBalance(obj);
		menu(obj);
	}

	public void withdraw(Data obj)
	{
		int amount = sc.nextInt();
		if(amount <= obj.balance)
		{
		obj.balance -= amount;		
		}
		else
		{
			System.out.println("insufficient balance");
			withdraw(obj);
		}
		checkBalance(obj);
		
	}
}
