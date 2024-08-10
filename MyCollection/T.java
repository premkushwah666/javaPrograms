import java.util.*;

class C implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		if(o1 instanceof Student )
		{
			 Student s2= (Student)o2;
  			 Student s1= (Student)o1;
             return s2.marks-s1.marks;              
		}
		else
		{
			Integer i1 = (Integer)o1;
			Integer i2;

			if( o2 instanceof Student)
			{
				Student s= (Student)o2;
				i2 = s.marks;
			}
			else
			{
				i2 = (Integer)o2;
			}


			return i1-i2;
		}
	}
}

class T
{
	public static void main(String[] args) {
		// ArrayList a1 = new ArrayList();
		// ArrayList a2 = new ArrayList();
		// Collection c = new ArrayList();

		PriorityQueue pq = new PriorityQueue(10,new C());

		Student s1 = new Student(5,"prme","IT55",80);
		Student s2 = new Student(3,"jaya","BCA54",33);
		Student s3 = new Student(1,"raja","CS51",75);
		Student s4 = new Student(2,"shiv","PH53",33);
		Student s5 = new Student(4,"prme","BCOM52",80);
		

		pq.add(s1);pq.add(s2);pq.add(s3);
		pq.add(33);
		pq.add(s4);pq.add(s5);
		pq.add(18);
		pq.add(100);
		System.out.println(pq);

		// pq.add(50);
		// pq.add(50);
		// pq.add(30);
		// pq.add(10);
		// pq.add(10);
		// pq.add(40);
		// pq.add(10);
		// pq.add(10);
		// pq.add(10);
		// pq.add(20);
		// pq.add(20);
		// pq.add(20);
		// System.out.println(pq);

		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// a2.add(10);
		
		// a1.add(0,"prem");

		// c.add(90);
		// System.out.println(pq);



		// (c).add(1,66); it would not work
		// ((ArrayList)c).add(1,66); it work




		// System.out.println(a1.hashCode());
		// System.out.println(a2.hashCode());
		
		// a1.retainAll(a2);//jo esme hoge vahi bachege

		// System.out.println(a1);
		// System.out.println(a2);
		// System.out.println(c);
		// System.out.println(a1.equals(a2));

		// Iterator i = a1.iterator();
		// while(i.hasNext())
		// {
		// System.out.print(i.next()+" "); 
		// }

		

	}
}