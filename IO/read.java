import java.io.*;

class read
{
	public static void main(String[] args) throws IOException
	 {
		FileInputStream fis = new FileInputStream("./read.java");
		//int i=fis.read();

		//int x = fis.available();
		//System.out.println(x);
       byte[] b ;//= new byte[fis.available()];
       b =  fis.readAllBytes();
		
        for (byte j : b) {
        	System.out.print((char)j);
        }
        // for (int i=0; i<b.length; i++) {
        // 	System.out.println(i);
        // }

		/*while(i!=-1)
		{
			System.out.print((char)i);
		    i = fis.read();
		}*/
		fis.close();

	}
}

// class read
// {
// 	public static void main(String[] args) throws IOException
// 	 {
// 		FileInputStream fis = new FileInputStream("./"+args[0]);
// 		int i=fis.read();



// 		while(i!=-1)
// 		{
// 			System.out.print((char)i);
// 		    i = fis.read();
// 		}
// 		fis.close();

// 	}
// }

//agar file me -1 hi lika ho to fhir
//output --> -1 
// reason first - read krega then one 
// character by character 