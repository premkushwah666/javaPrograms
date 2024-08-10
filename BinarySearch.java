class BinarySearch{

	public static int binarySearchRecursion(int a[],int start,int end,int target)
	{
		while(start<=end)
		{
		  int mid=(start+end)/2;
		  if(a[mid]==target)
		  	return mid;
		  else if(a[mid]>target)
		  	return binarySearchRecursion(a,start,mid-1,target);
		  else
		  	return binarySearchRecursion(a,mid+1,end,target);
		}
	return -1;	
	}

	public static int binarySearch(int a[],int target)
	{
		int start =0,end=a.length-1;
		while(start<=end)
		{
		  int mid=(start+end)/2;
		  if(a[mid]==target)
		  	return mid;
		  else if(a[mid]>target)
		  	end=mid-1;
		  else
		  	start=mid+1;
		}
	return -1;	
	}

	public static void main(String[] args) {
		int a[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println(binarySearch(a,13332));
		System.out.println(binarySearchRecursion(a,0,a.length-1,11433));
	}
}
//                               es       
//  0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16