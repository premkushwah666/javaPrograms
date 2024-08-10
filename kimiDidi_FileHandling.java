//@kimiDidi_FileHandling.java
import java.io.*;

class TestA
{

    public static void main(String[] args)throws Exception {
		read();
		write();

	}	
static void read()throws Exception 
{
	FileReader fr = new FileReader("TestA.java");
	/*int a=fr.read();
	while(a!=-1)
	{
		System.out.print((char)a);
		a = fr.read();}*/

		int a=0;
		char b[] = new char[100];
		a=fr.read(b);
		while(a!=-1)
		{
			System.out.println(b);
			a = fr.read(b);
		}
		System.out.println("success");
	}

static void write() throws Exception{
	FileWriter fw = new FileWriter("abc.txt",true);
	fw.write('A');
	fw.write("\n");
	fw.write("hello");
	fw.write("\n");
	fw.write(100);
	fw.write("\n");
	fw.close();
	System.out.println("success");
}
}


/*-------------------------------------------------------------------------------*/

class Test
{
	public static void main(String[] args)throws Exception {
		write();
	}

	static void read()throws Exception {
		FileReader fr = new FileReader("Test.java");
	}

	static void write()throws Exception {
		FileWriter fw = new FileWriter("abc.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello this is kimi");
		bw.close();
	}
}


/*-------------------------------------------------------------------------------*/

class TestB
{
	public static void main(String[] args) throws Exception{
		read();
	}
	static void read()throws Exception
	{
		FileReader fr = new FileReader("TestB.java");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s = br.readLine();
		}
	} 
	static void write()throws Exception 
	{
		PrintWriter ps = new PrintWriter("abc.txt");
		ps.println("hello");
		ps.println('a');
		ps.println(100);
		ps.println(100.9);
		ps.println(true);
		ps.close();
	}
}

/*-------------------------------------------------------------------------------*/

class TestC
{
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("copy.java");
		FileReader fr = new FileReader("TestC.java");
		int a =fr.read();
		while(a!=-1)
		{
			//System.out.println(a);
			fw.write(a);
			a = fr.read();
		}
		fw.close();
	}
	static void read()throws Exception 
	{
		FileReader fr = new FileReader("TestC.java");
		int a=0;
		char b[] = new char[100];
		a=fr.read(b);
		while(a!=-1)
		{
			System.out.println(b);
			a = fr.read(b);

	}
}
static void write() throws Exception{
	FileWriter fw = new FileWriter("abc.txt",true);
	fw.write('A');
	fw.write("hello");
	fw.write(100);
	fw.write("\n");
	fw.close();
	System.out.println("success");
	}
}

/*-------------------------------------------------------------------------------*/

class TestD
{
	public static void main(String[] args) throws Exception{
		write();
		//read();
	}
	static void read()throws Exception
	{
		FileReader fr = new FileReader("TestB.java");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s = br.readLine();
		}
	} 
	static void write()throws Exception 
	{
		PrintWriter ps = new PrintWriter("con");//will print in console
		ps.println("hello");
		ps.println('a');
		ps.println(100);
		ps.println(100.9);
		ps.println(true);
		ps.close();
	}
}


/*-------------------------------------------------------------------------------*/