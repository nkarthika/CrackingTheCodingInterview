package linklist;


public class KthtoLast {

	public static void main(String args[]) {
	
		Node head=null;  //Good implementation without list class, just with node class
		
		//But keep returning head and change it, since no list class to hold head.
		
		head = Node.push( 12, head);
		head = Node.push( 13, head);
		head = Node.push( 14, head);
		head = Node.push( 4, head);
		head = Node.push( 3, head);
		head = Node.push( 2, head);
	

		Node result = findK (head, 7);
	 	System.out.printf("It is ", result.data);
}


public static void push( int number, Node head)
{
	Node newNode = new Node(number);
	newNode.next = head;
	head = newNode;

}

  public static  Node findK (Node head, int num) {
	 
    	if(num<0) return null;
    	  
    	Node leader = head;
    	Node follower = head;
    	
    	for (int i=0; i<num; i++) {
    		if(leader.next==null) 	 
    			{ 
    			System.out.printf("Returning head, There is no %dth item from last\n", num);
    			return head;
    			}   
    		leader=leader.next;
    		
    	}
    	
    	while(leader.next!=null) {
    		leader = leader.next;
    		follower=follower.next;
    	}
    	
    	return follower;
  }
  
