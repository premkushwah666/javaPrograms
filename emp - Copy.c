import java.io.*;
class Node
{
 private Object data;
 private Node next;
 Node(Object data)
 {
   this.data=data;
   next=null;
 }
 public boolean equals(Object val)
 {
   return this.data.equals(val);
 }
 public void setData(Object data)
 {
   this.data=data;
 }
 public void setNext(Node next)
 {
   this.next=next;
 }
 public Object getData()
 {
   return data;
 }
 public Node getNext()
 {
   return next;
 }
};

class Linklist
{
  Node start=null;
  Node tail=null;

  public boolean addAtFirst(Object data)
   {
     Node temp=new Node(data);
     if(start== null)
     {
       tail=start=temp;
     }
     else
     {
       temp.setNext(start);
       start=temp;
       tail.setNext(temp);
     }
      return true;
  }


 public void print()
   {
     Node t=start;
     while(t!=tail)
      {
        System.out.print(t.getData()+"->");
        t=t.getNext();
      }
     System.out.print(t.getData());
   }

 public void search(Object data)
 {
   Node t=start;
   while(t!=tail)
   {
     if(t.getData().equals(data))
     {
       System.out.print(t.getData());
     }
     t=t.getNext();
   }
   if(t.getData().equals(data))
    System.out.print(t.getData());
 }
}

class test
{
  public static void main(String[] args)
  {
    Linklist t=new Linklist();
    t.addAtFirst(400);
    t.addAtFirst(300);
    t.addAtFirst(200);
    t.addAtFirst(100);
    t.print();
    System.out.println();
    t.search(300);
  }
}
