class Queue{
	int rear,front;
	Object values[];

	Queue(){
        this(5);
	}

	Queue(int size){
		values = new Object[size];
		rear = front = -1;
	}

	public void insert(Object val){
		if(rear == values.length-1)
		{
			System.out.println("QUEUE IS FULL");
			return;
		}

		if(rear == -1)
		{
			rear = front = 0;
		}
		else
		{
			rear++;
		}
		values[rear] = val;
	}


	public String toString(){
		String s = "";
		if(rear ==-1)
			return"[]";
		for(int i=front;i<=rear;i++)
		{
			s+=","+values[i];
		}
		return "["+s.substring(1)+"]";
	}


	public Object delete(){
		if(front == -1)
		{
			return null;
		}
		Object ob = values[front];

		if(front == rear)
		{
			front = rear = -1;
		}
		else{
			front++;
		}
		return ob;
	}
}

class Test{
	public static void main(String[] args) {
		Queue q = new Queue();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		System.out.println(q);
		System.out.println(q.delete());
		System.out.println(q);
		q.insert(70);
		/*System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.insert(60);
		q.insert(70);
		System.out.println(q);*/
	}
}