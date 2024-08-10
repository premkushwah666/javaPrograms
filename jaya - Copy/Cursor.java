abstract class Abs{
	 private int x;
	abstract public void pub();
	abstract protected void pro();
	abstract void def();
	//error: illegal combination of modifiers: abstract and private
	// abstract private void pri(){
	// 	System.out.println("pri");
	// }
	private void pri(){
		System.out.println("pri");
	}

}

class Cursor extends Abs{

	public void pub(){
		System.out.println("pub");
	}
	protected void pro(){
		System.out.println("pro");
	}
    void def(){
		System.out.println("def");
	}
	 void pri(){
		System.out.println("pri");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
}