import java.io.*;

class Test
{
	public static void main(String[] args)throws Exception
	 {
	 	Std s =new Std("JKL",14);
		serialization(s);
		deserialization();
	}
	public static void serialization(Object obj)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("xyz.obj");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);
		 os.writeObject(obj);
		//os.writeObject(obj);
		//System.out.println(obj);
		os.close();	
	}


	public static void deserialization()throws Exception
	{
		FileInputStream fis = new FileInputStream("xyz.obj");
		ObjectInputStream is = new ObjectInputStream(fis);
		Std s = is.readObject();
		System.out.println(s);
		s = (Std)is.readObject();
		System.out.println(s);
		//s = (Std)is.readObject();
		//System.out.println(s);


		is.close();	
	}
}


class Std implements Serializable
{
	String name;
	int roll;
	Std(String name,int roll)
	{
		this.name = name;
		this.roll =roll;
	}

    public String toString()
    {
	   return name+","+roll;
    }
}