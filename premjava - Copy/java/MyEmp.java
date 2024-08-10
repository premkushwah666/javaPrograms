class Emp 
{
  private int id;
  private String name;

  Emp(int id,String name)
  {
 	  this.id=id;
 	  this.name=name;
  }
  Emp(){}

  public void setId(int id)
  {
      this.id = id;
  }

  public int getId()
  {
      return this.id;
  }

  public void setName(String name)
  {
      this.name = name;
  }

  public String getName()
  {
      return this.name;
  }

  //@Override toString
  public String toString()
  {
  	return "Id is = "+id+"\nName is = "+name;
  }

  //@override hashcode
  public int hashCode()
  {
  	return id;
  }

  //@override equals
  public boolean equals(Object ob)
  {
  	try
  	{
  		Emp e = (Emp)ob;

    if(id==e.getId() && name.equals(e.getName()))
    	return true;
    else
    	return false;

  	}catch(Exception e){
  		return false;
  	}
  }


}//end of class Emp

class MyEmp
{
	public static void main(String[] args) {
		Emp obj1 = new Emp(1,"prem");
		Emp obj2 = new Emp(2,"jaya");
		Emp obj3 = new Emp(1,"prem");
		Emp obj4 = obj1;

       //toString 
	  // System.out.println(obj1);
	  // System.out.println(obj2);

       //hashCode
	   // System.out.println(obj1.hashCode());
	   // System.out.println(obj2);
         
         //equals** 
		// System.out.println(obj1.equals(obj2));//flase
		// System.out.println(obj1.equals(obj3));//true
		// System.out.println(obj1.equals(obj4));//true

		// System.out.println(obj1.getClass);//class Emp


	}
}