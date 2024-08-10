import java.util.Scanner;

public class PercentageCalculator{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 float per=0;
    
    System.out.println("enter number of subjects : ");
    byte n = sc.nextByte();

    for(int i=0; i<n; i++){
      int a =sc.nextInt();
      per += a;
    }
    System.out.println(per/n);
    
}


}