public class Link1{

private int rollNumber;
private String name;

public void set(int rollNum,String s){
rollNumber=rollNum;
name=s;
}

public void get()
{
    Link1 o = new Link1();
    System.out.println("roll num is"+rollNumber+"\nname is ="+name);

}

} 