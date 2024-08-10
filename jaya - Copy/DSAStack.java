class Stack
{
   private Object stk[];
   private int top;

   Stack(){
   	  this(5);
   }
   
   Stack(int size) {
   	  stk = new Object[size];
   	  top = -1;
   }

   Stack(Stack s){
    	this(5);
   	    push(s);
   }

   public int size(){
   	return top+1;
   }

   public int capacity(){
   	return stk.length;
   }

   public void increaseSize()
   {
       int old_size = stk.length;
       int new_size = old_size + 5;
       Object ob[] = new Object[new_size];    //Object Array type class uski parent h object
       for(int i=top;i>=0;i--)
       	ob[i] = stk[i];
       stk = ob;                         //Parent to child is not assign
   }                             

   public void push(Object value){
   	if(top == stk.length-1){
   		/*System.out.println(("STACK IS FULLL"));
   	    return;*/
   	    increaseSize();
   	  }
   	  stk[++top] = value;
   }


   public String toString(){
    String s ="";
    if(top == -1)
    	return "[]";

    for(int i=top;i>=0;i--)
    {
    	s = s+","+stk[i];
    }
    	return "["+s.substring(1)+"]";
   }


   public Object pop(){
       if(top == -1)
       	return null;
       Object ob = stk[top--];
       return ob;
   }


   public Object peak(){
       if(top == -1)
       	return null;
       return stk[top];
   }


   public void push(Stack stack){
   	for(int i=stack.top;i>=0;i--)
   	{
   		push(stack.stk[i]);
   	}
   }


}

class Test{
	public static void main(String[] args) {
		Stack s = new Stack();
	    s.push(10);
	    s.push(20);
	    s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		System.out.println(s);
		/*System.out.println(s.pop());
		System.out.println(s.peak());*/

		/*Stack s2 = new Stack(s);
		s2.push(100);
		s2.push(200);
		s2.push(300);
		s2.push(400);
		System.out.println(s2);*/
		/*System.out.println(s.size());   //0
        System.out.println(s.capacity());   //20*/
	}
}