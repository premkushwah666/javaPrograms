import java.io.*;

class Union
{
  	 public static void Unique(FileReader o)throws IOException
  	 {
  	 	 FileOutputStream fos = new FileOutputStream("U.txt",true);
    	 int a;

    	 while((a=o.read())!=-1)
    	 {
    	 	FileReader fr = new FileReader("U.txt");
    	 	int b;
    	 	while((b=fr.read())!=-1)	
    	 	{
    	 		if (a==b)
    	 		{
    	 			b=0;
    	 			break;
    	 	    }
    	 	}
    	 	  if (b==-1)
    	 	   {
    	 	   	 	fos.write(a);
    	 	   }
    	 }

  	 }

	public static void main(String[] args)throws IOException
	 {

		FileReader fr1 = new FileReader("SetA.txt");
		FileReader fr2 = new FileReader("SetB.txt");
		FileReader fr3 = new FileReader("SetC.txt");
		Unique(fr1);
		Unique(fr2);
		Unique(fr3);
	}
}



//    1 2 3 4 5 6 
//    3 4 5 6 7 8 
//intersection
//	  3 4 5 6