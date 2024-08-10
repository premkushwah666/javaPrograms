import java.util.Scanner;



public class p_isVowel{

	private static boolean isVowel(char ch)
	{
	if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    return true;
    else 
    return false;     
    }

    public static void main(String[] args) {
	char ch;
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);
    
    System.out.println(isVowel(ch));
        

	}
}