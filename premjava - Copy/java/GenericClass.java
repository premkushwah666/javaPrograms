class Generic
{
	public static void main(String[] args) {
		Task<Integer> t = new Task<Integer>();

		t.setValue(20);
		int i = t.getValue();
		System.out.println(i);

		// t.setValue("prme");
	}
}

//bas yaha pr ek variaable define kr diya h jisse sab working ho ri h 
//T <-> Integer 
class Task<T>
{
	T ob;
   public void setValue(T ob)
   {
   	    this.ob = ob;
   }
   public T getValue()
   {
   	return ob;
   }
}