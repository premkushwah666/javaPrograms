class Jayu{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.set(3,50);
		//al.add(0,50);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
	}
}