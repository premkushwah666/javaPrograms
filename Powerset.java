import java.util.Scanner;
import java.util.ArrayList;
//////////////////////////////////////////wrong/////////////////////////////
class Powerset
{

    public static ArrayList subsets(int[] nums)   
    {
    ArrayList res = new ArrayList();
    res.add(new ArrayList()); 

    for (int i : nums) {
    	int size = res.size();
    	for (int j=0; j<size; j++) {
    		ArrayList temp = new ArrayList();
    		temp.add(res.get(0));
    	//temp.add(i);
    		res.add(temp);
    	}
    }
     return res;
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int[] arr = new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter element "+(i+1));
			arr[i] = sc.nextInt();
		}

		// for(int i: arr)
		// System.out.print(i+" ");

		System.out.println(subsets(arr));
		

	}
}