// import java.util.Collections;
import java.util.*;

class CompareMarks implements Comparator<Student>
{
   public int compare(Student o1,Student o2)
   {
 
   	   return o2.marks-o1.marks;   	   
   }	
}

class CompareMarksNameId implements Comparator<Student>
{
   public int compare(Student o1,Student o2)
   {
   	   if(o1.marks==o2.marks)
   	   {
   	   	 if(o1.name.compareTo(o2.name)==0)
   	     return o1.id-o2.id;
   	 	 else
   	 	 return o1.name.compareTo(o2.name);	
   	   }
   	   else
   	   return o2.marks-o1.marks;   	   
   }	
}

public class ComparatorExample
{

	public static void main(String[] args) {

		Student s1 = new Student(5,"prme","IT55",80);
		Student s2 = new Student(3,"jaya","BCA54",33);
		Student s3 = new Student(1,"raja","CS51",75);
		Student s4 = new Student(2,"shiv","PH53",33);
		Student s5 = new Student(4,"prme","BCOM52",80);
		ArrayList<Student> al = new ArrayList<>();

		al.add(s1);al.add(s2);al.add(s3);al.add(s4);al.add(s5);

		//Collections.sort(al); //sorting by comparable 
		System.out.println(al);

		Collections.sort(al,new CompareMarksNameId());
		System.out.println(al);


	}
}

class ComparatorAnnoynmsExample
{

	public static void main(String[] args) {

		Student s1 = new Student(5,"prme","IT55",80);
		Student s2 = new Student(3,"jaya","BCA54",33);
		Student s3 = new Student(1,"raja","CS51",75);
		Student s4 = new Student(2,"shiv","PH53",33);
		Student s5 = new Student(4,"prme","BCOM52",80);
		ArrayList<Student> al = new ArrayList<>();

		al.add(s1);al.add(s2);al.add(s3);al.add(s4);al.add(s5);

		Collections.sort(al,new Comparator<Student>(){

			@Override
			public int compare(Student s1,Student s2)
			{
				return s1.id-s2.id;
			}
		});
		System.out.println(al);


	}
}