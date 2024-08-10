
class list
{
	public static void main(String[] args) {
		MyArrayList m1 = new MyArrayList();
		MyArrayList m2 = new MyArrayList();
     //  Scanner sc = new Scanner(System.in);
       	

		
		
		// m1.add(new Sample(10));
		// m1.add(new Sample(20));

		// m2.add(new Sample(30));
		// m2.add(new Sample(20));

		// m2.add(m1);
		// System.out.println(m2);


		// m1.add("p");
		// m1.add(11.2);
		// m1.add("prem");
		//  m1.clear(); 
		 // error arry index of of bound
	//	System.out.println(m1);//p2

		//to delete the number;
		//m1.update("prem","jaya");
       // m1.delete(11.2);
       // System.out.println(m1); 


		//System.out.println(m1.indexOf("p"));
		
		// System.out.println(m1.contains(20)); 
		// System.out.println(m1.contains(0)); 
		// MyArrayList m = new MyArrayList(m1);
		// m.add("20");
		// m.add("prme");
		// m.add(11);
		// System.out.println(m);//print 1


		// m.addAll(m1);
		// System.out.println(m);//p3
		// System.out.println(m.getSize());
        // System.out.println(m.getCapacity());
		

	}
};

class MyArrayList
{
    private Object values[];
	private int capacity;
    private int size;

	MyArrayList(int x)
	{
		capacity = x;
		values = new Object[capacity];///////////1problem////////////////////
		//solution arry ka uper object nhi bana tha to object banaya h
		size = -1;
	}

	MyArrayList()
	{
	    this(5);
	}

	MyArrayList(MyArrayList ob)
	{
		this();//problem two ager ye nahi likha hogo to arry initialize hi ni hoga 
		add(ob);
	}


	public int indexOf(Object val)
	{
		for (int  i=0; i<=size; i++)
		{	
			//equals method by class kra h sir ne nhi aaya override krne through sample class
			// solution samjane ke liye diya tha sir ne
			if (values[i].equals(val)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(Object val)//we can say isExixts
	{
		return indexOf(val)==-1?false:true;
	}

	public void delete(Object val)
	{
		int index = indexOf(val);
		if(index!=-1)
		{
			for(int i=index; i<=size; i++)
			{
   				values[i]=values[i+1];
			}
			size--;
		}	
	}

	public void clear()
	{
		size = -1;
	}

	public void update(Object val,Object replacement)
	{
		int index = indexOf(val);
		if(index!=-1)
		{
			values[index]=replacement;			
		}	
		else
			System.out.println("not exists");
		
	}



	public void addAll(MyArrayList mal)
	{
		for(int i=0; i<=mal.size; i++)
		{
			add(mal.get(i));
		}
      
	}


    public int getCapacity()
    {
    	return capacity;
    }

    public int getSize()
    {
    	return size+1;
    }

    public void increaseCapacity()
    {
    	capacity+=5;
    	Object tempArr[] = new Object[capacity];
    	for (int i=0; i<=size; i++) {
    		tempArr[i] = values[i];
    	}
    	values = tempArr;
    }

	public void add(Object ob)
	{
		if(size==capacity-1)
		{
			increaseCapacity();
			//System.out.println("full");
		}
		values[++size] = ob;
	}

	public Object get(int index)
	{
		try
		{
		return values[index];
		}
		catch(Exception e)
		{
	    return null;
		}
	}

	public String toString()
	{
		String s ="";
		
		if(size==-1)
		return "list is empty";

		for (int i=0; i<=size; i++) {
			s = s +", "+ get(i);
		}
		return "["+s.substring(1)+"]";
	}



}


//only for unerstanding purpuose sir teached us
/*class Sample
{
	int a;
	Sample(int s)
	{
		a=s;
	}

	public boolean equals(Object ob)
	{
		if (ob instanceof Sample) {
			Sample s = (Sample)ob;
			return a==s.a;
		}
		return false;
	}

	

}*/
