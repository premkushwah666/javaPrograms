import java.io.*;

class Test{
	public static void main(String[] args)throws Exception{
		File f = new File("abcd.txt");
		if(f.exists())
		{
			System.out.println("File Already Exist");
		}
		else {
			f.createNewFile();
			System.out.println("New File is created");
		}
	}
}




class Test1{
	public static void main(String[] args) {
		File f = new File("C:\\");
		if(f.exists())
		{
		  if(f.isDirectory())
		  {
		  	String names[] = f.list();
		  	System.out.println(names.length+" files and folder ");
		  	for(String n:names)
		  		System.out.println(n);
		  }
		  else
		  {
		  	System.out.println("File Already exist");
		  }
	   }
	}
}




class Test2{
	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		BufferedReader br = new BufferedReader(new FileReader("first.txt"));
		String line = br.readLine();
		while(line!=null)
		{
			if(isNotExist("output.txt",line))
			{
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("second.txt"));
		line = br.readLine();
		while(line!=null)
        {
        	if(isNotExist("output.txt",line))
        	{
        		bw.write(line);
        		bw.newLine();
        		bw.flush();
        	}
        	line = br.readLine();
        }
        bw.close();
	}

	public static boolean isNotExist(String name,String val) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader(name));
		String line = br.readLine();
		while(line!=null)
		{
			if(line.equals(val))
				return false;

			line = br.readLine();
		}
		return true;
	}
}























