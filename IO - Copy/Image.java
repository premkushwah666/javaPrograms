import java.io.*;

class Image
{
	public static void main(String[] args)throws Exception
	{
		copy("C:\\Users\\DELL\\Downloads\\jayuuuu.jpg","copyImage.jpg");
	}

public static void copy(String source,String dest)throws Exception
  {
	FileInputStream fis = new FileInputStream(source);
	FileOutputStream fos = new FileOutputStream(dest);

	int b;
	while((b=fis.read())!=-1)
	{
		fos.write(b);
	}
	fos.close();
	fis.close();
  }
}



