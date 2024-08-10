public class GroupReverse{

static String s = "my name is prem kushwah";
static String s1 = "";




	public static void main(String[] args) {


	GroupReverse ob = new GroupReverse();
	int i=0,g=2,j=g;
    //System.out.println(ob.reverse());
    while(j<s.length())  
    {
    	s1 =  s.substring(i,j)+ s1;
    	j+=g;
    	i+=g;	
    }
    //s1 = s1 + " " + s.substring(i+1,j);
    System.out.println(s1);

	}
	
}

/*public class GroupReverse{

static String s = "my name is prem kushwah";
static String s1 = "";

// String reverse(String s,int start,int end){
// return "pl";
// }



	public static void main(String[] args) {

	GroupReverse ob = new GroupReverse();
	int i,j = s.length();
    //System.out.println(ob.reverse());
    for(i=s.length()-1; i>=0; i-- )  
    {
    	if(s.charAt(i)==' ')
    	{
    		s1 = s1+ s.substring(i,j);
    		j=i;
    	}
    }
    s1 = s1 + " " + s.substring(i+1,j);
    System.out.println(s1);

	}
	
}*/