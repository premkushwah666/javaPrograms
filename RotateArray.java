import java.util.Scanner;

//bad me ye condition samj me aayi ki agar array me kam elements h or vo jayada bada number de raha h to
// k ko % le lo length se;

class RotateArray
{
	public static int[] RoateArrayByKSteps1(int[] arr,int k)
	{


		while(k--!=0)
		{
			int temp = arr[arr.length-1];
			for (int i=arr.length-1; i>0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
		}

 		return arr;
	}

	public static int[] RoateArrayByKSteps2(int[] arr,int k)
	{

		int[] t = new int[arr.length];
		int size = arr.length;
		k = k%size;
		//0123456index
		//1234567
		//7123456
		int y=0;
		int i = size-k;
		int x = i;
		t[y++] = arr[i];
		 i = (i+1)%size;

		 while(i!=x)
		 {
		 	t[y++] = arr[i];		 	
		    i = (i+1)%size;	
		 }
			
 		return t;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		for (int i : arr) 
			System.out.print(i+" ");
		
		System.out.println("\nEnter no.");
		// arr = RoateArrayByKSteps1(arr,sc.nextInt());// more time complexity
		arr = RoateArrayByKSteps2(arr,sc.nextInt());   // using space less time complexity
	
		for (int i : arr) 
			System.out.print(i+" ");
	
	}
}