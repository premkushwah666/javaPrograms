public class MaxSubString
{

	public static boolean isVowel(char c)
	{
		String v = "aeiouAEIOU";

		for (int j=0; j<v.length(); j++)
		{
			if(v.charAt(j)==(c))
			{
				return true;	
			}
							
		}	
		return false;		

	}

	public static void main(String[] args) {
		String s = "aeistvwouueiouplksdjloooooooi";
		int first=0,last=0;
		int l=0,lastLength=0;
		String sub = "";		

		for (int i=0; i<s.length(); i++) 
		{
			if(isVowel(s.charAt(i)))
			{
			    first = i;
			    i++;
			    while( i<s.length() && isVowel(s.charAt(i)) )
		     	{                      
		     		i++;

			    }
			    last = i;

			    l =  last-first;

			    if(l>lastLength)
			    sub = s.substring(first,last);

			}  

		}
		System.out.println(sub);
	}
}
