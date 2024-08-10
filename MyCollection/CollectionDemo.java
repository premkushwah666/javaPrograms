import java.util.*;

 public class CollectionDemo
{
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();

		for(int i=0; i<=10; i++)
		c1.add(i);
	    System.out.println(c1);

		for(int i=6; i<=20; i++)
		c2.add(i);

		c1.addAll(c2);
		// System.out.println(c1);

		// c1.retainAll(c2);
		// System.out.println(c1);

		// c1.remove(14);
		// System.out.println(c1);

		// System.out.println(c1.contains(14));
		// System.out.println(c1.contains(18));

		// Collection c3 = new LinkedList(c2);
		 Collection c3 = new TreeSet(c1);
  		
  		c1.clear();
  		System.out.println(c1.isEmpty());
  		System.out.println(c1.size());
  		System.out.println(c2.size());
  		System.out.println(c3.size());


  		Iterator it = c3.iterator();
  		Integer temp;
  		while(it.hasNext())
  		{
  			if((temp=(Integer)it.next())!=14)//next se ek baar hi access hoga 
  			System.out.print(temp+" ");//and then uspe remove aa jata h 
  			else
  			it.remove();
  		}

  		// Object[] a = c3.toArray();//ye directly convert ni hora 
  		// for(int i=0; i<a.length; i++)
  		// {
  		// 	int x = (int)a[i];
  		// 	System.out.println(x);
  		// }







	}
}