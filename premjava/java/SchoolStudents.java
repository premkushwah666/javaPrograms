import java.util.Scanner;

class Student
{
	private int rollNo,fees;
	private String name,mobile,className;

	Student(int rollNo,String name,String mobile,String className)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.mobile = mobile;
		this.className = className;
	}

	public void setFees(int fees)
	{
		this.fees = fees;
	}

	public int getFees()
	{
		return this.fees;
	}

	public String toString(){
		return "\nrollNo = "+rollNo+"\nname  = "+name+"\nmobile = "+mobile+"\nclassName = "+className+"\n";
	}

	public int getRollNo()
	{
		return this.rollNo;
	}

}

class School
{
	Student[] students;
	int seat,totalStd;

	School()
	{
		seat = 5;
		totalStd = -1;
		students = new Student[seat];
	}

	public void newStudent()
	{
		if(totalStd==seat-1)
		{
			System.out.println("sorry visit next year");
			return;
		}
         int r;
         String n,m,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rollNo"); 
        r = sc.nextInt();
        sc.nextLine();

        System.out.println("enter name");
        n = sc.nextLine();

        System.out.println("enter mob Number");
        m = sc.nextLine();

        System.out.println("enter className");
         c = sc.nextLine();



        Student s = new Student(r,n,m,c);
        

        totalStd++;

        students[totalStd]=s;
         System.out.println("set fees");   
        students[totalStd].setFees(sc.nextInt());

	}


	public void show()
	{
		for (int i = 0; i<=totalStd; i++ ) 
		{
			System.out.println("*************************");
			System.out.println(students[i]);
			System.out.println("fees = "+students[i].getFees());
			System.out.println("*************************");
		}
	}

	public int searchByRollNo(int roll)
	{
		for(int i = 0; i<=totalStd; i++)
		{
			if(roll==students[i].getRollNo())
			{
				return i;
			}
		}
		return -1;
	}

	public Student delete()
	{
		int r,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter roll no.");
		r = sc.nextInt();
		i = searchByRollNo();
		if(i!=-1)
		{
		     Student s = students[i];

		     for (int j=i; j<totalStd; j++)
		     {
		     	students[j] = students[j+1];
		     }
		     students[totalStd] = null;
		     totalStd--;
		     return s;
		}
		else
		{
			System.out.println("roll no not exist...");
			return null;
		}
	}
}


public class SchoolStudents{
	public static void main(String[] args) {
		
	School s = new School();
	Scanner sc = new Scanner(System.in);

    while(true)
    {

	    System.out.println("\n1 add new students");
	    System.out.println("2 show");
        System.out.println("enter choice");

        switch(sc.nextInt())
        {
    	    case 1:
    	    s.newStudent();
    	    break;

         	case 2:
         	s.show();
    		break;


        	default:
        	break;
        } 
	}				        





		

	}
}	


/*import java.util.Scanner;

class Student{
	private int rollNo,fees;
	private String name,mobile,className;
	Student(int rollNo,String name,String mobile,String className)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.mobile = mobile;
		this.className = className; 
	}

	public void setFees(int fees)
	{
		this.fees = fees;
	}
	public int getFees()
	{
		return this.fees;
	}

	public int getRollNo()
	{
		return this.rollNo;
	}

	public String toString()
	{
		return  "\nRoll no :" +rollNo+ ", Name :" +name+ " , mobile :" +mobile+ " ,class:" +className+" ,fees :"+fees;
	}
}


class School
{
	Student students[];
	int seat,totalStd;
	School()
	{
		seat = 5;
		totalStd = -1;
		students= new Student[seat];
	}

	public void newStudent()
	{
		if(totalStd==seat-1)
		{
			System.out.println("please visit next Year");
			return;
		}

		String n,m,c;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter student roll");
		r = sc.nextInt();
		sc.nextLine();
		System.out.println("plz enter student name");
		n = sc.nextLine();
		System.out.println("plz enter student class");
		c = sc.nextLine();
		System.out.println("plz enter student mobile");
		m = sc.nextLine();

	Student s = new Student(r,n,m,c);
		totalStd++;
		students[totalStd] = s;
	}

	public void update()
	{
		int r,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("plz inter Roll Number");
		r = sc.nextInt();
		i = searchByRollNo(r);

		if(i!=-1)
		{
			System.out.println("plz inter fees");
			int fees = sc.nextInt();
			students[i].setFees(fees);
		}
		else
		{
			System.out.println("roll num not exist");
		}
	}
 	
 	public int searchByRollNo(int roll)
 	{
 		for(int i=0; i<=totalStd; i++)
 		{
 			if(roll==students[i].getRollNo())
 			{
 				return i;
 			}
 		}
 		return -1;
 	}

 	public void show()
 	{
 		for (int i=0;i<totalStd ;i++) {
 			System.out.println(students[i]);
 		}
 	}

}

public class SchoolStudents{
	public static void main(String[] args) {
		School s = new School();
		s.newStudent();
		s.show();
		s.newStudent();
		s.show();
		

	}
}*/