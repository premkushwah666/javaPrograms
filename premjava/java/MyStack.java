class Stack
{
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		ms.pop();
		System.out.println(ms);
		ms.isEmpty();

	}
}

class MyStack
{
	private int size,top;
	private int arr[];

	MyStack()
	{
        size = 5;
        arr = new int[5];
        top = -1;
	}

	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}

	public boolean isFull()
	{
        if(top==size-1)
			return true;
		else
			return false;
	}

    public void empty()
    {
    	size = -1;
    }

    public String toString()
    {
    	String s = "";
    	if(isEmpty())
    	{
            return s;
    	}
    	for(int i=0; i<=top; i++)
    	{
    		s = s +" "+ arr[i];
    	}
     return s;

    }

	public void push(int val)
	{
        if(!isFull())
        {
        	arr[++top] = val;
        }  

	}

	public int pop()
	{
        if(isEmpty())
        {
        	return -1;
        }
            top--;
        	return arr[top];
	}
}