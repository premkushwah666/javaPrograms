public class ToUpperCase{

	static String s1 = "";

    public void toUpperCase(String s,int length){

    
     for (int i=0; i<length; i++) {

     	int c = (int)s.charAt(i);
     	if(c>='a' && c<='z')
     	{
     		c=c-32;
     		s1 = s1 + (char)c;
     	}
        else 
        {
        	s1 = s1 + (char)c;
        }


     }
  
    }

	public static void main(String[] args) {
		String s = "premKushwah";

		
		ToUpperCase obj = new ToUpperCase();
		obj.toUpperCase(s,s.length());

		   System.out.println(s1);
		
	}
}