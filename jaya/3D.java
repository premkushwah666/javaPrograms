import java.util.*;
import java.io.*;

class Crud{
	final String FILE_NAME = "abc.obj";
	public void insert(Object al)
	{
		try{
			ArrayList oldValue = get();
			if(oldValue == null)
			{
				oldValue = new ArrayList();
			}

			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			oldValue.add(al);
			os.writeObject(oldValue);
			os.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void insert(ArrayList al)
	{
		for(int i=0;i<al.size();i++)
		{
			insert(al.get(i));
		}
	}

	public ArrayList get()
	{
		try
		{
			FileInputStream ios = new FileInputStream(FILE_NAME);
			ObjectInputStream os = new ObjectInputStream(ios);
			ArrayList al = (ArrayList)os.readObject();
			os.close();
			return al;
		}
		catch(Exception e){
			//e.printStackTrace();
		}
		return null;
	}
}

class Test{
	public static void main(String[] args) {
		
		Crud crud = new Crud();
		crud.insert(new Emp("Jayyu","Indore",4764));
		crud.insert(new Emp("Gungun","Paris",4765));
		crud.insert(new Emp("Jinu","Goa",4766));
		crud.insert(new Emp("Chinu","UK",4767));
		crud.insert(new Emp("Jiju","Newyork",4768));
		System.out.println(crud.get());
	}
}


class Emp implements Serializable{
	String name,address;
	int sal;sd68d
	Emp(String name,String address,int sal)
	{
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	public String toString()
	{
		return "( "+name+", "+address+", "+sal+" )\n";
	}
}






