class Queue{
	private int rear,front;
	private Object values[];
	Queue(){
	   	this(5);
	}
	Queue(int size){
	 	values =new Object[size];
	   	rear=front=-1;
	}
	
	public void insert(Object val){
		if((front==0 && rear==values.length-1) || rear+1==front)
		{
			System.out.println("Queue is full");
			return ;
		}
		if(rear==-1)
			rear=front=0;
		else{
			rear=(rear+1)%values.length;
		}
		values[rear]=val;
	}
	/*public Object delete(){
		

	}*/
	public String toString(){
		String s="";
		if(rear==-1)
			return "[]";
		int t=front;
		while(t!=rear){
			s=s+","+values[t];
			//System.out.println(values[t]);	
		    t=(t+1)%values.length;
		}
		s=s+","+values[t];
		
		return "["+s.substring(1)+"]";
	}

	
}
class Test{
	public static void main(String[] args) {
	   Queue q=new Queue();
	   q.insert(10);
	   q.insert(20);
	   q.insert(30);
	   q.insert(40);
	   System.out.println(q);
	  
	   System.out.println(q);
	  

	  
	}
}