import java.util.*;
import java.io.*;

//global variable kese banaye jiskp har method me use kr ske
//static variable vo auto incriment ho


class HandleFile{
	// in this for user its name is User.obj

 	public static void write(Object data,String f)
 	{
 		try
 		{
 			FileOutputStream fos = new FileOutputStream(f);
 			ObjectOutputStream os = new ObjectOutputStream(fos);
 			os.writeObject(data);
 			os.close();
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 	}

 	public static Object read(String f)
 	{
 		try
 		{
 			FileInputStream fis = new FileInputStream(f);
 			ObjectInputStream is = new ObjectInputStream(fis);
 			Object ob = is.readObject();
 			is.close();
 			return ob;
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 		return null;
 	}
 }






// there are two types 1. admin 2. student

class User implements Serializable{


    private int id;
    private String name;
    private String password;
    private String type;

    public User(int id, String name, String password,String type) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public User(String name, String password,String type) {
        this.name = name;
        this.password = password;
        this.type = type;

    } 

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.type = "student";
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + ", type="+ type + "}";
    }


}


public class Project	
{
	public static User checkIdPassword(int id,String password)
	{
		
		HandleFile hf = new HandleFile();
		ArrayList al = (ArrayList)hf.read("User.obj");

		if(al==null)
			System.out.println("null aa ra h arraylist se");
		else
		{
			for(int i=0; i<al.size(); i++)
			{
			    User u = (User)al.get(i);
			    if(id==u.getId() && password.equals(u.getPassword()))
			    {
			    	return u;
			    }
			}
		}	

	return null;
	}

	public static void getIdPassword()
	{

		Scanner sc = new Scanner(System.in);
	    System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter password");
		String password = sc.next();
		User u = checkIdPassword(id,password);
		if(u==null)
		{
			System.out.println("invalid id password");
		}			
		else
		{
			String type = u.getType();
			if(type.equals("admin"))
			{
				// System.out.println("\f");
				adminDashboard(u);
			}
			else
			{
				System.out.flush();
			//	clearScreen();
				System.out.println("********************userDashboard************************");
				studentDashboard(u);
			}
		}
	}




	public static void studentMaster()
	{
		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		u.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("enter name");
		u.setName(sc.nextLine());
		System.out.println("enter password");
		u.setPassword(sc.nextLine());
		System.out.println("Select type");
		System.out.println("1. admin");
		System.out.println("2. user");
		if(sc.nextInt()==1)
		u.setType("admin");
		else
		u.setType("student");


		HandleFile hf = new HandleFile();
		ArrayList al =  (ArrayList)hf.read("User.obj");
		al.add(u);
		hf.write(al,"User.obj");
		System.out.println(al);


	}

	public static void adminDashboard(User u)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\033[H\033[2J");
		System.out.flush();
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
			if (choice==6) {
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

	public static void studentDashboard(User u)
	{
		System.out.println("1. my Profile");
		System.out.println("2. BookDetails");
		System.out.println("3. FeeDetails");
		System.out.println("4. logout");
		
	}




	public static void main(String[] args) {

		User u1 = new User(1,"pre","p@123","admin");
		User u2 = new User(2,"jaya","j@123","student");

		

		ArrayList al = new ArrayList();
		//HandleFile hf = new HandleFile();

		al.add(u1);
		al.add(u2);
		//hf.write(al,"User.obj");


		Scanner sc = new Scanner(System.in);


		User u3 = new Student(101,"prem","prem","admin","gajanand");
		System.out.println(u3);
		al.add(u3);

		System.out.println(al);

		// while(true){


		// 	System.out.println("*****Welcome******");
		// 	System.out.println("1. login");
		// 	System.out.println("2. exit");

		// 	switch(sc.nextInt())
		// 	{
		// 		case 1:
		// 	    getIdPassword();
		// 		break;	

		// 		case 2:
		// 		System.exit(0);
			
		// 		default:
		// 		System.out.println("invalid choice");
		// 	}
		// }
		




	}
}



class Student extends User
{
	String fatherName;


	Student(int id, String name, String password,String type,String fatherName)
	{
		super(id,name,password,type);
		this.fatherName = fatherName;
	}

	public String getFatherName()
	{
		return this.fatherName;
	}

	public void setFatherName(String fatherName)
	{
		this.fatherName = fatherName;
	}

	public String toString()
	{
		String s = super.toString();
		return s.substring(0,s.length()-1)+", fatherName="+fatherName+"}";
	}
}

class Admin extends User
{
	
	
}






//by prem >>>>>>>-------code means love -------------->->  >>>>>>>-------code means love -------------->->

class Std{
	String name,mob;
	int rollNo;

	Std(String n,String m,int r)
	{
		name = n;
		mob = m;
		rollNo = r;
	}

    
    //override
    public String toString()
    {
    	return "name = "+name+" mobile = "+mob+" rollNo = "+rollNo;
    }
}

class CRUD
{
	int capacity;
	int size;
	Std[] value;

	CRUD()
	{
		/*capacity = 5;
		size = -1;
		value = new Std[capacity];*/
		this(5);
	}

	//overLoad
	CRUD(int x)
	{
		capacity = x;
		size = -1;
		value = new Std[capacity];
	}

	int indexOf(int rollNo)
	{
		for (int i=0; i<=size; i++) 
		{
			if(rollNo==value[i].rollNo)
				return i;
		}
	return -1;	
	}


	void increaseCapacity()
	{
		Std[] s = new Std[size+5];
		for (int i=0; i<=size; i++) {
			s[i] = value[i];
		}
		value = s;
	}

	int size()
	{
		return this.size;
	}

	void add(String name,String mob,int rollNo)
	{
		Std ob1 = new Std(name,mob,rollNo);

        if(size+1==capacity)
		{
			increaseCapacity();
		}
		value[++size] = ob1;
	}

	void add()
	{
		String n,m;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rollNo no.");
		r = sc.nextInt();

		System.out.println("enter name");
		sc.nextLine();
		n = sc.nextLine();
		System.out.println("enter mobile no");
		m = sc.next();

		Std s1 = new Std(n,m,r);
		if(size+1==capacity)
		{
			increaseCapacity();
		}
		size++;
		value[size] = s1;
		


	}

	public String toString()
	{
		String s = "";

		for ( int i = 0; i<=size; i++) {
			s+=value[i]+"\n";
		}
		return s;
	}

}

class CRUDTest                
{
	public static void main(String[] args) {
		CRUD c1 = new CRUD();
        
		Scanner sc = new Scanner(System.in);

		
 		
 		do
 		{
 			System.out.println("1. add");
		    System.out.println("2. show");
		    System.out.println("3. indexOf");
		    System.out.println("4. size");
            System.out.println("enter your choice");
     		switch(sc.nextInt())
 	    	{
 		    	case 1:
 		    	c1.add();
 				break;
 				case 2:
 				System.out.println(c1);
 				break;
 				case 3:
 				System.out.println("enter rollNo ");
 				System.out.println("index is " +c1.indexOf(sc.nextInt()) );
 				break;
 				case 4:
 				System.out.println("size is -> " +(c1.size+1));
 				break;
 			    
 			}

        }while(true);
		// c1.add("prem","4354235423",1);
		// c1.add("jayu","4354235323",2);
		// c1.add("jayu","4354235323",2);
		// c1.add("jayu","4354235323",2);
		// c1.add("jayu","4354235323",2);
		 // c1.add("jayu","4354235323",2);
		 // c1.add("jayu","4354235323",2);
	  //    c1.add("jayu","4354235323",2);

		//c1.add();
		//System.out.println(c1);

		//System.out.println(c1.size());
	}
}







