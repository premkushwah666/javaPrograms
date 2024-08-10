import java.util.Stack;

// interface P{
// 	 public static final float pie = 3.14;
// 	 void prem();
// }

public class StackDemo //implements P
{
	static void main(String[] args) {
		Stack s = new Stack();
		s.push(20);
		s.add(null);
		s.add(0,"pk");
		s.pop();
		s.addElement("addElement");
		System.out.println(s);
		System.out.println("20 is at "+s.search(20)+" postion");
		System.out.println();

		

	}
}