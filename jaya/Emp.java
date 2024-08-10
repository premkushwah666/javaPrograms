class Smp
{
  private String name,id,mob,address,company;
  private int sal;


  Smp(String name,String id,String mob,String address,String company,int sal)
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
    System.out.println("Deleted Data:"+c.deleteSmp("12"));
    System.out.println();
    System.out.println(c);
  }
}


