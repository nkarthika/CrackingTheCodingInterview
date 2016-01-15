package linklist;

public class Node {

		 int data;
		 Node next;
		 
		  public Node(int d)
		  {
			  this.data=d;
			  
		  }
		  
		  public Object getData()
		  {
			  return this.data;
		  }
		  
		    public static Node push( int number, Node head)
		    {
		 	Node newNode = new Node(number);
		 	newNode.next = head;
		 	head = newNode;
            return head;
		    }
		 
}
