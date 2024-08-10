class Test
{
    public int hashCode()
    {
    return 10;
    }
   public static void main(String[] args)
   {
   String s="xyz";
   Test t=new Test();
   Test t1=new Test();
System.out.println(t);
System.out.println(t1);
System.out.println(t1.hashCode());
System.out.println(t.hashCode());
   }
}