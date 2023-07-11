package LinkedList;



public class DeleteNodeLinkedList {
	private Node head;
	static class Node{
			int data;
			 Node next;
			public Node(int d)
			{
				
			data=d;
			next=null;
			}
	}

			void   Display()
			{
				Node current=head;
				while(current!=null)
				{
				System.out.print(current.data+"->");
				current=current.next;
				}
				System.out.println("null");
}
			public Node Delete()
			{
			if(head==null)
			{
				return null;
			}
			else
			{
			Node temp=head;
			head=head.next;
			temp.next=null;
			return temp;
			}
			}


public static void main(String[] args)
{
	DeleteNodeLinkedList il=new	DeleteNodeLinkedList();
	il.head=new Node(10);
	Node second=new Node(15);
	Node Third=new Node(9);
	Node Fourth =new Node(14);
	il.head.next=second;
	second.next=Third;
	Third.next=Fourth;
	il.Display();
}
}

