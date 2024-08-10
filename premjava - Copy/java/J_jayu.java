//  class Test
//  {
//  	public static void main(String[] args) {
//  		int n=5,s=1;
//  		for(int i=1;i<=10;i++)
// 		{
// 			s=n*i;
// 			System.out.println(s);
// 	    }
// 	}
// }


class Test
{
	public static void main(String[] args) {
		int i,n=153,c=0;
		while(n!=0){
			c++;
			n=n/10;
		}
			System.out.println(c);
	}
}