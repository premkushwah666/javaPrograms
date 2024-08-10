public class AreaOfCircle
{
	public float area(int r){
	return (float)3.14*r*r;
}

public static void main(String[] args) {

	 	AreaOfCircle obj= new AreaOfCircle();
		System.out.println(obj.area(2));
	}	
}