package linkedlist;

/**
	 * Given pointer to the head node of a linked list, the task is to reverse the linked list. 
	 * We need to reverse the list by changing links between nodes.
	
	Examples:
	
	Input : Head of following linked list  
	       1->2->3->4->NULL
	Output : Linked list should be changed to,
	       4->3->2->1->NULL
	
	Input : Head of following linked list  
	       1->2->3->4->5->NULL
	Output : Linked list should be changed to,
	       5->4->3->2->1->NULL
	
	Input : NULL
	Output : NULL
	
	Input  : 1->NULL
	Output : 1->NULL
 * @author saikatkar1
 *
 */
public class ReverseLinkedListIteratively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addFirst(6);
		myList.addFirst(7);
		myList.addFirst(8);
		myList.addFirst(9);
		myList.addFirst(10);
		myList.addFirst(11);	
		
		myList.printList();
		reverseList(myList);
		myList.printList();
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void reverseList(MyLinkedList myList) {
		
		MyLinkedList.Node curr = myList.getHeadNode();
		MyLinkedList.Node next = null;
		MyLinkedList.Node prev = null;
		
		while(curr!=null) {
			
			next = curr.next;
			
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		myList.setHeadNode(prev);
		
	}

}
