//join demo -> demon 

import java.util.*;

class MyThread extends Thread
{
    public void run()
    {
  	    for (int i=0; i<10; i++) {
  		System.out.println("Seethe thread");
  			try{
  				// this.join();
  				Thread.sleep(500);
  		    }
  		    catch(InterruptedException e)
  		    {

  		    }
    	}
    }
}

class JoinDemo
{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=0; i<10; i++) {
  		System.out.println("rama thread");



  		try{
  				// Thread.sleep(500);

  			//after printing one time rame it is or current thread is to t
  				t.join();

  		    }
  		    catch(InterruptedException e)
  		    {

  		    }
    	}

	}
}