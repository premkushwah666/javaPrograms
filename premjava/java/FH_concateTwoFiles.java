import java.io.*;

class FH_concateTwoFiles 
{
	public static void main(String[] args) throws Exception {
		FileReader fr1 = new FileReader("a.txt");
		FileReader fr2 = new FileReader("b.txt");
        FileWriter fw = new FileWriter("x.txt",true);

        BufferedReader br1 = new BufferedReader(fr1);
		String s1 = br1.readLine();

		while(s1!=null)
		{
			fw.write(s1);
			s1 = br1.readLine();
		}
		//fw.close();

		fw.write("\n");

        BufferedReader br2 = new BufferedReader(fr2);
		String s2 = br2.readLine();
		while(s2!=null)
		{
			fw.write(s2);
			s2 = br2.readLine();
		}
		fw.close();

		




	}
}

/*-----------------------------------------------------------------------------------------------------------------*/

class FH_similarInTwoFiles 
{
	public static void main(String[] args) throws Exception {
		FileReader fr1 = new FileReader("a.txt");
        BufferedReader br1 = new BufferedReader(fr1);
		
      //  BufferedReader br2 = new BufferedReader(fr2);
        
        FileWriter fw = new FileWriter("x.txt");

		
		String s1 = br1.readLine();
		// String s2;
	//	String s2 = br2.readLine();

		while(s1!=null)
		{
		FileReader fr2 = new FileReader("b.txt");
		    BufferedReader br2 = new BufferedReader(fr2);
		    String s2 = br2.readLine();
            
			while(s2!=null)
			{
     			if(s1.equals(s2))
	  			{	
					fw.write(s1);//or s2
				}

   			    s2 = br2.readLine();
			}
			
			s1 = br1.readLine();	
		}
					
		fw.close();

	}
}

/*----------------------------------------------------------------------------------------------------------------*/

class FH_dissimilarInTwoFiles 
{
	public static void main(String[] args) throws Exception {
		FileReader fr1 = new FileReader("a.txt");
        BufferedReader br1 = new BufferedReader(fr1);
		
      //  BufferedReader br2 = new BufferedReader(fr2);
        
        FileWriter fw = new FileWriter("x.txt");

		
		String s1 = br1.readLine();
		// String s2;
	//	String s2 = br2.readLine();

		while(s1!=null)
		{
		FileReader fr2 = new FileReader("b.txt");
		    BufferedReader br2 = new BufferedReader(fr2);
		    String s2 = br2.readLine();
            
            boolean f=false;
			while(s2!=null)
			{
     			if(s1.equals(s2))
	  			{	
					f=true;//or s2
				}

   			    s2 = br2.readLine();
			}

			if(f=false)
			fw.write(s1);
			
			s1 = br1.readLine();	
		}
					
		fw.close();

	}
}