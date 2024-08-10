import java.io.*;
import java.util.Scanner;
import java.util.*;


	




class ShowAllFiles
{

  	public static void show(String path) {


		File f = new File(path);
		if(f.exists())
		{
			if(f.isDirectory())
			{
				String[] files = f.list();
				for(String s:files)
				{
					File f1 = new File(f,s);
					if(f1.isFile())
					{
						System.out.println("p");
						//System.out.println(s);
					}
					else
					{
						show(path+f1);
					}
					//System.out.println(s+"=>"+(f1.isFile()?"file":"folder"));
				}
			}
		
		}
		
	}



	public static void main(String[] args) {
		show("C:\\ShowAll");
		//show(args[0]);
	}
}