import java.util.Arrays;
import java.util.Scanner;

class ArrDemo
{

    static void printArray(int[] arr)
    {
    	for (int i : arr) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    } 

    static int maxInArray(int[] arr)
    {
    	int max = Integer.MIN_VALUE;
    	for (int i=0; i<arr.length; i++) {
    		if(max<arr[i])
    			max=arr[i];
    	}
    	return max;
    }

    static int secondMaxInArray(int[] arr)
    {
    	int max = Integer.MIN_VALUE;
    	int smax = Integer.MIN_VALUE;

    	for (int i=0; i<arr.length; i++) {
    		if(max<arr[i])
    		{
    			smax=max;
    			max=arr[i];
    		}
    		else if(smax<arr[i] && max<arr[i])//&& ki condition se same element ko hata sakte h
    		smax = arr[i];	
    	}
    	return smax;
    }

    static void reverseArray(int[] a, int i ,int j)
    {
    	while (i<j) {
    		a[i] = a[i]+a[j]-(a[j]=a[i]);
    		i++;j--;
    	}
    }
    
    // public static int[] rotateByKSteps(int[] arr,int k)
    // {
        //using Extra Space 
    	// int[] temp = new int[arr.length];
    	// int j=0;
    	//  k = k%arr.length;
    	
    	// for (int i=k; i<arr.length; i++)
    	// {
     //        temp[j++] = arr[i];
    	// }
    	// for (int i=0; i<k; i++)
    	// {
     //        temp[j++] = arr[i];
    	// }

    	// return temp;  
   // }

    public static void rotateByKSteps2(int[] arr,int k)
    {
       
    	//without using exra space
    	 k = k%arr.length;
    	 reverseArray(arr,0,k-1);
    	 reverseArray(arr,k,arr.length-1);
    	 reverseArray(arr,0,arr.length-1);


    }

    static void shortZeroOnceArray(int[] a)
    {
    	int i=0,j=a.length-1;
    	while(i<j)
    	{
    		while(a[i]==0) i++;
    		while(a[j]==1) j--;

    		if(a[i]==1 && a[j]==0)
    		{
    			a[i++]=0;
    			a[j--]=1;
    		}

    	}
    } 

    static void getEvenFront(int[] a)
    {
    	int i=0,j=a.length-1;
    	while(i<j)
    	{
    		while(a[i]%2==0)
    		{
    			//System.out.println(i);
    			i++;
    		} 
    		
    		while(a[j]%2!=0) 
    		{
    		//	System.out.println(j);
    		 	j--;
            } 

    		if(a[i]%2!=0 && a[j]%2==0)
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    			i++;j--;
    		}

    	}
    }


    //prifixSum 
public static void prifixSum(int[] a)
{
	//by me with more time complexity
	/*for(int i=a.length-1; i>=1; i--)
	{ 
		for (int j=0; j<i; j++) {
			a[i] += a[j];
		}
	}*/
	//with less time comlexity
	for(int i=1; i<a.length; i++)
	{
		a[i] += a[i-1];//a[i] = a[i-1] + a[i];
	}

}

public static void suffixSum(int[] a)
{
	for(int i=a.length-2; i>=0; i--)
	{
 	    a[i]  += a[i+1];		
	}
}

public static int rangeSum(int[] a,int right,int left)
{
	prifixSum(a);
    if(left<1)
    	return a[right];
    //  System.out.println("rigth is"+a[right]);
    //  System.out.println("left si"+a[left-1]);

    return a[right]-a[left-1]; 
}

public static void checkPartitioning(int[] arr3)
{

	//somethign went wrong 
	//prifixSum(a);

	// for(int i = 1; i<a.length-1; i++)
	// {
	// 	if(a[i] == (a[a.length-1]-a[i]) );
	// 		return true;
	// }
     // return false;

	//again by me with no return 
	for(int i=0; i<arr3.length-2; i++)
		{

		System.out.println("p"+arr3[i]);
		System.out.println("s"+(arr3[arr3.length-1]-arr3[i]));

		if(arr3[i]==(arr3[arr3.length-1])-(arr3[i]))
		System.out.println("true");
		else
	    System.out.println("false");

	    } 
	

}


public static void main(String[] args) {

		//int a[] = {1,3,4,5,4,6,6,4};
        Scanner sc = new Scanner(System.in);
		//printArray(a);
		// System.out.println(maxInArray(a));
		// System.out.println(secondMaxInArray(a));
		//a=rotateByKSteps(a,sc.nextInt());
		// reverseArray(a,0,a.length-1);
		//rotateByKSteps2(a,sc.nextInt());
		////printArray(a);
		

		// for (int i=0; i<5; i++) {
		// 	a[i]=i*10+5;
		// }

		/*for (int x : a) {
			System.out.println(x);
		}*/


		/*int[] array = {0,1,1,0,1,1,1,0,0,1,0,1,1,0};
		printArray(array);
		shortZeroOnceArray(array);
		printArray(array);*/

       /* int[] array1 = {1,2,3,4,5,6,7,8,9};
		printArray(array1);
		getEvenFront(array1);
		printArray(array1);*/


		//prifixSum
		/*int[] arr = {1,2,3,4,5,6,7,8,9,10};
		printArray(arr);
		prifixSum(arr);
		System.out.println("prifixSum");
		printArray(arr);*/

		//suffixSum
		//int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
		/*int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		printArray(arr1);
		suffixSum(arr1);
		System.out.println("suffixSum");
		printArray(arr1);*/


		//rangeSum
		/*int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		printArray(arr2);
		System.out.println("RangeSum");
		System.out.println("enter no of queries");
		int q = sc.nextInt();
		while(q>0)
		{
			System.out.println("enter right ->");
			int right = sc.nextInt();
			System.out.println("enter left  <-");
			int left = sc.nextInt();
		System.out.println(rangeSum(arr2,right,left));	
			q--;
		}*/

		//check partitionaning the array
		//int [] arr3 = {5,3,2,6,3,1};
		//int [] arr4 = {5,3,2,6,3,1};
		int [] arr3 = {5,3,2,6,3,1,1999};
		//prifixSum(arr3);

		
	    checkPartitioning(arr3); 



	}	
}