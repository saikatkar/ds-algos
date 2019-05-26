package linkedlist;

/**
 * Given a linked list, write a function to reverse every alternate k nodes
 *  (where k is an input to the function) in an efficient way. Give the complexity of your algorithm.

	Example:
	Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
	Output:   3->2->1->4->5->6->9->8->7->NULL. 
 * @author saikatkar1
 *
 */
public class KAltReverseLinkedList {

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
		int k =2;
		myList.setHeadNode(kAltReverse( k,myList.getHeadNode()));
		myList.printList();

	}
	
public static <E> MyLinkedList.Node<E> kAltReverse(int k,MyLinkedList.Node<E> head) {
		
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
		if(head!=null) {
			head.next = curr;
		}
		int count =0;
		while(curr!=null && count<k-1) {
			curr = curr.next;
			count++;
		}
		
		if(curr!=null) {
			//myList.setHeadNode(next);
			curr.next = kAltReverse(k,curr.next);
		}
	//myList.setHeadNode(prev);
		return prev;
	}

}
