package LinkedList;

public class InsertValuesLinkedList {
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
		public void InsertFirst(int value)
		{
			Node NewNode=new Node(value);
			NewNode.next=head;
			head=NewNode;
			
				
}
		 void  Insertlast(int value)
		{
			 Node current=head;
			Node NewNode=new Node(value);
			if (head==null)
			{
				head=NewNode;
				return;
			}
			while(null!=current.next)
			{
			current=current.next;
			}
			current.next=NewNode;
		}
		 void InsertMiddle(int position,int value)
		 {
			 Node Newnode=new Node(value);
			if(position==1)
			{
				
				Newnode.next=head;
				head=Newnode;
			}
			else 
			{
				Node previous=head;
				int count=1;
				while(count<position-1)
				{
				previous=previous.next;
			count++;
			}
				Node current=previous.next;
				previous.next=Newnode;
				Newnode.next=current;
			}
		 }

	public static void main(String[] args)
	{
		InsertValuesLinkedList il=new	InsertValuesLinkedList();
		il.head=new Node(10);
		Node second=new Node(15);
		Node Third=new Node(9);
		Node Fourth =new Node(14);
		il.head.next=second;
		second.next=Third;
		Third.next=Fourth;
		il.InsertFirst(7);
		il.InsertFirst(34);
		il.InsertFirst(78);
		il.Insertlast(56);
		il.Insertlast(67);
		il.InsertMiddle(3,2);
		il.Display();
	
		
		
	}
}
