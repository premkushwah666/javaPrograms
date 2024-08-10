import java.util.*;


/*class Test{
	public static void main(String[] args) {
		Object s[] = new Object[5];
		s[0] = "hello";
		s[1] = "hello1";
		s[2] = "hello2";
		s[3] = "hello3";
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		s[3] = "hello";
		for(int i =0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}


class Test1{
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}



class Test2{
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new A                                                                                                                                                                         ccccccccccccccc c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         rrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Integer sum = 0;
		for(int i=0;i<al.size();i++)
		{
			Integer num = (Integer)al.get(i);
			sum = sum+num;
		}
		System.out.println(sum);
	}
}


*/

class Test3{
	public static void main(String[] args) {
		Data<Integer> d = new Data<Integer>();
		d.add(10);
       // d.add("hello");
		//d.add(new Test());
		System.out.println(d.get());
	}
}

class Data<T>
{
	T ob;
	public void add(T ob)
	{
		this.ob = ob;
	}
	public T get()
	{
		return ob;
	}
}