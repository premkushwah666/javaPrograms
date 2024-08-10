import java.util.*;
import java.io.*;
//***************************************************************************************
// add and get methods are in array list class


class Oasis{
	public static void main(String[] args)throws Exception {
		//making object for using get method and read method
		School s = new School();

		Student stu = new Student("prem",101,"first year","3435345334");
		s.addData(stu);

		ArrayList al = s.readData();

		if(al != null)
		{
		    for (int i=0; i<al.size(); i++)
		    {
			    System.out.println(al.get(i));
		    }
		}   

	}
}

class School
{
	public void addData(Student s)throws Exception
	{
		ArrayList al = readData();
		if(al==null)
		{
			al = new ArrayList();
		}
		al.add(s);
		FileOutputStream fos = new FileOutputStream("studentData.obj");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(al);
        os.close();

	}


	public ArrayList readData()
	{
		try
		{
			FileInputStream fis = new FileInputStream("studentData.obj");
			ObjectInputStream is = new ObjectInputStream(fis);
			ArrayList al = (ArrayList)is.readObject();
			return al;
		}
		catch(Exception e)
		{
			return null;
		}
	}
   
	public Student search(int rollNo)
	{
		ArrayList al = readData();
		for (int i=0; i<al.size(); i++)
		{
			Student s1 = (Student)al.get(i);
			if (s1.getRollNo == rollNo) 
			{
			    return s1;		
			}    	
		}
	    return null;
	}

	public void update()throws Exception
	{
        Scanner sc = new Scanner(System.in)
		System.out.println("enter rollNo no");
		int rollNo = sc.nextInt();
		Student s = search(rollNo);

		if (s==null) 
		{
		  	System.out.println("not found");
		}
		else
		{
			System.out.println(s);
			System.out.println("enter new mob num");
			s.setMobile(sc.nexLine());
			ArrayList al = readData();
			int index = ai.indexOf(s);
			al.set(index,s);
			addData(al);
		}  

		//System.out.println("enter 1 to update name");
		//System.out.println("enter 2 to update mobile");
		

		// switch (sc.nextInt()) {
		// 	case 1:

			
		// }
	}

}//end of School


class Student implements Serializable
{
	private String name;
	private int rollNo;
	private String className;
	private String mobile;

	Student(String name,int rollNo,String className,String mobile)
	{
       this.name = name;
       this.rollNo = rollNo;
       this.className = className;
       this.mobile = mobile; 
	}

     //Setters
	public void setName(String name)
	{
	   this.name = name;
	}
    
    public void setRollNo(int rollNo)
    {
    	this.rollNo = rollNo;
    }
    
    public void setClassName(String className)
    {
	this.className = className;    	
    }
    
    public void setMobile(String mobile)
    {
	this.mobile = mobile;    	
    }

    //Getters
	public String getName(String name)
	{
		return this.name;
    }

    public int getRollNo(int rollNo)
	{
		return this.rollNo;
    }

    public String getClassName(String classname)
	{
		return this.className;
    }

    public String getMobile(String mobile)
	{
		return this.mobile;
    }

    public String toString()
    {
    	return "\nrollNo = "+rollNo+"\nname = "+name+"\nclassname = "+className+"\nmobile = "+ mobile;
    }


}//end of Student Class