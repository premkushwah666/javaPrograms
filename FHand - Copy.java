 import java.util.Scanner;
 import java.io.*;

// class Id
// {
// 	public static void main(String[] args) throws Exception
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Press 1 Creat File");
// 		System.out.println("Press 0 Show File");
// 		int press = sc.nextInt();
// 		System.out.print("Insert fileName here :-");
//         String fileName=sc.next();


//         //for insertion of Id and password
//         if (press==1)
//          {
//         	System.out.println("insert file "+ fileName);
//         	System.out.println("enter Id :");
//         	String id=sc.next();
//             System.out.println("enter Password:");
//             String pass = sc.next();
//             insertFileData(fileName,id,pass);

//             String data=incrept(fileName);
//             ins(fileName,data);
//          }
//          else
//          {
//          	showfileData(fileName);
//          }
// 	}
// 	public static void incrept(String fileName) throws Exception
// 	 {
// 		fileReader fr=new fileReader(fileName);
// 		int a=fr.read();
// 		String s="";
// 		while(a!=-1)
// 	    {
// 	    	s=s+(char)(a+2);    
// 	    	a=fr.read();
// 	    }
// 	    return s;
// 	}
// 	public static void ins(String fileName,String str)throws Exception
// 	 {
// 		FileWriter fw=new FileWriter(fileName);
// 		fw.write(str);
// 		fw.close();
// 	 } 

// 	 public static void insertFileData(String fileName,String Id,String Pass)throws Exception
// 	  {
// 	    FileWriter fw =new FileWriter(fileName);
// 	    fw.write("Id :");	
// 	    fw.write(Id);	
// 	    fw.write("\n");	
// 	    fw.write("Password :");	
// 	    fw.write(Pass);

// 	    fw.close();	
// 	 }
// 	 public static void showFileData(String fileName)throws Exception
// 	  {
// 	 	FileReader fr=new FileReader(fileName);
// 	 	int a=fr.read();
// 	 	while(a!=-1)
// 	 	{
// 	 		System.out.print((char)(a+2));
// 	 		a=fr.read();
// 	 	}
// 	 }
// }



/*class Test
{
	public static void main(String[] args) throws Exception
	{
	  write ("Output.txt");	
	}
	public static void read(String name) throws Exception
	{

	}
	public static void write(String name) throws Exception
	{
		PrintWriter pw = new PrintWriter(name);
		pw.writer(100);
		pw.close();
	}
}*/


class Task
{
	public static void main(String[] args) throws Exception
	 {
	 	//System.out.println("hello");
		MySystem.out.println("hello how are uhhhh");
		MySystem.out.println("100+10");
	 }
}
class MySystem
{
    static PrintStream out;
	//static
	{
		try
		{
			out =new PrintStream("con");
		}
		catch(Exception e)
		{

		}
	}
}






















