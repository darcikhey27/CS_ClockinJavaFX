package application;

// TODO: below
// keep working on this student class
// but make it more modeular
public class Student
{
	private class Node
	{
		Object data;
		Node next;
		
		public Node(Object newData)
		{
			this.data = newData;
		}
		
		public Node(Object newData, Node nextNode)
		{
			this.data = newData; 
			this.next = nextNode;
		}
	}// end Node class
	
	private Node head;
	private int size;
	
	private Student()
	{
		size = 0;
		head = null;
	}

}
