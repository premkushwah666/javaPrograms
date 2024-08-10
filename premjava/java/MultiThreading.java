class MultiThreading
{
	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();
//		mt.setName("prme");
		mt.currentThread().setName("pk");//main thread

		/*System.out.println(Thread.NORM_PRIORITY);//5
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.MAX_PRIORITY);//10*/


		
		for (int i=0;  i<11; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}

class MyThread extends Thread
{
   public void run()
   {
  		for (int j=1; j<11; j++)
  		 {
  		 	//yaha pr name paas kr re ge to name replace ho jata h setname() vali method se
  			System.out.println(Thread.currentThread().getName()+" "+j);
  			//System.out.println("name "+j);
  		}

   }

   /*public void start()
   {
   	super.start();
   	//run();
   }*/
}