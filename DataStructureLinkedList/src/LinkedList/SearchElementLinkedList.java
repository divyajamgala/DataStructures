package LinkedList;


public class SearchElementLinkedList {

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
	boolean Search(int Key)
	{
		Node current=head;
		
		while(current!=null) {	
		if(current.data==Key)
		{
		return true;
		}
		current=current.next;
		}
return false;
	}

	class divya{

	public static void main(String[]args)
	{
		
		SearchElementLinkedList ll=new SearchElementLinkedList();
      ll.head =new Node(10);
	Node second=new Node(3);
	Node third=new Node(6);
	Node fourth=new Node(8);
	ll.head.next=second;
	second.next=third;
	third.next=fourth;
	Boolean res=ll.Search(6);
	System.out.println(res);
	

ll.display();
	}
	}
}
