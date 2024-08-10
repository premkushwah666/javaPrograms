class Test{
	public static void main(String[] args) {
		Integer i = new Integer(10);
		System.out.println(i);


		Integer j = new Integer("10");
		System.out.println(j);

		Character c = new Character('a');
		System.out.println(c);

		Float f = new Float(10.2);
		System.out.println(f);

		Float g = new Float("10.2");
		System.out.println(g);

		Float h = new Float(10.5);
		System.out.println(h);

	}
}



class Test1{
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer j = Integer.valueOf(10);
		System.out.println(j);


		/*Integer l = new Integer("10");
		int a = l.intValue(10);
		System.out.println(a);*/

		String s = "10";
		int k = Integer.parseInt(s);
		System.out.println(k);
	}
}


 class Test2{
 	public static void main(String[] args) {
 		int i = Integer.parseInt("10101",2);
 		System.out.println(i);

 		int j = Integer.parseInt("21",8);
 		System.out.println(j);
 	}
 }