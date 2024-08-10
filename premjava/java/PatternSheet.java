/*
improt java.util.Scanner;
class Pattern
{
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	public static void main(String[] args) {
		for (int i=1; i<=n ; i++) {
			for (int j=1; j<=n ; j++) {
							
			}
			
		}
	}
}*/



import java.util.Scanner;
class One
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=1; i<=n ; i++){
			for (int j=1; j<=n ; j++){
			System.out.print("@");				
			}
			System.out.println("");	
		}

	}
}

class Two
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
		for (int i=1; i<=n ; i++) {
			for (int j=1; j<=n ; j++) {
				if (i+j<n+1) {
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}							
			}
					System.out.print("\n");	
		}   
	}
}

class Three
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
		for (int i=1; i<=n ; i++) {
			for (int j=1; j<=n ; j++) {
				if (i+j<n+1) {
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}							
			}
					System.out.print("\n");	
		}   
	}
}

class four
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
		for (int i=1; i<=n ; i++) {
			for (int j=1; j<=n ; j++) {
				if (i<j) {
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}							
			}
					System.out.print("\n");	
		}   
	}
}


