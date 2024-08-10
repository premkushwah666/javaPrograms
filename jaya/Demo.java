import java.util.*;
import java.net.InetAddress;

class Demo
{
	public static void main(String[] args) {
		int a=10;
		a++;
		System.out.println(a);
	}
}


class Test
{
	public static void main(String[] args) {
		String s="hellooo";
		String s1 = "";
        for (int i=0; i<s.length(); i++) {
        	s1=s.charAt(i)+s1;
        }
        System.out.println(s1);
	}
}



class T
{
	public static void main(String[] args) {
		String s="Hellooo";
		//char []ch=s.toCharArray();
        //for (int i=0; i<s.length(); i++)
         {
        System.out.println(s.substring(1,3));
       // System.out.println(s.charAt(0));
       // System.out.println(s.isEmpty());
		}
  }
}




class P
{
	public static void main(String[] args) {
		String s="hellooo hyy am jayuuu";
		String s1[] =s.split("hyy");
        for (int i=0; i<s1.length; i++) {
            System.out.println(s1[i]);
		}
  }
}



class Avg
{
	public static void main(String[] args) {
		int sum=0,i;
		int avg=0;
		for ( i=0 ; i<args.length; i++) {
			sum+= Integer.parseInt(args[i]);
		}
            avg=sum/args.length;	
           System.out.println(avg);
	}
}



class IpAddress
{
	public static void main(String[] args) throws Exception
	{
		System.out.println(InetAddress.getLocalHost());
	}
}


 
 //NON STATIC MEMBER KO STATIC AREA ME ACCESSSS>>>>>>>>>>
class J
{
	String s= "hello";
	int a=10;

	 public static void main(String[] args) {
	 	J t = new J();
	 	System.out.println(t.a);
	 	System.out.println(t.s);
	 }
}



//STATIC KO STATIC ME ACCESS KRNA>>>>>>>>>
class K
{
      static String s="hello";
      static int a=10;

      public static void main(String[] args) {
      	K t = new K();
      	System.out.println(t.a);
      	System.out.println(t.s);
      	//or
      	t=null;
      	System.out.println(t.a);
      	System.out.println(t.s);
      	//or
      	System.out.println(a);
      	System.out.println(s);
      }
}



//NON STATIC KO STATIC ME ACCESS KRNA>>>>>>>>>>>
class Data
{
	String s="hello";
	int a=10;
}
class Jk
{
	public static void main(String[] args) {
		Data d=new Data();
		System.out.println(d.a);
		System.out.println(d.s);
		//or
		d=null;
		System.out.println(d.a);
		System.out.println(d.s);
	}
}



//NON STATIC FUN.. ME SE STATIC ME ACCESS KRNA>>>>>>
class Gk
{
	String s="hello";         //(NON STATIC AREA)
	int a=10;
}
class Mk
{
	void fun()
	{
		Gk d=new Gk();                //(NON STATIC AREA)
		System.out.println(d.a);
		System.out.println(d.s);
	}
	  public static void main(String[] args) {
	  	Mk m=new Mk();                            //(STATIC AREA)
	  	m.fun();
	  }
}




class B
{
	public static void main(String[] args) {
		
		Deta d=new Deta();
		//Deta d1=new Deta();

		//System.out.println(d.toString());
		System.out.println(d);
	}
}
class Deta
{
	int a=10;
	public String toString()
	{
		return "JAYUUU";
	}
}






class Hascode
{
	public static void main(String[] args) {
		Std d =new Std();
		Std d1 =new Std();
		//s2.name = "xyz";
		//s2.address = "indore";
		//s2.mobile = "111111111";

		System.out.println(d);
		//System.out.println(s2);
	}
}
class Std
{
	String name="abc",address="nai pata",mobile="000000";
       
      public String toString()
      {
      	return name+","+address+","+mobile;
      }
}




class M
{
	// String s1="hello";
	// String s2="hello";
	public String toString()
	{
		// className@Hascode
		//String s = this.getClass()+"@"+Integer.toHexString(this.hashCode());
		//System.out.println("real ->"+super.toString());

		// return  "My to String -> "+s.substring(6,s.length());
		return  this.getClass().getName()+"@"+Integer.toHexString(this.hashCode());
	}
}

class Memo
{
	public boolean equals(Object o)
	{
		return this==o;
	}

	public static void main(String[] args) {
		M m =new M();
		// M m1 =new M();
		// System.out.println(s1.equals(s2));
		//System.out.println(m);
		int i=1;
		int j=1;
		Integer i1 =127;
		Integer i2 =127;
		Integer i3 = 128;
		Integer i4 = 128;
		String s1 = "prem";
		String s2 = "prem";
		String s3 = new String("prem");
		String s4 = new String("prem");

		System.out.println("primitive");
		System.out.println(i==j);//t//t

		System.out.println("Integer");
		System.out.println(i1==i2);//f//t
		System.out.println(i3==i4);//f//f
		System.out.println(i1.equals(i2));//t
		System.out.println(i3.equals(i4));//t

		System.out.println("String");
		System.out.println(s1==s2);//f//t
		System.out.println(s3==s4);//f//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s3.equals(s4));//t

	}
}




class A
{
	static public void msg()
	{
		System.out.println("hello i am good");

	}
}

class L extends A{
	public static void main(String[] args) {
		msg();
	}
}

class Stud
{
	String name="abc",address="nai pata",mobile="000";

	public String toString()
	{
		return name+","+address+","+mobile;
	}
}






class N
{
 public void msg()
	{
		System.out.println("hello i am good");

	}
}

class O extends N
{
	public void msg() 
	{
		System.out.println("hello hyy");
	}

	public static void main(String[] args) {
		O l=new O();
		l.msg();
	}
}





class Cemo
{

	public static void main(String[] args)
	{
		Integer i1=new Integer(124);
		Integer i2=new Integer(124);
		Integer i= 100;
		Integer j=100;
		Integer k=274;
		Integer l=256;
		int a=10;
		int b=10;
		String s = new String("hello");
		String s1="hello";
		String s2="hello";

        System.out.println(i1==i2);  
		System.out.println(i==j);   //f  //f
        System.out.println(k==l);   //f   //f
        System.out.println(a==b);	//t   //t
        System.out.println(i.equals(j));   //t  
        System.out.println(k.equals(l));   //t
       // System.out.println(a.equals(b));
        System.out.println(s1==s2);      //f
        System.out.println(s1.equals(s2));   //t
        System.out.println(s==s1);
        System.out.println(s1.equals(s2));
	} 
}





class Sample
{
	// String a="jaya";
	// String b="jaya";
	int a=10;
	public boolean equals(Object Ob)
	{
		return a==a;
	}
}

class Pample extends Sample
{
	public static void main(String[] args) {
		Sample ob1 = new Sample();
	    Sample ob2 = new Sample();
	     System.out.println(ob1==ob2);
	    // System.out.println(ob1.equals(ob2));
}
}
	





class E
{
	public void m1()
	{
		System.out.println("E m1");
	}

	public void m2()
	{
		System.out.println("E m2");
	}
}

class C extends E
{
	public void m2()
	{
		System.out.println("C m2");
	}

	public void m3()
	{
		System.out.println("C m3");
	}

	public static void main(String[] args) {
		// E c = new C();
		//c.m1();
		//c.m2();
	    //c.m3();
	     new C().m1();
	     new C().m2();
	     new C().m3();
	      //((C)new E()).m3();
	}
}




class Parent{
	Integer a = 127;
	Integer b = 127;

	String s = "hello";
	String s2 = new String("hello");
}

class Child extends Parent{
	Integer a = 128;
	Integer b = 128;
	public static void main(String[] args) {
		Parent ob = new Child();
		String s1 = "hello";

		System.out.println(ob.a);   //127
		System.out.println(ob.b);   //127

		System.out.println();

		System.out.println(ob.s==s1);      //true
		System.out.println(ob.s.equals(s1));      //true
		System.out.println(ob.s==new Parent().s2);      //false
		System.out.println(ob.s.equals(new Parent().s2)); //true

		System.out.println();

		Child ob1 = new Child();
		System.out.println(ob1.a==ob1.a);   //true
		System.out.println(ob1.b==ob1.b);    //true
		System.out.println(ob.b==ob.a);   //true
        System.out.println(ob.a.equals(ob1.a));   //false
        System.out.println(ob.a==ob1.a);   //false
        System.out.println(ob1.a==ob1.b);     //false
	}
}



class Jaya
{
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1==s2);       //false
		System.out.println(s1.equals(s2));    //true

		System.out.println();

		String s3 = new String("hello");
		String s4 = new String("hello");

		System.out.println(s3==s4);        //false
		System.out.println(s3.equals(s4));    //true
	}
}



class Mitthu
{
	public static void main(String[] args) {
		Integer a = 128;
		Integer b = 128;
		System.out.println(a.equals(b));   //true

		int c = -128;
		int d = -127;
		System.out.println(c==d);     //false

		int e = 129;
		Integer f = 129;
		System.out.println(e==f.intValue());    //true
		System.out.println(f==e);     //true
		System.out.println(e==e);    //true
		System.out.println(f==f);     //true    
	}
}





class Q
{
	Integer a = 127;

	String s = "hello";
	String s1 = new String("hello");

}
class Pitthu extends Q{
	Integer a = 127;
	String s = "hello";
	String s1 = new String("hello");
	String s2 = s + "hiii";

	public static void main(String[] args) {
		Q q = new Pitthu();
		Pitthu ob = new Pitthu();

		System.out.println(q.a==ob.a);    //true
		System.out.println(q.a==Integer.parseInt(ob.s));      //false
		System.out.println(q.s1==ob.s1);     //false
	}
}





class Demo1{
	public static void main(String[] args) {
		Mtd m1 = new Mtd();
		Mtd m2 = new Mtd();
		m1.roll = 1000;
		m2.roll = 1000;
		m2.sal = 20000;
		System.out.println(m1.equals(m2));
	}
}


class Mtd
{
	int roll = 100;
	Integer sal = 20000;
	public boolean equals(Object obj) 
		{
			if (obj instanceof Mtd)
			 {
				Mtd m = (Mtd)obj;
				return this.roll == m.roll && this.sal.equals(m.sal);
			}
			else
				return false;
		}
}



interface I{
}

class F implements I{	
}
class W extends F{
}
class Instance extends W{
	public static void main(String[] args) {
		W ob = new W();
		System.out.println(ob instanceof Instance);
	}
}



class Ku
{
	public static void main(String[] args) {
		String s="hellohii";
		String s1=new String("hello");
	    String s3="hello";
		String s2=new String("hello");
		String s4=s3+"hii";
		final String s5="hello";
		String s6=s5+"hii";
		String s7="hello"+"hii";
		final String s8="Gungun";
		final String s9="jaya";
		final String s10=s8+s9;
		String s11=s10;
		

        System.out.println(s==s1);     //false
        System.out.println(s1==s2);     //false
        System.out.println(s3==s5);       //true
        System.out.println(s==s4);        //false
        System.out.println(s==s6);        //true
        System.out.println(s==s7);        //true
        System.out.println(s10==s11);     //true
    }
}    





class Intern {
	public static void main(String[] args) {
		String s=new String("hello");
		String s1= "hello";
		String s2= s.intern();

		System.out.println(s);
		System.out.println(s.intern());

		String s3="hello";
        String s4="hello";
		String s5=new String(s3);
		String s6=s5.intern();
		System.out.println(s1==s2);     //true   
		System.out.println(s4==s6);      
		System.out.println(s5==s4);     //false
	}
}



class Index{
	public static void main(String[] args) {
		String s= "hello";
		System.out.println(s.indexOf('e'));
	}
}


class Concat{
	public static void main(String[] args) {
		String s="helloo";
		s=s.concat("hii");
		System.out.println(s);
	}
}


class Trim{
	public static void main(String[] args) {
		String s="   hello      ";
		String s1="      jayaa    ";
		System.out.println(s.trim()+"\n"+s1.trim());
	}
}


class CharArr
{
	public static void main(String[] args) {
		String s= "helloo";
		char []ch=s.toCharArray();
		System.out.println(ch);
	}
}



class R
{
	public static void main(String[] args) {
		String s="helloo worlld";
		System.out.println(s.replace('l','L'));
		System.out.println(s.replaceFirst("l","a"));
		System.out.println(s.replaceAll("l","L"));
	}
}


class Replace{
	public static void main(String[] args) {
		String s="hello world";
		char ch='l';
        // s=s.substring(0,1)+ 'e'+s.substring(2,5);
        //  s=s.substring(0,3)+ 'M'+s.substring(4,11);
        // System.out.println(s);
         s=s.substring(0,s.indexOf(ch)+1)+ 'L'+s.substring(s.indexOf(ch)+2,s.length());
         System.out.println(s);
         //  s=s.substring(0,s.indexOf(ch))+ 'L'+s.substring(s.indexOf(ch)+8,s.length());
         // System.out.println(s);    
	}
}



class Replce
{
	public static void main(String[] args) 
	{
		String s="hellllo";
		char []ch=s.toCharArray();
		int r='l';
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==r)
			{
				ch[i]='L';
			}
	    }
	    System.out.println(ch);
	}
}



class StrToChar{
	public static void main(String[] args) {
		String s="hello";
		char []ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
			ch[i]=s.charAt(i);
	System.out.println(ch);
	}
}




class Split{
	public static void main(String[] args) {
		// String list[] = split("hello. how. are. you. are. amazing",". ");
		String list[] = split("hello. how. are. you. are. amazing",". ");
		// Scanner sc = new Scanner(System.in);
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// String[] list = split(s1,s2);
		for(int i=0;i<list.length;i++)
			System.out.println(list[i]);
	}


	public static String[] split(String str,String find){
		String list[]=new String [str.length()];
		int i=0,len=str.length();
		int s=0,l=0;
		while(true){
			l=getLastIndex(str,find,s);
			String sub="";
			if(l==len)
				sub=str.substring(s,len);
			else
				sub=str.substring(s,l-find.length());
			list[i++]=sub;
			s=l;
			if(l==len) break;
		}
		return trimToSize(list);
	}


    public static int getLastIndex(String str,String find,int s ){
    	int len=str.length();
    	for(int i=s;i<len;i++){
    		boolean temp=true;
    	if(str.charAt(i)==find.charAt(0))
    	{
    		// System.out.println(i);
    		for(int j=0;j<find.length();j++)
    		{
    			// System.out.println(j);
    			if(str.charAt(i++) != find.charAt(j))
    			{
    				temp  = false;
    			}
    		}
    			if(temp)
    	            return i;
    	}
    }
    	return len;
}


    public static String[] trimToSize(String[] list){
    	int i=0;
    	for(i=0;i<list.length;i++)
    	{
    		if(list[i]==null){
    			break;
    		}
    	}
    	int c=i;
    	String newList[] = new String[c];
    	for(i=0;i<c;i++){
    		newList[i] = list[i];
    	}
    	return newList;
    }
}




class D1{
	public static void main(String[] args) {
		Emp e=new Emp("Mahesh babu","south","emp001",10000);
	    Emp e1=new Emp("Mahesh babu111","south111","emp001111",10000111);
        Emp e2=new Emp();

        System.out.println(e);
        System.out.println(e1);
	}
}


class Emp{
	private String name,address,id;
	private int sal;
	Emp(String name,String address,String id,int sal)
	{
		this.name=name;
		this.address=address;
		this.id=id;
		this.sal=sal;
	}

	Emp(){
		System.out.println("default");
	}

	public String toString()
	{
		return name+","+address+","+id+","+sal;
	}
}





class Constructor2
{
	public static void main(String[] args) {
		Smp e=new Smp("shraddha","indore",50050);
		Smp e1=new Smp("tiwari","lakhnadon",45000);
		System.out.println(e);
		System.out.println(e1);


		Smp e2=new Smp("shraddha tiwari");
		Smp e3=new Smp("gunniii",5000);
		Smp e4=new  Smp();
		Constructor2 e5=new Constructor2(45000);
	}
		Constructor2()
		{
			this(12);
			System.out.println("super class");
		}
		Constructor2(int a){
			System.out.println(a);
		}
        }
		
	class Smp extends Constructor2{
		private String name,add;
		private int sal;
		Smp(String name,String add,int sal)
		{
		super();
		this.name=name;
		this.add=add;
		this.sal=sal;
	}
	public String toString()
	{
		return name+","+add+","+sal;
	}
	    Smp(String name)

	    {
	    	this("ssss",12);
	    	System.out.println(name);
	    }
	    Smp(String name1,int sal){
	    	super();
	    	System.out.println(name1+","+sal);
	    }
	    Smp()
	    {
	    	System.out.println("Empty constructor");
	 }
	}






class T1
{
	public static void main(String[] args) {
		Dollop d=new Dollop();
		d.m1();
		Dollop.m2();
	}
}

class Dollop{
	int a;
	static int b;

	Dollop()
	{
		System.out.println("dollop constructure");
	}
	{
		System.out.println("dollop non static block");
	}

	static{
		b=10;
		new Dollop();
		System.out.println("dollop static block" + b);
	}
	void m1()
	{
		System.out.println("dollop m1 non static");
	}

	static void m2()
	{
		System.out.println("dollop m2 static");
	}
}

// static 10;    //dollop non static block
// non 			 //dollop constructure
// con 			 //dollop static block" + b)
// non           //dollop non static block
// con           /dollop constructure
// m1				m1
// m2				m2
// no wrong output






//Subclass(inherit from Demo2)
class Test1 extends Demo2{
	public void fun(){
		 // The body of fun() is provided here
		System.out.println("jayyaya");
	}
	public static void main(String[] args){
		System.out.println("helooo");
		Test1 t=new Test1();//creat a Test1 object
		t.fun();
		t.m1();
	}
}

//Abstract class
abstract class Demo2{
	//Abstract method (does not have a body)
	abstract public void fun();
	//Regular method
	public void m1(){
		System.out.println("Jk");
	}
}






// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzzzzzzzzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal{
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The dog says: bhow bhow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myanimal = new Pig();// Create a Pig object
    Animal myanimal1 = new Dog();
    myanimal .animalSound();
    myanimal1 .animalSound();
    myanimal .sleep();
  }
}



abstract class Person{
	Person(){System.out.println("jayyyaa");}
     public abstract void cat();
     public void cute(){
     	System.out.println("cutie");
     }
}

class Teacher extends Person{
	public void cat(){
		System.out.println("pagall");
	}
}

class Employe extends Person{
	public void cat(){
		System.out.println("pagal");
	}
}

class Main1{
      public static void main(String[] args) {
      Person p=new Teacher();
      //p=new Teacher();
      p.cat();
      p=new Employe();
      p.cat();
      p.cute();
      }
}





class Revstr{
	public static String Revstr(String str,int si,int li){
		char chr[] = str.toCharArray();
		while(si<li){
			char ch = chr[li];
			chr[li] = chr[si];
			chr[si] = ch;
			si++;
            li--;
		}
		return new String (chr);
	}

	public static String Rev(String str){
		String newstr="";
		for(int i=0;i<str.length();i++){
		newstr = str.charAt(i)+newstr;
        }
        return newstr;
	}

	public static int getLastIndex(String str,int si){
		while(si<17){
			if(str.charAt(si+1)==' ')
				return si;
			si++;	
		}
		return si;
	}

     public static void main(String[] args) {
     	String s = "heeyy this is jayuuu";
     	// System.out.println(Rev(str));
     	int si=0,li=s.length()-1;
     	 //System.out.println(Revstr(s,si,li));
     	 while(si<s.length()){
     	li=getLastIndex(s,si);
     	s=Revstr(s,si,li);
     	si=li+2;
        }
     	System.out.println(s);
     }
}




interface Rbi
{
	public abstract void getCardInfo();
		
	}
	class sbi implements Rbi{
		public void getCardInfo(){
		System.out.println("sbi info");
	   }
     }
    class pnb implements Rbi{
	public void getCardInfo(){
        System.out.println("pnb info");
	   }
    }
    class kotak implements Rbi{
	public void getCardInfo(){
		System.out.println("kotak info");
	    }
     }
    class hdfc implements Rbi{
	public void getCardInfo(){
		System.out.println("hdfc info");
	  }

  }   
class Test4 
{
   public static void main(String[] args) throws Exception 
   {
   	 Class c = Class.forName(args[0]);
   	 Object ob = c.newInstance();
   	 Rbi rbi = null;

   	 if (ob instanceof Rbi)
   	 {
   	 	rbi = (Rbi) ob;

   	 	 System.out.println(rbi);
   	 	 rbi.getCardInfo();
   	 }

   	 else{
   	 	   System.out.println("invalid card");
   	    }
    }
}





/*class Test5
{
	public static void main(String[] args) {
		String s = "flow fls float flour";
		int i=0;
		String strArr[] = s.split(" ");
		  for(i=0;i<strArr[0].length();i++);;
		  {
		  	if(checkChar(strArr,i))
		  	{
		  		System.out.print(strArr[0].charAt(i));
		  	}
		  	else
		  	{
		  		break;
		  	}	
		  }
		}
        
		  public static boolean checkChar(String s[],int i)
          {
          	char ch = s[0].charAt(i);
          	for(int j=0;j<s.length;j++)
          	{
          		if(i<s[j].length() && s[j].charAt(i)!=ch)
          		{
          			return false;

          		}
          	}
          	return true;
          	
          }

        }



*/

class StrAss
{
	public static void main(String[] args)
	 {
		String ch[] = {"Hello","This","Is","Dollop"};
		
		int key;
		for(int i=0;i<ch.length;i++)
		{
			key = i;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j].compareTo(ch[key])< 0)
				 {
				 	key = j;
				 }
		
			}
			if(key!=i)
			{
				String t = ch[key];
				ch[key] = ch[i];
                ch[i] = t;
			}


               System.out.println(ch[i]);
		}
		
	}
}




class Ass 
{
	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvbnm";
		char ch[] = s.toCharArray();
		int key;
		for(int i=0;i<ch.length;i++)
		{
			key = i;
		      for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[key])
					key = j;
			}
			if(key!=i)
			{
				char t  = ch[key];
				ch[key] = ch[i];
				ch[i]   = t;
			}	

			System.out.println(ch[i]);
		}
	}
}

	


class Char
{
	public static void main(String[] args) {
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
			System.out.println(a);
	}
}



class Assp 
{
	public static void main(String[] args) {
		int ch[] = {3,4,4,3,4,3,3,6,1,4,5,6};
		int key;
		for(int i=0;i<ch.length;i++)
		{
			key = i;
		      for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[key])
					key = j;
			}
			if(key!=i)
			{
				int l  = ch[key];
				ch[key] = ch[i];
				ch[i]   = l;
			}	
			System.out.print( ch[i] + " ");
		}
	}
}


class Pro
{
	public static void main(String[] args) {
		int a[]={1,34,35,3,4,3,3,3,3,3,5,5,7};
		a=deleteValFromArray(a,6);
		for(int i:a)
			System.out.println(i+" ");
	} 
                                                     

    public static int count(int a[],int val)
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==val)
        		c++;
        }
        return c;
    }


	public static int[] deleteValFromArray(int a[],int val)
	{
		int c=count(a,val);
		int j=0;     
		int newArr[] = new int[a.length-c];
		if(c!=0)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=val)
				{
					newArr[j++]=a[i];
				}
			}
		}
		return newArr;
	}
}




class Copy{
	public static void main(String[] args) {
		int a[]={1,3,45,677,77};
		int b[];//=Copy(a);//deep copy
		// b=a; //shallow copy
		b=Arrays.copyOf(a,a.length);
		b[0]=18;
		for(int i:a)
		System.out.print(i+" ");
		System.out.println();		
	    for(int i:b)
		System.out.print(i+" ");
	}

	public static int[] Copy(int a[]){
		int j=0;
		int newArr[] = new int[a.length];
		for(int i=0;i<a.length;i++){
          newArr[j++]= a[i];
		}
		return newArr;
	}
}



class Fre{
	public static void main(String[] args) {
	    int a[]={-1,2,2,2,2,2,2,2,-1,14};
       	int c=0,v=-1;
       	int fr[]=new int[a.length];
       	 for(int i=0;i<a.length;i++)
       	 {
       	 	for(int j=i+1;j<a.length;j++)
       	 	{
       	 		if(a[i]==a[j])
       	 		{
                   c++;
                   fr[j]=v;
                }   
           }
           if(fr[i]!=v)
           fr[i]=c;
        }

       for(int i=0;i<fr.length-1;i++)
       	if(fr[i]!=v)
       	System.out.println(a[i]+" "+fr[i]);
   }
}



class Dubli{
	public static void main(String[] args) {
		int [] a={2,2,2,4,5,6,3,3,3,8,8,8};
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] == a[j])
                System.out.print(a[j]+" ");
			}
		}
	}
}




class MyArray
{
	public static void main(String[] args) {
		Myarr m = new Myarr();
         m.add(11);
         m.add(12);
         m.add(13);
         m.add(14);
         m.add(15);
        System.out.println(m);
	}
}

class Myarr{
	private Object values[];
	private int index;
	Myarr(){
		index = -1;
		values = new Object[3];
	}

	// when same code so we can like this broooo............
	// { index=-1; }

/*	Myarr(int size)
	{
		index = -1;
         values = new Object[size];
	}*/

	public String toString(){
		String s="";
		if(index==-1)
			return"[]";
		for(int i=0;i<=index;i++)
		{
			s=s+","+values[i];
		}
		return "["+s.substring(1)+"]";
	}

	public Object get(int i){
		if(i>index)
			return null;
		else if(i < 0)
			return null;
		else
			return values[i];
	}

	public int length()
	{
		return index+1;
	}


	public void resizeArray()
	{
		Object temp[] = new Object[values.length+5];
		for(int i=0;i<=index;i++)
		{
		     temp[i] = values[i];
		}
		values = temp;
	}

	public void add(Object val){
		if(index==values.length-1)
         {
               resizeArray();
         }
			values[++index] = val;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	public int capacity(){
		return values.length;
	}
}







class Otd
{
	private String name,roll,mob,add;
		Otd(String name,String roll,String mob, String add)
		{
			this.name=name;
			this.roll=roll;
			this.mob=mob;
			this.add=add;

		}
		Otd(String roll)
		{
			this.roll=roll;

		}
		public boolean equals(Object ob)
		{
			Otd s=(Otd)ob;
			if(this.roll.equals(s.roll))
			{
				return true;
			}
			else{
				return false;
			}

		}
		public String getName()
		{
			return name;
		}
		public String toString()
		{
			return "\n("+name+","+roll+","+mob+","+add+")";
		}

	}
class Test9
{
	public static void main(String[]args){
		MyArrayy m=new MyArrayy();
		Otd s1   =new Otd("ram","101","6261112448","tamil");
		Otd s2   =new Otd("sita","102","6261112448","tamil");
		Otd s3   =new Otd("laksh","103","6261112448","tamil");
		Otd s4   =new Otd("love","104","6261112448","tamil");
		m.add(s1);
		m.add(s2);
		m.add(s3);
		m.add(s4);
		System.out.println(m);
		Otd s5=new Otd("108");
		System.out.println(s5);
		int i=m.search(s5);
		System.out.println(i);
		System.out.println(m.get(2));
		System.out.println(s4);
	}
}
class MyArrayy
{
	private Object values[];
	private int index;
	MyArrayy()
	{
		index =-1;
		values=new Object[5];
	}
	public int search(Object val)
	{
		for(int i=0;i<=index;i++)
		{
			if(val.equals(values[i]))
			{
				return i;
			}
		}
		return -1;
	}
	public void addAll(MyArrayy m)
	{
		for(int i=0;i<m.length();i++)
		{
			add(m.get(i));
		}
	}
	public Object get(int i)
	{
		if(i>index)
			return null;
		else if(i<0)
			return null;
		else
			return values[i];

	}
	public String toString()
	{
		String s="";
		if(index==-1)
			return"[]";
		for(int i=0;i<=index;i++)
		{
			s+=","+values[i];
		}
		return "["+s.substring(1)+"]";
	}
	public void resizeArray()
	{
		System.out.println("Increased array");
		Object temp[]=new Object[values.length+5];
		for(int i=0;i<=index;i++)
		{
			temp[i]=values[i];
		}
		values =temp;
	}


	public void add(Object val)
	{
		if(index==values.length-1)
		{
			resizeArray();

		}
		values[++index]=val;
	}
	public int capacity()
	{
		return values.length;
	}
	public int length()
	{
		return index+1;
	}
}




/*class Smp
{
  private String name,id,mob,address,company;
  private int sal;


  Smp(String name,String mob,String address,String company,int sal)
  {
    this.name=name;
    this.mob =mob;
    this.id  =id;
    this.address =address;
    this.company =company;
    this.sal =sal;
  }

  Smp(String name,String id,String mob,String address)
  {
    this.name=name;
    this.mob=mob;
    this.id=id;
    this.address=address;
    this.company="berojgar";
    this.sal=0;
  }

  Smp(){}
  Smp(String id){ this.id =id;}
  Smp(String id,String name){
    this.id=id;
    this.name=name;
  }

  public String toString()
  {
    return"\n("+name+","+id+","+mob+","+address+","+sal+","+company+")";

  }
  public boolean equals(Object ob)
  {
    if(ob instanceof Smp)
    {
      Smp e = (Smp)ob;
      return this.id.equals(e.id);
      //return id.equals(e.id)&& name.equals(e.name);
    }
    return false;
    }

    public void setName(String name)
    {
      this.name=name;
    }
    public void setId(String id)
    {
      this.id=id;
    }
    public void setMOb(String mob)
    {
      this.mob=mob;
    }
    public void setAddress(String address)
    {
      this.address=address;
    }
    public void setCompany(String company)
    {
      this.company=company;
    }
    public void setSal(int sal)
    {
      this.sal=sal;
    }
    public String getName()
    {
      return name;
    }
    public String getId()
    {
      return id;
    }
  }
  
  class Company{
    Smp smp[];
    int index;
    Company()
    {
      smp = new Smp[5];
      index = -1;

    }
    public int search(Smp e)
    {
      for(int i=0;i<=index;i++)
      {
        if(smp[i].equals(e))//if(e.equals(smp[i]))
        {
          return i;
        }
      }
      return -1;
    }


    public Smp deleteSmp(String id)
    {
      int oldId = search(new Smp(id));
      Smp e =null;
      if(oldId !=-1)
      {
        e = smp[oldId];
        for(int i=oldId;i<index;i++)
          {
            smp[i] = smp[i+1];
          }
          smp[index] = null;
          index--;
        }
            return e;
      }


      public void increaseArraySize()
      {
        Smp e[] = new Smp[smp.length+5];
        for(int i=0;i<=index;i++)
        {
          e[i] = smp[i];
        }
        smp = e;
      }


    public void add(Smp e)
    {
      if(index==smp.length-1)
      {
        increaseArraySize();
      }
      smp[++index]=e;
    }



   public String toString()
   {
    String s="";
    for(int i=0;i<=index;i++)
    {
      s+= ","+smp[i];
    }
    return "["+s.substring(1)+"]";
   }
}


class Best{
  public static void main(String[] args) {
    Company c = new Company();
    c.add(new Smp("Jaayuu","1200","1234566777","London","HCL",1200000));
    c.add(new Smp("Gungun","1300","1894624939","India","Vipro",1240000));
    c.add(new Smp("Jinuu","1400","6261112446","indore","TCS",130000000));
    c.add(new Smp("Piuu","12","264873648762","Sirpur"));
    System.out.println(c);
    System.out.println("Deleted:"+c.deleteSmp("12"));
    System.out.println(c);
  }

}
*/




class Hello{
  int a=10;
 // System.out.println(a);
     public void m1(){
		System.out.println("Hii");
	}
}

 class Hii extends Hello{
 	int a=20;
 	//System.out.println(a);
     public void m1(){
		System.out.println("Hello");
	}
}

 class Main5 {
 	public static void main(String[] args) {
 		Hello h=new Hii();
 		System.out.println(h.a);
 	   h.m1();
 	}
 }







// 3 DIMENSIAL ARRAYY>>>>>>>>>>>>>
 class City{
 	String cityName;
 	City(String name)
 	{
 		cityName = name;
 	}

 	public String toString()
 	{
 		return cityName;
 	}
 }


 class State{
 	String stateName;
 	City cityName[];
 	State()
 	{
 		cityName = new City[10];
 	}

 	public String toString()
 	{
 		String s = "";
 		for(City c : cityName)
 		{
 			if(c==null)
 				break;
 			else{
 				s= s+c+",";
 			}
 		}
 		return stateName+": "+s;
 	}
 }


class Country{
	String countryName;
	State stateName[];
	Country(){
		stateName = new State[10];
	}

	public String toString()
 	{
 		String s = "";
 		for(State c : stateName)
 		{
 			if(c==null)
 				break;
 			else{
 				s= s+c+",\n";
 			}
 		}
 		return countryName+"::\n  "+s;
 	}
} 




 class Test8{
 	public static void main(String[] args) {
 		Country c[] = new Country[3];
 		c[0] = new Country();
 		c[0].countryName = "India";
 		c[0].stateName[0] = new State();
 		c[0].stateName[0].stateName = "MP";
 		c[0].stateName[0].cityName[0] = new City("Indore");
 		c[0].stateName[0].cityName[1] = new City("Ujjain");

        
 		c[0].stateName[1] = new State();
 		c[0].stateName[1].stateName = "Rj";
 		c[0].stateName[1].cityName[0] = new City("Udaypur");
 		c[0].stateName[1].cityName[1] = new City("Jaipur");


 		c[0].stateName[2] = new State();
 		c[0].stateName[2].stateName = "UP";
 		c[0].stateName[2].cityName[0] = new City("Piku");
 		c[0].stateName[2].cityName[1] = new City("Niku	");


        c[1] = new Country();
 		c[1].countryName = "Australia";

        System.out.println(c[0]);
 	}
 }





 class Jinu{
 	void m1(int n,int m)
 	{
 		System.out.println("INTEGER");
 	}

    void m1(double n,int m)
 	{
 		System.out.println("double");
 	}

 	void m1(Object n,double m)
 	{
 		System.out.println("Object");
 	}

 	public static void main(String[] args) {
 		Jinu j=new Jinu();
 		j.m1(10,10.0);
 	}
 }
 


class Alpha{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			 if(j==1 || i==1 || i==n || j==n)
			 {
			 System.out.print(j + " ");
		}
		else {
			 	System.out.print("   ");
			 }
		}
		  System.out.println();
	  }
   }
}




class Jcp302{
	void m1(Object o){
		System.out.println("OBJECT");
	}

	void m1(A ob){
		System.out.println("A");
	}


	void m1(B ob){
		System.out.println("B");
	}

    
    void m1(C ob){  
		System.out.println("C");
	}


	void m1(D ob){
		System.out.println("D");
	}

	public static void main(String[] args) {
		new Jcp302().m1(null);
		System.out.println("JAYUUU\t");
	}
  class A{
  };
  class B extends A
  {
  };
  class C extends B
  {
  };
  class D extends C{
  };
 }





 class Jcp313{
 	public static void main(String[] args) {
 		new Jcp313().m2();
 	}

 	public void m1(){
 		//new Jcp.m2();
 	}

 	public static void m2(){
 		System.out.println("HAI");
 	}
 }



 class Sample10{
 	static void m1(byte b){
 		System.out.println("byte");
 	}

 	static void m1(Long a){
 		System.out.println("LONG");
 	}

 	public static void main(String[] args) {
 		m1((byte)10);
 	}
 }




 class Ambigiti{
 	static void  m1(int a,Integer b){
 		System.out.println("int ,Integer");
 	}

 	static void m1(Integer a,int b)
 	{
 		System.out.println("int,Integer");
 	}

 	public static void main(String[] args) {
 		//m1(1,2);
        m1(1,new Integer(10));
 	}
 }



 class Sampel26
 {
 	static void m1(int a,Long...l){
 		System.out.println("int,long");
 	}

 	static void m1(int a,Object o){
 		System.out.println("int,Object");
 	}

    static void m1(int...a){
    	System.out.println("...");
    }

    static void m1(Object ref){
    	System.out.println("Object");
    }

    public static void main(String[] args) {
    	m1(1,1L);
    	//m1(1,null);
    	m1(null);
    }
 }


 class Sampel27{
 	static void m1(int...a){
 		System.out.println("int...");
 	}

 	static void m1(int a,int...b){
 		System.out.println("int,int...b");
 	}

 	static void m1(Integer i){
 		System.out.println("Integer");
 	}
 	static void m1(Object ref){
 		System.out.println("Object");
 	}

 	public static void main(String[] args) {
 	   m1(10);	
 	}
 }


 class Sampel30{
 	static void fun(int a){
 		System.out.println("int");
 	}

 	static void fun(int[] a){
 		System.out.println("int[]");
 	}
 	public static void main(String[] args) {
 		int a[]={10,20};
 		fun(10);
 		fun(a);
 	}
 }



 class Sampel31{
 	static void m1(int ...a){
 		System.out.println("int");
 	}

 	static void m1(byte b){
 		System.out.println("byte");
 	}
     
    static void m1(Integer i){
 		System.out.println("Integer");
 	}

 	static void m1(Object ref){
 		System.out.println("Object");
 	}

 	static void m1(long ref){
 		System.out.println("long");
 	}

 	public static void main(String[] args) {
 		byte b=10;
 		int i=20;
 		int a[]=null;
 		m1(b);
 		m1(i);
 		m1(a);
 	}    
}



/*class Plus{
	public static void main(String[] args) {
		int sum=0;
		System.out.println("ENTER A NUMBER : ");
		//Scanner sc=new Scanner();
        int n = sc.nextInt();
          if(n >= 1)
          	System.out.println(n);
          else  if(n <= -1 )
           sum = sum +n;
          System.out.println(sum);
          
	}
}*/




 

