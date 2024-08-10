class CURD
 {
	private int capacity;
	private int size;
	private Object values[];
	boolean isDuplicate;
	CURD()
	{
		this(5);
	}

	CURD(boolean duplicate)
	{
		this(5);
		isDuplicate = duplicate;
	}
	 CURD(int cap)
	 {
	 	this (cap,true);
	 }
	CURD(int cap,boolean duplicate)
	{
		capacity =cap;
		size =-1;
		isDuplicate = duplicate;
		values=new Object[capacity];
	}
	public int capacity()
	{
		return  capacity;
	}
	public int size()
	{
		return size +1;
	}

		 public void  increaseSize()
		 {
				capacity+=5;
				 Object temp[]=new Object[capacity];
				 for (int i=0;i<=size ;i++ )
					{
						 temp [i]=values[i];   
					}
					values=temp;
		 } 

				public void add(Object val)
				{
					if (size +1==capacity)
					{
						increaseSize();
					}
					if(isDuplicate)
					values[++size]=val;
				   else 
				   {
				   	values[++size]=val;
				   }
				}
				public Object valueof(int index)
				{
					if (index<0|| index>size)
						return null;
					return values[index];
				}

					 public int indexof(Object val)
					 {
						for (int i=0;i<=size ;i++)
						 {
						if(values[i].equals(val))
						return i;
					}
						return -1;
					 }	

         public String toString()
         {
        String s="";
       for (int i=0;i<=size ;i++ ) 
       {
	  s= s+", "+values[i];

	}
	  return"["+s.substring(2)+"]";

	}

}

	class Test
	{
			 public static void main(String[] args) {
			 CURD c=new CURD(100);
			
				  c.add("10");
				   c.add("20"); 
				   c.add("30"); 
				   c.add("40");
				   c.add("50");
				   c.add("50");

				  
						System.out.println(c);
			} 
	}

	
	class Std
	{
		String name,mobile;
		int roll;
		Std(String n, String m ,int r)  
		{
			name =n;
			mobile =m;
			roll=r;
		}

            
        public boolean equals(Object ob)
        {
        	if (ob instanceof Std)
        	{
        		Std s=(Std)ob;
        		return this.roll==s.roll&& this.name.equals(s.name)&& this.mobile.equals(s.mobile);

        	}
        	 else 
        	 {
        	 	return false;

        	 }
        }

		public String toString()
		{
			return "{"+name+","+mobile+","+roll+"}";
		}

	}


/*

class CURD
{
	private int capacity;
	private int size;
    private Object values[];
CURD()
{
	this(5);
}

CURD(int cap)
{
	capacity = cap;
	size     = -1;
	values   = new Object[capacity];
}

public int capacity()
{
	return capacity;
}	

public int size()
{
	return size + 1;
}

public void add(Object val)
{
	if(size+1==capacity)
		return;
   values[++size]=val;
}



 public String toString()
         {
        String s="";
       for (int i=0;i<=size ;i++ ) 
       {
	  s= s+", "+values[i];

	}
	  return"["+s.substring(2)+"]";
	}
}


class Task
{
	public static void main(String[] args) 
	{
		CURD c = new CURD();
		c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
	}
}


*/






















