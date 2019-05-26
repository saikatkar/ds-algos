package linkedlist;

/**
 * Reverse a Linked List in groups of given size | Set 1
Given a linked list, write a function to reverse every k nodes (where k is an input to the function).

Example:
Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3 
Output:  3->2->1->6->5->4->8->7->NULL. 

Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
Output:  5->4->3->2->1->8->7->6->NULL. 
 * @author saikatkar1
 *
 */
public class LinkListReverseGroupKRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addFirst(1);
		myList.addLast(2);
		myList.addLast(3);
		myList.addLast(4);
		myList.addLast(5);
		myList.addLast(6);
		myList.addLast(7);
		myList.addLast(8);
		
		myList.printList();
		int k =1;
		myList.setHeadNode(reverseList( k,myList.getHeadNode()));
		myList.printList();

	}
	
	public static <E> MyLinkedList.Node<E> reverseList(int k,MyLinkedList.Node<E> head) {
		
		//MyLinkedList.Node<E> head = myList.getHeadNode();
		//myList.setHeadNode(head);
		MyLinkedList.Node<E> curr = head;
		MyLinkedList.Node<E> next = null;
		MyLinkedList.Node<E> prev = null;
		int i =0;
		while(curr!=null && i<k) {
				
				next = curr.next;
				
				curr.next = prev;
				
				prev = curr;
				curr = next;
				i++;
			}
			if(next!=null) {
				//myList.setHeadNode(next);
				head.next = reverseList(k,next);
			}
		//myList.setHeadNode(prev);
			return prev;
	}

}
