package LinkedList;



public class DeleteParticularElementLinkedList {

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
			public void ParDelete(int position,int value)
			{
			if(position==1)
			{
				head=head.next;
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
				previous.next=current.next;
				
			}
			}
			public Node Deletelast()
			{
				Node current=head;
				Node previous=head;
				while(current.next!=null)
				{
					previous=current;
				current=current.next;	
				}
				previous.next=null;
				return current;
			}


public static void main(String[] args)
{
	DeleteParticularElementLinkedList il=new	DeleteParticularElementLinkedList();
	il.head=new Node(10);
	Node second=new Node(15);
	Node Third=new Node(9);
	Node Fourth =new Node(14);
	il.head.next=second;
	second.next=Third;
	Third.next=Fourth;
	//il.ParDelete(3, 9);
	il.Deletelast();
	il.Display();
}
}
