//first inmport
import java.io.*;
import java.util.Scanner;

class FileHandiling
{
	public static void findFolder(String s)
	{
		System.out.println("success");
	}
	public static void main(String[] x) {
		findFolder(x[0]);
	}
}


/*class FileHandiling
{
	public static void main(String[] args) {


		File f = new File("C:\\java");
		if(f.exists())
		{
			if(f.isDirectory())
			{
				String files[] = f.list();
				for(String s:files)
				{
					File f1 = new File(f,s);
					System.out.println(s+"=>"+(f1.isFile()?"file":"folder"));
				}
			}
		}
		else
		{
			System.out.println("not found");
		}
	}
}*/

/*class FileHandiling
{
	public static void main(String[] args) {
		File f = new File("C:\\java");
		if(f.exists())
		{
			if(f.isDirectory())
			{
				String files[] = f.list();
				for(String s:files)
				{
					File f1 = new File(f,s);
					System.out.println(s+"=>"+(f1.isFile()?"file":"folder"));
				}
			}
		}
		else
		{
			System.out.println("not found");
		}
	}
}*/





/*class FileHandiling
{
	public void createFile()throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter file name");
		String fileName = s.nextLine();

		File f1 = new File(fileName+".txt");
		if(f1.exists())
		{
			if(f1.isDirectory())
			{
				System.out.println("folder exists");
			}
			else
			{
				System.out.println("file exixts");
			}
		}
		else
		{
			f1.createNewFile();
		}

	}

	public static void main(String[] args)throws Exception{
		FileHandiling f = new FileHandiling();
		Scanner sc = new Scanner(System.in);
	
	   
		
			f.createFile();
			f.createFile();

	}
}*/

/*class FileHandiling
{
	public boolean createFile()throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter file name");
		String fileName = s.nextLine();

		File f1 = new File(fileName+".txt");
		if(f1.exists())
		{
			return false;
		}
		else
		{
			f1.createNewFile();
			return true;
		}

	}

	public static void main(String[] args)throws Exception{
		FileHandiling f = new FileHandiling();
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("enter choice");
		switch(sc.nextInt())
		{
			case 1:
			if(f.createFile())
				System.out.println("new file Created");
			else
				System.out.println("file exists");
		}
	}
}*/