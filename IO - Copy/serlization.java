import java.io.*;

class Test
{
	public static void main(String[] args)throws Exception
	 {
	 	Std s =new Std("JKL",14);
		serialization(s);
	}


	public static void serialization(Object obj)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("xyz.obj");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);
		System.out.println(obj);
		os.close();	
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