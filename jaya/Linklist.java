class Node {
	Object value;
	Node next;
	Node(Object value){
		this.value=value;
		next=null;
	}
}
class LinkList{
	Node head,tail;
	public void addAtfrist(Object val){
 
		Node newNode=new Node(val);
		if(head==null){
			head=tail=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}

	public void addAtLast(Object val){
		
		Node newNode=new Node(val);
		if(head== null){
			head=tail=newNode;
			// addAtfrist(val);
		}
		else{

			tail.next=newNode;
			tail=newNode;
		}
	}


	public void addAtAnyPos(Object val,int pos){
		int c=1;
		Node temp=head;																								
		if(pos==1||head==null||pos<=0){
			addAtfrist(val);
			return ;
		}
		Node newNode=new Node(val);
		while(c++<pos-1&&temp.next!=null){
			temp=temp.next;
		}
		if(temp.next==null){
			temp.next=newNode;
			tail=newNode;
		}
		else{
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
	

	public Object deleteAtfrist(){
		//Node temp=head;
		Object ob=head.value;
		head=head.next;
		return ob;
	}

	public Object deleteAnyPos(int pos){
		Object ob=head.value;
		if(pos<=0){
			return null;
		}
		Node temp=head;
		int c=1;
		while(c++<pos-1)
		{
		  temp=temp.next;
		}
		Node t=temp.next;
		ob=t.value;
		temp.next=t.next;
		return ob;
    }


    public Object indexOf( Object values){
    	Node temp = head;
    	int index=0;
    	while(temp!=null)
    	{
    		if(temp.value==values){
    		    return index;
    	  }
    		temp=temp.next;
    		index++;
    	}
    	return -1;
    }


   /* public int indexOf(Object val) {
		Node temp = head;

		if (head == null)
			return -1;

		if (val == head.value)
			return 0;

		int c = 0;
		while (temp.next != tail.next) {
			temp = temp.next;
			c++;

			if (temp.value == val)
				return c;

		}
		if (temp == tail) {
			return -1;
		}

		return c;
	}
*/
	public Object valueOf(int  ) {
		Node temp = head;
		if (head == null)
			return null;

		if (index == 0) {
			return head.value;
		}

		int c = 0;
		while (c++ < index) {
			if (temp.next == null) {
				return null;
			}

			temp = temp.next;
		}

		return temp.value;
	}


	/*public void addAtfrist(LinkList list)
    {
      Node temp =list.head;
      // int pos=0;
      System.out.println(temp.value);
      while(temp!=null){
        addAtfrist(temp.value);
        temp=temp.next;
      }

    }
  LinkList(){}
  LinkList(LinkList list){
    addAtfrist(list);
  }

*/	
	
	public String toString(){
		String s="";
		Node temp =head;
		if(temp==null){
			return "[]";
		}
		while(temp!=null){
			s=s+","+temp.value;
			temp=temp.next;
		}
		return "["+s.substring(1)+"]";
	}
}


class Test{
	public static void main(String[] args) {
		LinkList list=new LinkList();
		list.addAtfrist(10);
		//list.addAtAnyPos(20,0);
		list.addAtfrist(20);
		System.out.println(list);
		LinkList list1=new LinkList(list);
		// list1.addAtfrist(list);
		list1.addAtfrist(40);
		//System.out.println(list1);
		list1.addAtfrist(50);
		list1.addAtfrist(60);
		list1.addAtfrist(70);
		System.out.println(list1);

		//list.addAtLast(40);
		//System.out.println(list.deleteAnyPos(0));
		// System.out.println(list.deleteAtfrist());
		// System.out.println(list.deleteAtfrist());
		/*System.out.println(list.indexOf(20));
		System.out.println(list.valueOf(3));*/
		// System.out.println(list);
	}
}