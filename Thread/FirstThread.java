class MyHeap<T extends Comparable<T>>
{
	private ArrayList<T> list;

	public MyHeap()
	{
		list = new ArrayList<>();
	}

	private void swap(int first,int second)
	{
		T temp = list.get(first);
		list.set(first, list.get(second) );
		list.set(second,temp);
	}

	int parent(int index)
	{
		return (index-1)/2;
	}

	int left(int index)
	{
		return index * 2 + 1;
	}

	int left(int index)
	{
		return index * 2 + 2;
	}

	public void insert(T value)
	{
	    list.add(value);
	    upHeap(list.size()-1);
	}

	private upHeap(int index){
		if(index<=0)
			return;
		int parent = parent(index);
		//+ve ans aaya mltb this(jisse call kiya ) vo ada h
		if(list.get(index).compareTo(list.get(parent))<0)//list.get(parent)>list.get(index)//minHeap
		{
			swap(index,parent);
			upHeap(parent);
		}
	}

	public T remove()throws Exception{

		if(list.isEmpty())
		{
			throws new Exception("romoving from an empty heap");
		}

		T temp = list.get(0);//only getting not deleting 

		T last = list.remove(list.size-1);//setting 0th <- last value and removing last value

		//** agar vo last element hua to usko kyu add kru
		// in other words vo last lement nhi hona chahiye
		if(!list.isEmpty())//if it was last element (no need to heapify)
		{
			 list.set(0,last);
			downHeap(0);
		}

		return temp;
	}

	private void downHeap(int index)
	{
		int min = index;
		int right = right(index);
		int left = left(index);

		if(right<list.size() && list.get(min).compareTo(list.get(right))>0)
			index = right;
		
		if(left<list.size() && list.get(min).compareTo(list.get(left))>0)
			index = right;
		
		if(min!=index)
		{
			swap(index,min);
			downHeap(min);
		}
	}

	public ArrayList<T> heapSort() throws Exception{
		ArrayList<T> data = new ArrayList<>();
		while (!list.isEmpty()) {
			data.add(this.remove());
		}
		// list = data;
		return data;
	}


}

class Test{
	public static void main(String[] args) {
		MyHeap<Integer> heap = new MyHeap<>();
		heap.indert(10);
		heap.indert(40);
		heap.indert(20);
		heap.indert(80);
		System.out.println(head.remove());
	}
}