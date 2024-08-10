import java.io.*;

class Write
{

	
	
	public static void main(String[] args) throws IOException{
		FileOutputStream fout = new FileOutputStream("./k.txt",true);
		String s = "JAYA";

		for(int i=0; i<s.length(); i++)
		{
			fout.write((int)s.charAt(i));
		}
		fout.close();
	}
}