package LinkedList;

import java.util.Stack;

public class LinkedList {
	
	private Node head;
	
	public LinkedList()
	{
		head=null;
	}
	
	public boolean insert(int data)
	{
		Node newnode = new Node(data);
		
		if(newnode==null)
		{
			return false;
		}
		
		if(head==null)
		{
			head=newnode;
			return true;
		}
		
		Node temp = head;
		
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		
		temp.setNext(newnode);
		return true;
	}
	
	public void display()
	{
		Node temp = head;
		
		if(temp==null)
		{
			System.out.println("List is empty");
		}
		
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public void displayReverse()
	{
		Node temp = head;
		Stack <Node> s = new Stack<>();
		
		while(temp!=null)
		{
			s.push(temp);
			temp = temp.getNext();
		}
		
		while(!s.empty())
		{
			System.out.print(s.pop().getData()+" ");
		}
		System.out.println();
	}
	
	public boolean insertAtPosition(int data, int position)
	{
		Node newnode = new Node(data);
		
		if(position<=0 || (head==null && position>1))
		{
			return false;
		}
		
		if(position==1)
		{
			head = newnode;
			newnode.setNext(head);
			return true;
		}
		
		Node temp = head;
		
		for(int i = 1; i<position-1; i++)
		{
			temp = temp.getNext();
			
			if(temp==null)
			{
				return false;
			}	
		}
		newnode.setNext(temp.getNext());
		temp.setNext(newnode);
		return true;
		
	}
	
	public boolean delByVal(int data)
	{
		//Node temp = head;
		if(head==null)
		{
			return false;
		}
		
		if(head.getData()==data)
		{
			head = head.getNext();
			return true;
		}
		
		Node prev = head; Node del = head;
		
		while(del.getData()!=data)
		{
			prev=del;
			del = del.getNext();
			if(del==null)
			{
				return false;
			}
		}
		
		prev.setNext(del.getNext());
		return true;
		
	}

}
