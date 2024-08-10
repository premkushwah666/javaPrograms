import java.io.*;

class Create
{
	public static void main(String[] args)throws IOException
	{
		File f = new File("c:/java/IO/j.txt");
		f.createNewFile();
		System.out.println(f.exists());//t
		System.out.println(f.canWrite());//t
		System.out.println(f.getName());//n
		System.out.println(f.length());//1
		System.out.println(f.delete());

	}
}