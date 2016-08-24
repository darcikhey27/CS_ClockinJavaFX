package student;

public class StudentLinkedList implements ListInterface
{
	private class Node
	{
		private Object item; // the data
		private Node next; // the next node i'm linked to

		// this will be the head
		public Node(Object newItem)
		{
			this.item = newItem;
			this.next = null;
		}

		public Node(Object newItem, Node nextNode)
		{
			this.item = newItem;
			this.next = nextNode;
		}

		public Object getItem()
		{
			return this.item;
		}

		public void setItem(Object newItem)
		{
			this.item = newItem;
		}

		public Node getNext()
		{
			return this.next;
		}

		public void setNext(Node nextNode)
		{
			this.next = nextNode;
		}

		public String toString()
		{
			return this.getItem().toString();
		}
	}

	//////////////////////////////////////
	
	private Node head;
	private int numItems;

	public StudentLinkedList() 
	   {
	      head = null;
	      numItems = 0;
	   }

	
	public boolean isEmpty()
	{
		return numItems == 0;
	}

	
	public int getSize()
	{
		return numItems;
	}

	
	public void addNode(Object newItem)
	{
		Node newNode = new Node(newItem);
		Node curr;

		if (isEmpty())
		{
			this.head = newNode;
		} else
		{
			for (curr = head; curr.getNext() != null; curr = curr.getNext());
			{
				curr.setNext(newNode);
			}
		}
		numItems++;
	}

	public void addNode(int index, Object newItem)
	{
		Node newNode = new Node(newItem);
		Node prev;
		if (index == 0)
		{
			newNode.setNext(head);
			this.head = newNode;
		} else
		{
			prev = find(index - 1);
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		}
		numItems++;
	}

	public void removeNode(int index)
	{
		// Special case!!!!!!!!!!!!!!!!!!!!!!!!
		if (index == 0)
		{
			head = head.getNext();
		} else
		{
			Node prev = find(index - 1);
			Node curr = prev.getNext();
			prev.setNext(curr.getNext());
		}
		numItems--;
	}

	public void removeAll()
	{
		this.head = null;
		numItems = 0;
	}

	private Node find(int index)
	{
		Node curr = head;
		for (int skip = 1; skip < index; skip++)
		{
			curr = curr.getNext();
		}
		return curr;
	}

	
	public String toString()
	{
		String result = "";
		for (Node curr = this.head; curr != null; curr = curr.getNext())
		{
			result = result + curr.getItem().toString() + "\n";
		}
		return result;
	}

}
