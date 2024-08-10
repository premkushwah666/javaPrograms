import java.util.Collections;
import java.util.ArrayList;



public class ComparableExample
{
	
	public static void main(String[] args) {

		Student s1 = new Student(5,"prme","IT55",99);
		Student s2 = new Student(3,"jaya","BCA54",33);
		Student s3 = new Student(1,"raja","CS51",75);
		Student s4 = new Student(2,"shiv","PH53",50);
		Student s5 = new Student(4,"Ankul","BCOM52",80);
		ArrayList al = new ArrayList();

		al.add(s1);al.add(s2);al.add(s3);al.add(s4);al.add(s5);

		Collections.sort(al);
		System.out.println(al);

	}
}