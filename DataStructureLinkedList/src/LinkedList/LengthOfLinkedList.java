package LinkedList;

public class LengthOfLinkedList {
	public Node head;
static class Node{
	 Node head;
	 int data;
	 Node next;
	public Node(int d)
	{
		data=d;
		next=null;
	}
}
	void display()
	{
	
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	

public int length()
{
	if(head==null)
	{
		return 0;
	}
	int count=0;
	Node current=head;
	while(current!=null)
	{
		count++;
		current=current.next;
	}
	return count;
}

	public static void main(String[]args)
	{
		
	LengthOfLinkedList ll=new LengthOfLinkedList();
      ll.head =new Node(10);
	Node second=new Node(3);
	Node third=new Node(6);
	Node fourth=new Node(8);
	ll.head.next=second;
	second.next=third;
	third.next=fourth;

ll.display();
int res=ll.length();
System.out.println(res);
	
	
	
	}

}
